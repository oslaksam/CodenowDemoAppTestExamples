// demoapp.spec.js created with Cypress
//
// Start writing your Cypress tests below!
// If you're unfamiliar with how Cypress works,
// check out the link below and learn how to write your first test:
// https://on.cypress.io/writing-first-test

describe("demo reservation app", () => {
  beforeEach(() => {
    // Cypress starts out with a blank slate for each test
    // so we must tell it to visit our website with the `cy.visit()` command.
    // Since we want to visit the same URL at the start of all our tests,
    // we include it in our beforeEach function so that it runs before each test
    cy.visit("http://localhost:3000/");
  });
  it("creates the reservation", () => {
    cy.get(".rs-picker-toggle-value").click();
    cy.get(".rs-picker-toolbar-option:nth-child(1) > span").click();
    cy.get("[name='trainId']").click();
    cy.get("div:nth-child(1) > .rs-picker-select-menu-item").click();
    cy.get("[name='seatId']").click();
    cy.get("div:nth-child(1) > .rs-picker-select-menu-item").click();
    cy.get(".rs-form-group:nth-child(5) > .rs-input")
      .should("be.visible")
      .click()
      .type("Tony");
    cy.get(".rs-form-group:nth-child(6) > .rs-input")
      .should("be.visible")
      .click()
      .type("Bonny");
    cy.get(".rs-form-group:nth-child(7) > .rs-input")
      .should("be.visible")
      .click()
      .type("bingus.tonis@example.com");
    //const filepath =
    // "C:UsersoslaksamDocumentsCODENOWSeleniumDemo\randomFile.bibtex";
    //cy.get(".rs-form-group:nth-child(8) > .rs-input").attachFile(filepath);
    // cy.get(".rs-form-group:nth-child(5) > .rs-input").should(
    //   "have.text",
    //   "Tony"
    // );
    // cy.get(".rs-form-group:nth-child(6) > .rs-input").should(
    //   "have.text",
    //   "Bonny"
    // );
    // cy.get(".rs-form-group:nth-child(7) > .rs-input").should(
    //   "have.text",
    //   '"bingus.tonis@example.com'
    // );
    cy.get(".rs-btn-primary").should("be.visible").click();
    cy.get(".rs-form").should("be.visible").submit();
    cy.on("window:alert", (text) => {
      expect(text).to.contains("Reservation created successfully");
    });
  });
});
