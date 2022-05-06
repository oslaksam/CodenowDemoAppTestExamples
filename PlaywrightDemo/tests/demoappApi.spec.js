const { faker } = require("@faker-js/faker");
const { test, expect } = require("@playwright/test");

test("Create a new reservation", async ({ request }) => {
  const newIssue = await request.post(`/reservation`, {
    data: {
      date: "2022-03-21T02:24:59.815Z",
      email: faker.internet.email(),
      firstName: faker.name.firstName(),
      lastName: faker.name.lastName(),
      seatId: "1-21",
      trainId: "ICE-575",
    },
  });
  expect(newIssue.ok()).toBeTruthy();
  expect(await newIssue.text()).toEqual("Reservation accepted.");
  const badIssue = await request.post(`/reservation`, {
    data: {},
  });
  expect(badIssue.ok()).not.toBeTruthy();
});

test("Get reservations", async ({ request }) => {
  const issues = await request.get(`/reservation`);
  expect(issues.ok()).toBeTruthy();
  expect(await issues.text()).toContain("id");
});

test("Cancel reservations", async ({ request }) => {
  const issues = await request.put(`/reservation/cancel/0`);
  expect(issues.ok()).toBeTruthy();
  expect(await issues.text()).toEqual("Cancel reservation request accepted.");
});
