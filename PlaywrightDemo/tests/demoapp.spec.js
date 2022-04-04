const { test, expect } = require("@playwright/test");
const { faker } = require("@faker-js/faker");

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
});
