const puppeteer = require("puppeteer");
const expect = require("chai").expect;
const TARGET_URL =
  "https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation/cancel/0";

(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  await page.setRequestInterception(true);
  page.on("request", (request) => {
    request.continue({
      method: "PUT",
      headers: request.headers,
    });
  });
  await page.goto(TARGET_URL);
  const content = await page.content();
  console.log(content);
  await expect(content).to.include("Cancel reservation request accepted.");
  await browser.close();
})();
