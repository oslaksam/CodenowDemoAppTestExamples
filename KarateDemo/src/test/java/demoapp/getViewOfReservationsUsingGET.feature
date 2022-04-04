@openapi-file=openapi.yaml
Feature: getViewOfReservations


  Background:
    * url 'https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com'

  @operationId=getViewOfReservationsUsingGET
  Scenario Outline: Test getViewOfReservationsUsingGET for <status> status code

    * def params = __row
    * def result = call read('getViewOfReservationsUsingGET.feature@operation') { statusCode: #(+params.status), params: #(params), matchResponse: #(params.matchResponse) }
    * match result.responseStatus == <status>
    Examples:
      | status | matchResponse |
      | 200    | true          |
      | 401    | true          |
      | 403    | true          |
      | 404    | true          |


  @operationId=getViewOfReservationsUsingGET
  Scenario: explore getViewOfReservationsUsingGET inline
  You can use this test to quickly explore your API.
  You can then copy this payload and paste it with Ctrl+Shift+V as an Example row above.
    * def statusCode = 200
    * def params = {}
    * def matchResponse = true
    * call read('getViewOfReservationsUsingGET.feature@operation')


  @ignore
  @operation @operationId=getViewOfReservationsUsingGET @openapi-file=openapi.yaml
  Scenario: operation Reservation-controllerApi/getViewOfReservationsUsingGET
    * def args =
      """
      {
      auth: #(karate.get('auth')),
      headers: #(karate.get('headers')),
      params: #(karate.get('params')),
      body: #(karate.get('body')),
      statusCode: #(karate.get('statusCode')),
      matchResponse: #(karate.get('matchResponse'))
      }
      """
    * def authHeader = call read('classpath:karate-auth.js') args.auth
    * def headers = karate.merge(args.headers || {}, authHeader || {})
    Given path '/reservation'
    And headers headers
    When method GET
    # validate status code
    * if (args.statusCode && responseStatus != args.statusCode) karate.fail(`status code was: ${responseStatus}, expected: ${args.statusCode}`)
    # validate response body
    * if (args.matchResponse === true) karate.call('getViewOfReservationsUsingGET.feature@validate')

  @ignore @validate
  Scenario: validates getViewOfReservationsUsingGET response

    * def responseMatch =
      """
      {
        "date": "##string",
        "email": "##string",
        "firstName": "##string",
        "id": "##number",
        "lastName": "##string",
        "seatId": "##string",
        "status": "##string",
        "trainId": "##string"
      }
      """
    * match each response contains responseMatch

