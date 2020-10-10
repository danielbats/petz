Feature: Api Automation
  Verifying current weather for different cities through the API

  Scenario Outline: Get current weather from desired city using the City and Country names
    Given I send a GET request for <city> <country>
    Then I verify the response code is 200
    Then I should see the current weather for <city>
    Examples:
    |city       |country|
    |Salvador   |BR     |
    |Paris      |FR     |
    |Chicago    |US     |
