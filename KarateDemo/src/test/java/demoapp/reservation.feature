Feature: demo reservation app registration test

  Background:
    # this section is optional !
    # steps here are executed before each Scenario in this file
    # variables defined here will be 'global' to all scenarios
    # and will be re-initialized before every scenario
    * def apiUrlPost = 'https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation'
    * def Faker = Java.type('com.github.javafaker.Faker')
    * def fakerObj = new Faker()
    * def fName = fakerObj.name().firstName()
    * def lName = fakerObj.name().lastName()
    * def mailId = fName+'.'+lName+'@test.com'
    * def feUrl =  'https://demo-app-fe.vercel.app/'
    # replace the executable with your own executable
    * configure driver = { type: 'chrome', showDriverLog: true, executable: 'C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe' }


  Scenario: Send an api request for a new reservation
    * def req =
      """
      {
        "date": "2022-03-21T02:24:59.815Z",
        "email": "#(mailId)",
        "firstName": "#(fName)",
        "lastName": "#(lName)",
        "seatId": "1-21",
        "trainId": "ICE-575"
      }
      """

    Given url apiUrlPost
    And request req
    When method post
    Then status 200

    * print 'The response is: ', response

  Scenario: Send a wrong api request for a new reservation
    * def req =
      """
      {}
      """

    Given url apiUrlPost
    And request req
    When method post
    Then status 500

    * print 'The response is: ', response

  Scenario: use the frontend to create a new reservation
    # replace the executable with your own
    * configure driver = { type: 'chrome', showDriverLog: true, executable: 'C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe' }
    Given driver feUrl
    And driver.maximize()
    When waitFor(".rs-picker-toggle-value")
    Then click(".rs-picker-toggle-value")
    When waitFor("{span}Today")
    Then click("{span}Today")
    When waitFor("{}Select")
    Then click("{}Select")
    When waitFor("{}Sp 9301")
    Then click("{}Sp 9301")
    When waitFor("{}Select")
    Then click("{}Select")
    When waitFor("//a[@name='seatId']")
    Then click("//a[@name='seatId']")
    When waitFor("{}Coach 1 / Seat 21")
    Then click("{}Coach 1 / Seat 21")
    And input('input[name=firstName]', fName )
    And input('input[name=lastName]', lName)
    And input('input[name=email]', mailId)
    # replace the file with your own file
    And driver.inputFile('input[name=file]', 'C:\Users\oslaksam\Documents\CODENOW\SeleniumDemo\randomFile.bibtex')
    When click("//button[contains(.,'Submit')]")
    And delay(1200)
    Then match driver.dialogText == 'Reservation created successfully'
    And dialog(true)

  Scenario: get reservations and cancel the first one
    Given driver feUrl
    And driver.maximize()
    When waitFor(".App-reservations-view > button")
    Then click(".App-reservations-view > button")
    Then delay(1001)
    Then match driver.dialogText == 'Get reservations view is successful'
    And dialog(true)
    And delay(500)
    When waitFor("tr:nth-child(1) button")
    Then click("tr:nth-child(1) button")
    Then delay(500)
    Then match driver.dialogText == 'Reservation canceled successfully.'
    And dialog(true)
    And delay(500)
    Then match driver.dialogText == 'Get reservations view is successful'
    And dialog(true)
    And delay(500)
    When waitFor(".App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7)")
    Then match text(".App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7)") == 'CANCELED'



  Scenario: try to create a new reservation but fail because of invalid email
    Given driver feUrl
    And driver.maximize()
    When waitFor(".rs-picker-toggle-value")
    Then click(".rs-picker-toggle-value")
    When waitFor("{span}Today")
    Then click("{span}Today")
    When waitFor("{}Select")
    Then click("{}Select")
    When waitFor("{}Sp 9301")
    Then click("{}Sp 9301")
    When waitFor("{}Select")
    Then click("{}Select")
    When waitFor("//a[@name='seatId']")
    Then click("//a[@name='seatId']")
    When waitFor("{}Coach 1 / Seat 21")
    Then click("{}Coach 1 / Seat 21")
    And input('input[name=firstName]', fName )
    And input('input[name=lastName]', lName)
    And input('input[name=email]', "wrongMail")
    # replace the file with your own file
    And driver.inputFile('input[name=file]', 'C:\Users\oslaksam\Documents\CODENOW\SeleniumDemo\randomFile.bibtex')
    When click("//button[contains(.,'Submit')]")
    And delay(1001)
    * print 'The response is: ', driver.dialogText
    Then match driver.dialogText != 'Reservation created successfully'
