@dataTable
Feature: Feature: Passing multiple parameters to the step

  Background:
  Scenario: User searches for multiple items
    Given User is on Google search page
    Then User should be able to search for following:
      | cucumber      |
      | java          |
      | selenium      |
      | cucumber bdd  |
      | QA automation |
      | wooden spoon  |