const { faker } = require("@faker-js/faker");

describe("Demo aplikace", () => {
  it("Should create a reservation.", async () => {
    await browser.url("https://demo-app-fe.vercel.app/");

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
    await //$('[name="file"]').click();
    await $('[name="file"]').setValue(
      "C:\\Users\\oslaksam\\Documents\\CODENOW\\SeleniumDemo\\randomFile.bibtex"
    );
    await $("//button[@type='submit']").click();
    await browser.pause(3000);
    const msg = await browser.getAlertText();
    await console.log(msg);
    await browser.acceptAlert();
    await expect(msg).toBe("Reservation created successfully");

    // WARNING: unsupported command assertAlert. Object= {"command":"assertAlert","target":"Reservation created successfully","value":""}
  });
});
