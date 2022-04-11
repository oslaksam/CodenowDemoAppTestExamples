const puppeteer = require("puppeteer");
const expect = require("chai").expect;
const { faker } = require("@faker-js/faker");
const TARGET_URL =
  "https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation";

(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  const POST_JSON = {
    date: "2022-03-21T02:24:59.815Z",
    email: faker.internet.email(),
    firstName: faker.name.firstName(),
    lastName: faker.name.lastName(),
    seatId: "1-21",
    trainId: "ICE-575",
  };
  await page.setRequestInterception(true);
  page.on("request", (request) => {
    /*request.continue({
      method: "POST",
      postData: JSON.stringify(POST_JSON),
      headers: request.headers,
    });*/
    let data = {
      method: "POST",
      postData: JSON.stringify(POST_JSON),
    };

    // Request modified... finish sending!
    request.continue(data);
  });
  const res = await page.goto(TARGET_URL);
  const content = await res.text();
  console.log(content);
  await expect(content).to.include("Reservation accepted.");
  await browser.close();
})();
