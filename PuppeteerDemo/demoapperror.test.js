const puppeteer = require("puppeteer");
const expect = require("chai").expect;
const { faker } = require("@faker-js/faker");
const url = "https://demo-app-fe.vercel.app/";
(async () => {
  const browser = await puppeteer.launch({
    headless: false,
  });
  const page = await browser.newPage();

  //const firstName = await faker.name.firstName();
  //const lastName = await faker.name.lastName();
  //const randomEmail = await faker.internet.email();

  await page.goto(url);

  await page.setViewport({ width: 1920, height: 1080 });

  await page.waitForSelector(
    ".rs-form > .rs-form-group > .rs-picker-date > .rs-btn > .rs-picker-toggle-value"
  );
  await page.click(
    ".rs-form > .rs-form-group > .rs-picker-date > .rs-btn > .rs-picker-toggle-value"
  );

  await page.waitForSelector(
    "div > .rs-picker-toolbar > .rs-picker-toolbar-ranges > .rs-picker-toolbar-option:nth-child(1) > span"
  );
  await page.click(
    "div > .rs-picker-toolbar > .rs-picker-toolbar-ranges > .rs-picker-toolbar-option:nth-child(1) > span"
  );

  await page.waitForSelector(
    ".rs-content > .rs-form > .rs-form-group:nth-child(3) > .rs-picker-input > .rs-btn"
  );
  await page.click(
    ".rs-content > .rs-form > .rs-form-group:nth-child(3) > .rs-picker-input > .rs-btn"
  );

  await page.waitForSelector(
    "body > .rs-picker-menu > .rs-picker-select-menu-items > div > .rs-picker-select-menu-item-focus"
  );
  await page.click(
    "body > .rs-picker-menu > .rs-picker-select-menu-items > div > .rs-picker-select-menu-item-focus"
  );

  // Click a[role="combobox"]:has-text("Select")

  await page.waitForXPath("//a[@name='seatId']");
  let elHandle = await page.$x("//a[@name='seatId']");
  await elHandle[0].click();

  // Click text=Coach 1 / Seat 10
  await page.waitForXPath("//a[.= 'Coach 1 / Seat 10']");
  let elHandleS = await page.$x("//a[.= 'Coach 1 / Seat 10']");
  await elHandleS[0].click();

  await page.waitForSelector(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(5) > .rs-input"
  );
  await page.click(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(5) > .rs-input"
  );
  // await page.type('input[name=search]', 'Adenosine triphosphate');
  //   await page.$eval(
  //     ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(5) > .rs-input",
  //     (el) => (el.value = "Puppet")
  //   );
  await page.focus(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(5) > .rs-input"
  );
  await page.keyboard.type(faker.name.firstName());

  await page.waitForSelector(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(6) > .rs-input"
  );
  await page.click(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(6) > .rs-input"
  );
  //   await page.$eval(
  //     ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(6) > .rs-input",
  //     (el) => (el.value = "Teer")
  //   );
  await page.focus(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(6) > .rs-input"
  );
  await page.keyboard.type(faker.name.lastName());

  await page.waitForSelector(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(7) > .rs-input"
  );
  await page.click(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(7) > .rs-input"
  );
  //   await page.$eval(
  //     ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(7) > .rs-input",
  //     (el) => (el.value = "pupteer@seznam.cz")
  //   );
  await page.focus(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(7) > .rs-input"
  );
  await page.keyboard.type("fakePuppet");
  await page.waitForSelector(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(7) > .rs-input"
  );
  await page.click(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(7) > .rs-input"
  );
  await page.waitForSelector(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(8) > .rs-input"
  );
  const elementHandle = await page.$(
    ".rs-container > .rs-content > .rs-form > .rs-form-group:nth-child(8) > .rs-input"
  );
  await elementHandle.uploadFile(
    "C:\\Users\\oslaksam\\Documents\\CODENOW\\SeleniumDemo\\randomFile.bibtex"
  );

  await page.waitForSelector(
    ".rs-content > .rs-form > .rs-form-group > .rs-btn-toolbar > .rs-btn-primary"
  );
  page.on("dialog", async (dialog) => {
    console.log(dialog.message());
    await expect(dialog.message()).to.not.equal(
      "Reservation created successfully"
    );
    await dialog.accept();
  });
  await page.click(
    ".rs-content > .rs-form > .rs-form-group > .rs-btn-toolbar > .rs-btn-primary"
  );

  await browser.close();
  //add an alert check or something brou
})();
