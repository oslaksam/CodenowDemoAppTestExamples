const { faker } = require("@faker-js/faker");

describe("Demo application", () => {
  it("Should create a reservation.", async () => {
    await browser.url("https://demo-app-fe.vercel.app/");
    await expect(browser).toHaveUrl("https://demo-app-fe.vercel.app/");
    await expect(browser).toHaveTitle("React App");
    await $("//div/a/span").click();
    await $("//*/text()[normalize-space(.)='Today']/parent::*").click();
    await $('[name="trainId"]').click();
    await $("=IC 879 Hamburg").click();
    await $('[name="seatId"]').click();
    await $("=Coach 1 / Seat 21").click();
    await $('[name="firstName"]').click();
    await $('[name="firstName"]').setValue(faker.name.firstName());
    await $('[name="lastName"]').click();
    await $('[name="lastName"]').setValue(faker.name.lastName());
    await $('[name="email"]').click();
    await $('[name="email"]').setValue(faker.internet.email());
    await $('[name="file"]').setValue(
      "C:\\Users\\oslaksam\\Documents\\CODENOW\\SeleniumDemo\\randomFile.bibtex"
    );
    await $("//button[@type='submit']").click();
    await browser.pause(3000);
    const msg = await browser.getAlertText();
    await console.log(msg);
    await browser.acceptAlert();
    await expect(msg).toBe("Reservation created successfully");
  });
  it("Should try to create a reservation but fail because of the invalid email", async () => {
    await browser.url("https://demo-app-fe.vercel.app/");
    await expect(browser).toHaveUrl("https://demo-app-fe.vercel.app/");
    await expect(browser).toHaveTitle("React App");
    await $("//div/a/span").click();
    await $("//*/text()[normalize-space(.)='Today']/parent::*").click();
    await $('[name="trainId"]').click();
    await $("=IC 879 Hamburg").click();
    await $('[name="seatId"]').click();
    await $("=Coach 1 / Seat 21").click();
    await $('[name="firstName"]').click();
    await $('[name="firstName"]').setValue(faker.name.firstName());
    await $('[name="lastName"]').click();
    await $('[name="lastName"]').setValue(faker.name.lastName());
    await $('[name="email"]').click();
    await $('[name="email"]').setValue("wrongEmailWebdriverIO");
    await $('[name="file"]').setValue(
      "C:\\Users\\oslaksam\\Documents\\CODENOW\\SeleniumDemo\\randomFile.bibtex"
    );
    await $("//button[@type='submit']").click();
    await browser.pause(750);
    const isOpen = browser.isAlertOpen();
    if (isOpen === true) {
      console.log("===========>" + isOpen);
      await expect(true).toBe(false);
      //fail await browser.acceptAlert();
    }
  });
  it("Should get the reservations and cancels the first reservation.", async () => {
    await browser.url("https://demo-app-fe.vercel.app/");
    await expect(browser).toHaveUrl("https://demo-app-fe.vercel.app/");
    await expect(browser).toHaveTitle("React App");
    $("//div[@id='root']/div/div[2]/div/button").click();
    await browser.pause(750);
    let msg = await browser.getAlertText();
    await console.log(msg);
    await expect(msg).toBe("Get reservations view is successful");
    await browser.acceptAlert();
    $("//div[@id='root']/div/div[2]/div/table/tbody/tr/td[7]/button").click();
    await browser.pause(750);
    msg = await browser.getAlertText();
    await console.log(msg);
    await expect(msg).toBe("Reservation canceled successfully.");
    await browser.acceptAlert();
    await browser.pause(500);
    msg = await browser.getAlertText();
    await console.log(msg);
    await expect(msg).toBe("Get reservations view is successful");
    await browser.acceptAlert();
    const elem = $("//div[@id='root']/div/div[2]/div/table/tbody/tr/td[7]");
    await expect(elem).toHaveTextContaining("CANCELED");
  });
});
