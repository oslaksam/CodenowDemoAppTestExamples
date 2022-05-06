// demoapp.spec.js created with Cypress
//
// Start writing your Cypress tests below!
// If you're unfamiliar with how Cypress works,
// check out the link below and learn how to write your first test:
// https://on.cypress.io/writing-first-test
const { faker } = require("@faker-js/faker");

describe("demo reservation app", () => {
  context("GET /reservation", () => {
    it("Should return a list of latest 50 reservations", () => {
      cy.request({
        method: "GET",
        url: "https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation",
      }).should((response) => {
        expect(response.status).to.eq(200);
        expect(response.body[0]).to.have.all.keys(
          "id",
          "firstName",
          "lastName",
          "email",
          "seatId",
          "trainId",
          "date",
          "status"
        );
        cy.log(JSON.stringify(response.body));
      });
    });
  });
  context("POST /reservation", () => {
    it("Should create a reservation", () => {
      cy.request({
        method: "POST",
        url: "https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation",
        body: {
          date: "2022-03-21T02:24:59.815Z",
          email: faker.internet.email(),
          firstName: faker.name.firstName(),
          lastName: faker.name.lastName(),
          seatId: "1-21",
          trainId: "ICE-575",
        },
      }).should((response) => {
        expect(response.status).to.eq(200);
        expect(response.body).to.eq("Reservation accepted.");
        cy.log(JSON.stringify(response.body));
      });
    });
    it("Should fail to create a reservation", () => {
      cy.request({
        method: "POST",
        url: "https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation",
        failOnStatusCode: false,
        body: {},
      }).should((response) => {
        expect(response.status).to.eq(500);
        cy.log(JSON.stringify(response.body));
      });
    });
  });
  context("PUT /reservation", () => {
    it("Should cancel a reservation", () => {
      cy.request({
        method: "PUT",
        url: "https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation/cancel/0",
      }).should((response) => {
        expect(response.status).to.eq(200);
        expect(response.body).to.eq("Cancel reservation request accepted.");
        cy.log(JSON.stringify(response.body));
      });
    });
  });
});
