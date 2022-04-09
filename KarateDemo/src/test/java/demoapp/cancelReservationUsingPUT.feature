@openapi-file=openapi.yaml
Feature: cancelReservation


  Background:
    * url 'https://demo-app-spring-api-aca-demo.stxcn-aca.stxcn.codenow.com'

  @operationId=cancelReservationUsingPUT
  Scenario Outline: Test cancelReservationUsingPUT for <status> status code

    * def args = read(<testDataFile>)
    * def result = call read('cancelReservationUsingPUT.feature@operation') args
    * match result.responseStatus == <status>
    Examples:
      | status | testDataFile                                  |
      | 200    | 'test-data/cancelReservationUsingPUT_200.yml' |
      | 200    | 'test-data/cancelReservationUsingPUT_201.yml' |
      | 401    | 'test-data/cancelReservationUsingPUT_401.yml' |
      | 403    | 'test-data/cancelReservationUsingPUT_403.yml' |
      | 404    | 'test-data/cancelReservationUsingPUT_404.yml' |


  @operationId=cancelReservationUsingPUT
  Scenario: explore cancelReservationUsingPUT inline
    You can use this test to quickly explore your API.
    You can then copy this payload and paste it with Ctrl+Shift+V as an Example row above.
    * def payload =
      """
      {
        "statusCode": 200,
        "headers": {},
        "params": {
          "id": 0
        },
        "body": null,
        "matchResponse": true
      }
      """
    * call read('cancelReservationUsingPUT.feature@operation') payload


  @ignore
  @operation @operationId=cancelReservationUsingPUT @openapi-file=openapi.yaml
  Scenario: operation Reservation-controllerApi/cancelReservationUsingPUT
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
    Given path '/reservation/cancel/', args.params.id
    And headers headers
    When method PUT
    # validate status code
    * if (args.statusCode && responseStatus != args.statusCode) karate.fail(`status code was: ${responseStatus}, expected: ${args.statusCode}`)
    # validate response body
    * if (args.matchResponse === true) karate.call('cancelReservationUsingPUT.feature@validate')

  @ignore @validate
  Scenario: validates cancelReservationUsingPUT response

    * def responseMatch =
      """
      "##string"
      """
    * match  response contains responseMatch

