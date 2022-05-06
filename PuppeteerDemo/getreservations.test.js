const puppeteer = require("puppeteer");
const url = "https://demo-app-fe.vercel.app/";
const expect = require("chai").expect;
(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();

  await page.goto(url);

  await page.setViewport({ width: 1920, height: 1080 });

  await page.waitForSelector(
    "#root > .rs-container > .rs-content > .App-reservations-view > button"
  );

  await page.on("dialog", async (dialog) => {
    console.log(dialog.message());
    await expect(dialog.message()).to.contain("success");
    await dialog.accept();
  });
  await page.click(
    "#root > .rs-container > .rs-content > .App-reservations-view > button"
  );

  await page.waitForSelector(
    ".App-reservations-view-table > .App-reservations-view-table > tr:nth-child(1) > .App-reservations-view-table > button"
  );
  /*page.on("dialog", async (dialog) => {
    console.log(dialog.message());
    await expect(dialog.message()).to.equal(
      "Reservation canceled successfully."
    );
    await dialog.accept();
  });*/
  await page.click(
    ".App-reservations-view-table > .App-reservations-view-table > tr:nth-child(1) > .App-reservations-view-table > button"
  );
  /*
  page.on("dialog", async (dialog) => {
    console.log(dialog.message());
    await expect(dialog.message()).to.equal(
      "Get reservations view is successful"
    );
    await dialog.accept();
  });*/
  await page.waitForSelector(
    ".App-reservations-view > .App-reservations-view-table > .App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7)"
  );
  await page.click();
  const elem = await page.waitForSelector(
    ".App-reservations-view > .App-reservations-view-table > .App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7)"
  );
  const val = await elem.evaluate((el) => el.textContent);
  await expect(val).to.equal("CANCELED");
  await browser.close();
})();
