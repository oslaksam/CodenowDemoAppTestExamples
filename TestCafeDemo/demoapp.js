import { Selector } from "testcafe";
const { faker } = require("@faker-js/faker");
import XPathSelector from "./xpathselector";
var firstName = "";
var lastName = "";
var randomEmail = "";

fixture`Demo app test`.page`https://demo-app-fe.vercel.app/`;

test("Reservation create test", async (t) => {
  firstName = await faker.name.firstName();
  lastName = await faker.name.lastName();
  randomEmail = await faker.internet.email();
  let randomValue = await Math.floor(Math.random() * (4 - 1 + 1) + 1);

  // await t
  //   .setNativeDialogHandler((type, text, url) => {
  //     if (type === "confirm")
  //       return expect(text).eql("Reservation created successfully");
  //     else if (type === "prompt")
  //       expect(text).eql("Reservation created successfully");
  //     return expect(text).eql("Reservation created successfully");
  //   });
  await t.setNativeDialogHandler((type, text, url) => {
    if (text === "Reservation created successfully") return true;
    return false;
  });
  await t
    .click(".rs-picker-toggle-value")
    .click(
      "div > .rs-picker-toolbar > .rs-picker-toolbar-ranges > .rs-picker-toolbar-option:nth-child(1) > span"
    );
  const select = await XPathSelector("//a[.='Select']");
  await t
    .click(select)
    .click("div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item");
  const seat = await XPathSelector("//a[@name='seatId']");
  await t
    .click(seat)
    .click("div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item");
  randomValue = await Math.floor(Math.random() * (7 - 1 + 1) + 1);
  await t
    .click(Selector("input").withAttribute("name", "firstName"))
    .typeText(Selector("input").withAttribute("name", "firstName"), firstName)
    .click(Selector("input").withAttribute("name", "lastName"))
    .typeText(Selector("input").withAttribute("name", "lastName"), lastName)
    .click(Selector("input").withAttribute("name", "email"))
    .typeText(Selector("input").withAttribute("name", "email"), randomEmail)
    .setFilesToUpload(Selector("input").withAttribute("name", "file"), [
      "./randomFile.bibtex",
    ]);
  const submit = await XPathSelector("//button[contains(.,'Submit')]");
  await t.click(submit);
  await t.wait(1001);
  //need to add and alert wait and check

  //   const articleHeader = await Selector(".result-content").find("h1");
  //   // Obtain the text of the article header
  //   let headerText = await articleHeader.innerText;
  //   //Use the assertion to check if the actual header text is equal to the expected one
  //   await headerText
  //     .expect(Selector("#article-header").innerText)
  //     .eql("Thank you, John Smith!");
});

test("Reservation email not working", async (t) => {
  firstName = await faker.name.firstName();
  lastName = await faker.name.lastName();
  randomEmail = await faker.internet.email();
  let randomValue = await Math.floor(Math.random() * (4 - 1 + 1) + 1);
  await t.setNativeDialogHandler((type, text, url) => {
    if (text === "Reservation created successfully") return false;
    return true;
  });
  await t
    .click(".rs-picker-toggle-value")
    .click(
      "div > .rs-picker-toolbar > .rs-picker-toolbar-ranges > .rs-picker-toolbar-option:nth-child(1) > span"
    );
  const select = await XPathSelector("//a[.='Select']");
  await t
    .click(select)
    .click("div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item");
  const seat = await XPathSelector("//a[@name='seatId']");
  await t
    .click(seat)
    .click("div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item");
  randomValue = await Math.floor(Math.random() * (7 - 1 + 1) + 1);
  await t
    .click(Selector("input").withAttribute("name", "firstName"))
    .typeText(Selector("input").withAttribute("name", "firstName"), firstName)
    .click(Selector("input").withAttribute("name", "lastName"))
    .typeText(Selector("input").withAttribute("name", "lastName"), lastName)
    .click(Selector("input").withAttribute("name", "email"))
    .typeText(Selector("input").withAttribute("name", "email"), "wrongEmail")
    .setFilesToUpload(Selector("input").withAttribute("name", "file"), [
      "./randomFile.bibtex",
    ]);
  const submit = await XPathSelector("//button[contains(.,'Submit')]");
  await t.click(submit);
  await t.wait(1001);
});

test("Get reservations and cancel the first reservation", async (t) => {
  firstName = await faker.name.firstName();
  lastName = await faker.name.lastName();
  randomEmail = await faker.internet.email();

  await t.setNativeDialogHandler((type, text, url) => {
    if (text === "Reservation canceled successfully.") return true;
    else if (text === "Get reservations view is successful") return true;
    return false;
  });
  await t
    .click(Selector(".App-reservations-view > button"))
    .wait(1001)
    .click(Selector("tr:nth-child(1) button"))
    .wait(1001);
  const firstRow = Selector(
    ".App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7)"
  );
  await t.expect(firstRow.textContent).contains("CANCELED");
});
