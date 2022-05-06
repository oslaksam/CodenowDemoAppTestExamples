/*==============================================================================*/
/* Nightwatch Recorder generated code is pretty terrible*/
/*==============================================================================*/
const DEFAULT_TIMEOUT = 800;
const { faker } = require("@faker-js/faker");
module.exports = {
  "Try to create a reservation but use a wrong email": function (browser) {
    browser
      .resizeWindow(1920, 1080)
      .url("https://demo-app-fe.vercel.app/")
      .waitForElementVisible(".rs-picker-toggle-value", DEFAULT_TIMEOUT)
      .click(".rs-picker-toggle-value")
      .waitForElementVisible(
        ".rs-picker-toolbar-option:nth-child(1) span",
        DEFAULT_TIMEOUT
      )
      .click(".rs-picker-toolbar-option:nth-child(1) span")
      .waitForElementVisible(
        ".rs-content > .rs-form > .rs-form-group:nth-child(3) > .rs-picker-input > .rs-btn",
        DEFAULT_TIMEOUT
      )
      .click(
        ".rs-content > .rs-form > .rs-form-group:nth-child(3) > .rs-picker-input > .rs-btn"
      );
    let randomValue = Math.floor(Math.random() * (4 - 1 + 1) + 1);
    browser
      .waitForElementVisible(
        "div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item",
        DEFAULT_TIMEOUT
      )
      .click("div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item")
      .pause(300)
      .useXpath()
      .waitForElementVisible("//a[.='Select']", DEFAULT_TIMEOUT)
      .click("//a[.='Select']");
    randomValue = Math.floor(Math.random() * (7 - 1 + 1) + 1);
    browser
      .useCss()
      .waitForElementVisible(
        "div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item",
        DEFAULT_TIMEOUT
      )
      .click("div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item")
      .waitForElementVisible("form input[name='firstName']", DEFAULT_TIMEOUT)
      .click("form input[name='firstName']")
      .waitForElementVisible("input[name='firstName']", DEFAULT_TIMEOUT)
      .setValue("input[name='firstName']", faker.name.firstName())
      .waitForElementVisible("form input[name='lastName']", DEFAULT_TIMEOUT)
      .click("form input[name='lastName']")
      .waitForElementVisible("input[name='lastName']", DEFAULT_TIMEOUT)
      .setValue("input[name='lastName']", faker.name.lastName())
      .waitForElementVisible("form input[name='email']", DEFAULT_TIMEOUT)
      .click("form input[name='email']")
      .waitForElementVisible("input[name='email']", DEFAULT_TIMEOUT)
      .setValue("input[name='email']", "email")
      .waitForElementVisible("form input[name='file']", DEFAULT_TIMEOUT)
      .setValue("form input[name='file']", __dirname + "\\README.md")
      .waitForElementVisible("form .rs-btn.rs-btn-primary", DEFAULT_TIMEOUT)
      .click("form .rs-btn.rs-btn-primary")
      .pause(900)
      .getAlertText((results) => {
        console.log(results.value);
        browser.assert.not.equal(
          results.value,
          "Reservation created successfully"
        );
      });
  },
};
