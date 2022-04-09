// demoapp.spec.js created with Cypress
//
// Start writing your Cypress tests below!
// If you're unfamiliar with how Cypress works,
// check out the link below and learn how to write your first test:
// https://on.cypress.io/writing-first-test
const { faker } = require("@faker-js/faker");

describe("demo reservation app", () => {
  beforeEach(() => {
    // Cypress starts out with a blank slate for each test
    // so we must tell it to visit our website with the `cy.visit()` command.
    // Since we want to visit the same URL at the start of all our tests,
    // we include it in our beforeEach function so that it runs before each test
    cy.visit("https://demo-app-fe.vercel.app/");
  });
  it("Creates a reservation", () => {
    const name = faker.name.firstName();
    const lastName = faker.name.lastName();
    const email = faker.internet.email();
    cy.get(".rs-picker-toggle-value").click();
    cy.get(".rs-picker-toolbar-option:nth-child(1) > span").click();
    cy.get("[name='trainId']").click();
    let val = Math.floor(Math.random() * (4 - 1 + 1) + 1);
    cy.wait(500);
    cy.get("div:nth-child(" + val + ") > .rs-picker-select-menu-item").click({
      multiple: true,
    });
    val = Math.floor(Math.random() * (7 - 1 + 1) + 1);
    cy.wait(500);
    cy.get("[name='seatId']").click();
    cy.wait(500);
    cy.get("div:nth-child(" + val + ") > .rs-picker-select-menu-item").click({
      multiple: true,
    });
    cy.get(".rs-form-group:nth-child(5) > .rs-input")
      .should("be.visible")
      .click()
      .type(name);
    cy.get(".rs-form-group:nth-child(6) > .rs-input")
      .should("be.visible")
      .click()
      .type(lastName);
    cy.get(".rs-form-group:nth-child(7) > .rs-input")
      .should("be.visible")
      .click()
      .type(email);
    const filepath = "example.json";
    cy.get(".rs-form-group:nth-child(8) > .rs-input").attachFile(filepath);
    cy.get(".rs-form-group:nth-child(5) > .rs-input").should(
      "have.value",
      name
    );
    cy.get(".rs-form-group:nth-child(6) > .rs-input").should(
      "have.value",
      lastName
    );
    cy.get(".rs-form-group:nth-child(7) > .rs-input").should(
      "have.value",
      email
    );
    cy.get(".rs-btn-primary").should("be.visible").click();
    //cy.get(".rs-form").should("be.visible").submit();
    cy.on("window:confirm", (text) => {
      expect(text).to.contains("Reservation created successfully");
    });
  });
});
