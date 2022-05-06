const puppeteer = require("puppeteer");
const expect = require("chai").expect;
const TARGET_URL =
  "https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation";

(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  await page.goto(TARGET_URL);
  const content = await page.content();
  console.log(content);
  await expect(content).to.include("id");
  await browser.close();
})();
