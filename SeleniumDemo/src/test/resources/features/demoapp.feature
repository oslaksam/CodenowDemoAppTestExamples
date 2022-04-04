Feature: Demo reservation app tests
    Scenario: Create a new reservation using the front end of the demo application.
        Given the user opens a browser
        When the user enters the demo application
        Then the user should see the reservation details
        When the user enters all of the necessary information
        And clicks the Submit button
        Then the user should see an alert with a message: Reservation created successfully
        And the user closes the browser

    Scenario: Get a list of reservation and cancel the latest reservation that you created in the previous test.
        Given the user opens a browser
        When the user enters the demo application
        And the user already created a reservation
        When the user clicks the Get Reservations button
        Then the user should see an alert with a message: Get reservations view is successful
        When the user clicks the OK button in the alert view
        Then the user should see the table with the latest 50 reservations
        When the user clicks the Cancel Reservation button located in the first row of the reservation table
        Then the user should see an alert with a message: Reservation canceled successfully.
        When the user clicks the OK button in the in the alert view
        Then the user should see an alert with a message: Get reservations view is successful
        When the user clicks the OK button in the alert view
        Then the status of the first reservation in the reservation table should be CANCELED
        And the user closes the browser

    Scenario: Try to create a new reservation but enter the invalid email address.
        Given the user opens a browser
        When the user enters the demo application
        Then the user should see the reservation details
        When enters the email address without the @ symbol
        And clicks the Submit button
        Then the user should see not see an alert with a message: Reservation created successfully
        And the user closes the browser