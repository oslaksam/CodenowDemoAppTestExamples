/*==============================================================================*/
/* Nightwatch Recorder generated Wed Mar 30 2022 17:43:54 GMT+0200 (Central European Summer Time)*/
/*==============================================================================*/

module.exports = {
  "test case": function (client) {
    return client
      .resizeWindow(1920, 1080)
      .url("https://demo-app-fe.vercel.app/")
      .waitForElementVisible(".rs-picker-toggle-value", DEFAULT_TIMEOUT)
      .customClick(".rs-picker-toggle-value")
      .waitForElementVisible(
        ".rs-picker-toolbar-option:nth-child(1) span",
        DEFAULT_TIMEOUT
      )
      .customClick(".rs-picker-toolbar-option:nth-child(1) span")
      .useXpath()
      .waitForElementVisible(
        "//a[normalize-space(text())='Select']",
        DEFAULT_TIMEOUT
      )
      .customClick("//a[normalize-space(text())='Select']")
      .useCss()
      .useXpath()
      .waitForElementVisible(
        "//a[normalize-space(text())='Coach 1 / Seat 10']",
        DEFAULT_TIMEOUT
      )
      .customClick("//a[normalize-space(text())='Coach 1 / Seat 10']")
      .useCss()
      .waitForElementVisible("form input[name='firstName']", DEFAULT_TIMEOUT)
      .customClick("form input[name='firstName']")
      .waitForElementVisible("input[name='firstName']", DEFAULT_TIMEOUT)
      .setValue("input[name='firstName']", "Test")
      .waitForElementVisible("form input[name='lastName']", DEFAULT_TIMEOUT)
      .customClick("form input[name='lastName']")
      .waitForElementVisible("input[name='lastName']", DEFAULT_TIMEOUT)
      .setValue("input[name='lastName']", "Nightwatch")
      .waitForElementVisible("form input[name='email']", DEFAULT_TIMEOUT)
      .customClick("form input[name='email']")
      .waitForElementVisible("input[name='email']", DEFAULT_TIMEOUT)
      .setValue("input[name='email']", "email@mom.ko")
      .waitForElementVisible("form input[name='file']", DEFAULT_TIMEOUT)
      .customClick("form input[name='file']")
      .waitForElementVisible("form .rs-btn.rs-btn-primary", DEFAULT_TIMEOUT)
      .customClick("form .rs-btn.rs-btn-primary");
  },
};
