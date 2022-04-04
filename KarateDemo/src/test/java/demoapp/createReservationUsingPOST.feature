@openapi-file=openapi.yaml
Feature: createReservation


  Background:
    * url 'https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com'

  @operationId=createReservationUsingPOST
  Scenario Outline: Test createReservationUsingPOST for <status> status code

    * def args = read(<testDataFile>)
    * def result = call read('createReservationUsingPOST.feature@operation') args
    * match result.responseStatus == <status>
    Examples:
      | status | testDataFile                                   |
      | 200    | 'test-data/createReservationUsingPOST_200.yml' |
      | 201    | 'test-data/createReservationUsingPOST_201.yml' |
      | 401    | 'test-data/createReservationUsingPOST_401.yml' |
      | 403    | 'test-data/createReservationUsingPOST_403.yml' |
      | 404    | 'test-data/createReservationUsingPOST_404.yml' |


  @operationId=createReservationUsingPOST
  Scenario: explore createReservationUsingPOST inline
  You can use this test to quickly explore your API.
  You can then copy this payload and paste it with Ctrl+Shift+V as an Example row above.
    * def payload =
      """
      {
        "statusCode": 200,
        "headers": {},
        "params": {},
        "body": {
          "date": "2019-08-24T14:15:22Z",
          "email": "string",
          "firstName": "string",
          "lastName": "string",
          "seatId": "string",
          "trainId": "string"
        },
        "matchResponse": true
      }
      """
    * call read('createReservationUsingPOST.feature@operation') payload


  @ignore
  @operation @operationId=createReservationUsingPOST @openapi-file=openapi.yaml
  Scenario: operation Reservation-controllerApi/createReservationUsingPOST
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
    And request args.body
    When method POST
    # validate status code
    * if (args.statusCode && responseStatus != args.statusCode) karate.fail(`status code was: ${responseStatus}, expected: ${args.statusCode}`)
    # validate response body
    * if (args.matchResponse === true) karate.call('createReservationUsingPOST.feature@validate')

  @ignore @validate
  Scenario: validates createReservationUsingPOST response

    * def responseMatch =
      """
      "##string"
      """
    * match  response contains responseMatch

