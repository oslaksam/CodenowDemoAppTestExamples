/*==============================================================================*/
/* Nightwatch Recorder generated Wed Apr 06 2022 20:51:26 GMT+0200 (Central European Summer Time) */
/*==============================================================================*/
const DEFAULT_TIMEOUT = 800;
module.exports = {
  "Get reservations and cancel the firs one": function (browser) {
    return browser
      .resizeWindow(1920, 1080)
      .url("https://demo-app-fe.vercel.app/")
      .waitForElementVisible(".App-reservations-view button", DEFAULT_TIMEOUT)
      .click(".App-reservations-view button")
      .pause(900)
      .getAlertText((results) => {
        console.log(results.value);
        browser.assert.equal(
          results.value,
          "Get reservations view is successful"
        );
      })
      .acceptAlert()
      .waitForElementVisible("tbody tr:nth-child(1) button", DEFAULT_TIMEOUT)
      .click("tbody tr:nth-child(1) button")
      .pause(900)
      .getAlertText((results) => {
        console.log(results.value);
        browser.assert.equal(
          results.value,
          "Reservation canceled successfully."
        );
      })
      .acceptAlert()
      .pause(900)
      .getAlertText((results) => {
        console.log(results.value);
        browser.assert.equal(
          results.value,
          "Get reservations view is successful"
        );
      })
      .acceptAlert()
      .click(".App-reservations-view button")
      .pause(900)
      .getAlertText((results) => {
        console.log(results.value);
        browser.assert.equal(
          results.value,
          "Get reservations view is successful"
        );
      })
      .acceptAlert()
      .waitForElementVisible(
        "tbody tr:nth-child(1) td:nth-child(7)",
        DEFAULT_TIMEOUT
      )
      .getText("tbody tr:nth-child(1) td:nth-child(7)", (results) => {
        console.log(results.value);
        browser.assert.equal(results.value, "CANCELED");
      });
  },
};
