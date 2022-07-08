@country
Feature: Data driven testing using the scenerio outline

  Scenario Outline: Google capital research
    Given User is on Google search page
    When User searches for "<country>" capital
    Then User should see "<capital>" in the result
    Examples:
      | country | capital          |
      | Tyrkey  | Ankara           |
      | Moldova | Chișinău         |
      | Russia  | Moscow           |
      | USA     | Washington, D.C. |
      | Romania | Bucharest        |