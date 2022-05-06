const { test, expect } = require("@playwright/test");
const { faker } = require("@faker-js/faker");
test.describe.configure({ mode: "serial" });
var firstName = "";
var lastName = "";
var randomEmail = "";

test.beforeEach(async ({ page }) => {
  // Go to https://demo-app-fe.vercel.app/ before each test
  await page.goto("https://demo-app-fe.vercel.app/");
  await expect(page).toHaveTitle(/React App/);
  firstName = faker.name.firstName();
  lastName = faker.name.lastName();
  randomEmail = faker.internet.email();
});

test("Create a reservation", async ({ page }) => {
  // Click text=✕
  await page.locator("text=✕").click();

  // Click a[role="combobox"]:has-text("YYYY-MM-DD")
  await page.locator('a[role="combobox"]:has-text("YYYY-MM-DD")').click();

  // Click a[role="button"]:has-text("Today")
  await page.locator('a[role="button"]:has-text("Today")').click();

  // Click text=TrainSelect >> a[role="combobox"]
  await page.locator('text=TrainSelect >> a[role="combobox"]').click();

  // Click text=IC 879 Hamburg
  await page.locator("text=IC 879 Hamburg").click();

  // Click a[role="combobox"]:has-text("Select")
  await page.locator('a[role="combobox"]:has-text("Select")').click();

  // Click text=Coach 1 / Seat 10
  await page.locator("text=Coach 1 / Seat 10").click();

  // Click [placeholder="Tony"]
  await page.locator('[placeholder="Tony"]').click();

  // Fill [placeholder="Tony"]
  await page.locator('[placeholder="Tony"]').fill(firstName);

  // Click [placeholder="Smith"]
  await page.locator('[placeholder="Smith"]').click();

  // Fill [placeholder="Smith"]
  await page.locator('[placeholder="Smith"]').fill(lastName);

  // Click [placeholder="tony\.smith\@gmail\.com"]
  await page.locator('[placeholder="tony\\.smith\\@gmail\\.com"]').click();

  // Fill [placeholder="tony\.smith\@gmail\.com"]
  await page
    .locator('[placeholder="tony\\.smith\\@gmail\\.com"]')
    .fill(randomEmail);

  // const elementHandle = await page.$(
  //   ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(8) > .rs-input"
  // );
  // await elementHandle.uploadFile(
  //   "C:\\Users\\oslaksam\\Documents\\CODENOW\\SeleniumDemo\\randomFile.bibtex"
  // );
  // Note that Promise.all prevents a race condition
  // between clicking and waiting for the file chooser.
  const [fileChooser] = await Promise.all([
    // It is important to call waitForEvent before click to set up waiting.
    page.waitForEvent("filechooser"),
    // Opens the file chooser.
    page
      .locator(
        ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(8) > .rs-input"
      )
      .click(),
  ]);
  await fileChooser.setFiles(
    "C:\\Users\\oslaksam\\Documents\\CODENOW\\SeleniumDemo\\randomFile.bibtex"
  );
  // Click text=Submit
  page.once("dialog", (dialog) => {
    console.log(`Dialog message: ${dialog.message()}`);
    expect(dialog.message()).toBe("Reservation created successfully");
    dialog.accept().catch(() => {});
  });
  await page.locator("text=Submit").click();
  page.on("dialog", async (dialog) => {
    expect(dialog.message()).toBe("Reservation created successfully");
    await dialog.accept();
  });
  await page.close({ runBeforeUnload: true });
});
test("Get the reservations and cancels the first one", async ({ page }) => {
  // Click text=Get Reservations
  page.once("dialog", (dialog) => {
    console.log(`Dialog message: ${dialog.message()}`);
    expect(dialog.message()).toContain("success");
    dialog.accept().catch(() => {});
  });
  await page.locator("text=Get Reservations").click();
  await page.waitForSelector("tr:nth-child(1) button", { timeout: 2000 });
  //Click text=Tue Apr 05 2022 Cancel Reservation >> button
  page.once("dialog", (dialog) => {
    console.log(`Dialog message: ${dialog.message()}`);
    expect(dialog.message()).toContain("success");
    dialog.accept().catch(() => {});
  });
  await page.locator("tr:nth-child(1) button").click();
  await page.waitForSelector(
    ".App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7)",
    { timeout: 2000 }
  );
  // Double click td:nth-child(7) >> nth=0
  await expect(
    page.locator(
      ".App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7)"
    )
  ).toHaveText("CANCELED");
});
test("Try to create a reservation but enter a wrong email", async ({
  page,
}) => {
  // Click text=✕
  await page.locator("text=✕").click();

  // Click a[role="combobox"]:has-text("YYYY-MM-DD")
  await page.locator('a[role="combobox"]:has-text("YYYY-MM-DD")').click();

  // Click a[role="button"]:has-text("Today")
  await page.locator('a[role="button"]:has-text("Today")').click();

  // Click text=TrainSelect >> a[role="combobox"]
  await page.locator('text=TrainSelect >> a[role="combobox"]').click();

  // Click text=IC 879 Hamburg
  await page.locator("text=IC 879 Hamburg").click();

  // Click a[role="combobox"]:has-text("Select")
  await page.locator('a[role="combobox"]:has-text("Select")').click();

  // Click text=Coach 1 / Seat 10
  await page.locator("text=Coach 1 / Seat 10").click();

  // Click [placeholder="Tony"]
  await page.locator('[placeholder="Tony"]').click();

  // Fill [placeholder="Tony"]
  await page.locator('[placeholder="Tony"]').fill(firstName);

  // Click [placeholder="Smith"]
  await page.locator('[placeholder="Smith"]').click();

  // Fill [placeholder="Smith"]
  await page.locator('[placeholder="Smith"]').fill(lastName);

  // Click [placeholder="tony\.smith\@gmail\.com"]
  await page.locator('[placeholder="tony\\.smith\\@gmail\\.com"]').click();

  // Fill [placeholder="tony\.smith\@gmail\.com"]
  await page
    .locator('[placeholder="tony\\.smith\\@gmail\\.com"]')
    .fill("wrongEmail");

  // Note that Promise.all prevents a race condition
  // between clicking and waiting for the file chooser.
  const [fileChooser] = await Promise.all([
    // It is important to call waitForEvent before click to set up waiting.
    page.waitForEvent("filechooser"),
    // Opens the file chooser.
    page
      .locator(
        ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(8) > .rs-input"
      )
      .click(),
  ]);
  await fileChooser.setFiles(
    "C:\\Users\\oslaksam\\Documents\\CODENOW\\SeleniumDemo\\randomFile.bibtex"
  );
  // Click text=Submit
  page.once("dialog", (dialog) => {
    console.log(`Dialog message: ${dialog.message()}`);
    expect(dialog.message()).not.toBe("Reservation created successfully");
    dialog.dismiss().catch(() => {});
  });
  await page.locator("text=Submit").click();
  page.on("dialog", async (dialog) => {
    console.log(`Dialog message: ${dialog.message()}`);
    expect(dialog.message()).not.toBe("Reservation created successfully");
    dialog.accept().catch(() => {});
  });
  await page.close({ runBeforeUnload: true });
});
