it("displays the date and time of the reservation", () => {
  cy.get(".rs-picker-toggle-value").click();
  cy.get(".rs-picker-toolbar-option:nth-child(1) > span").click();
});
it("displays the train selection option", () => {
  cy.get("[name='trainId']").click();
  cy.get("div:nth-child(1) > .rs-picker-select-menu-item").click();
});

it("displays the seat id selection", () => {
  cy.get("[name='seatId']").click();
  cy.get("div:nth-child(1) > .rs-picker-select-menu-item").click();
});
it("displays first name input box", () => {
  cy.get(".rs-form-group:nth-child(5) > .rs-input")
    .should("be.visible")
    .click();
  cy.get(".rs-form-group:nth-child(5) > .rs-input").type("Tony");
});
it("displays the last name input box", () => {
  cy.get(".rs-form-group:nth-child(6) > .rs-input")
    .should("be.visible")
    .click();
  cy.get(".rs-form-group:nth-child(6) > .rs-input").type("Bonny");
});

it("displays the email input box", () => {
  cy.get(".rs-form-group:nth-child(7) > .rs-input")
    .should("be.visible")
    .click();
  cy.get(".rs-form-group:nth-child(7) > .rs-input").type(
    "bingus.tonis@example.com"
  );
});
it("displays the file input option", () => {
  cy.get(".rs-form-group:nth-child(8) > .rs-input").click();
  cy.get(".rs-form-group:nth-child(8) > .rs-input").type(
    "C:\fakepath\randomFile.bibtex"
  );
});
it("displays the submit button", () => {
  cy.get(".rs-form-group:nth-child(5) > .rs-input").should("have.text", "Tony");
  cy.get(".rs-form-group:nth-child(6) > .rs-input").should(
    "have.text",
    "Bonny"
  );
  cy.get(".rs-btn-primary").should("be.visible").click();
  cy.get(".rs-form").should("be.visible").submit();
});
cy.get(".rs-form-group:nth-child(7) > .rs-input").should(
  "have.text",
  '"bingus.tonis@example.com'
);
