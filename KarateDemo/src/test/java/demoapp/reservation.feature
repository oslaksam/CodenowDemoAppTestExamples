Feature: demo reservation app registration test

  Background:
    # this section is optional !
    # steps here are executed before each Scenario in this file
    # variables defined here will be 'global' to all scenarios
    # and will be re-initialized before every scenario
    #* url 'https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation'
    * def Faker = Java.type('com.github.javafaker.Faker')
    * def fakerObj = new Faker()
    * def fName = fakerObj.name().firstName()
    * def lName = fakerObj.name().lastName()
    * def mailId = fName+'.'+lName+'@test.com'

  Scenario: send an api request for a new reservation
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

    Given url 'https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com/reservation'
    And request req
    When method post
    Then status 200

    * print 'The response is: ', response

  Scenario: use the frontend to create a new reservation
    * configure driver = { type: 'chrome', showDriverLog: true, executable: 'C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe' }
    Given driver 'https://demo-app-fe.vercel.app/'
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
    And driver.inputFile('input[name=file]', 'C:\Users\oslaksam\Documents\CODENOW\SeleniumDemo\randomFile.bibtex')
    When click("//button[contains(.,'Submit')]")
    And delay(1200)
    Then dialog(true)
    #When print 'The response is: ', driver.dialog
    #Then match driver.dialog == 'Reservation created successfully'
