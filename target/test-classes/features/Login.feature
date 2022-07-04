
@login
Feature:As a user, I should be able to login with correct credentials to different accounts.
and dashboard should be displayed.
  Accounts are: librarian, student, admin

  #C#50: Create a new feature file and new scenarios
  #1. Create a new feature file named Login.feature
  #2. Create 3 new scenarios from the below provided user story.
  #3. User Story:

  #As a user, I should be able to login with correct credentials to different accounts.
  #And dashboard should be displayed.
  #Accounts are: librarian, student, admin
  Scenario: Login as librarian
  Given user is on library login page
  When user enters librarian username
  And user enters librarian password
  Then user should be able to see DashbordPage

  Scenario: Login as student
    Given user is on library login page
    When user enters student username
    And user enters student password
    Then user should be able to see DashbordPage

  Scenario: Login as admin
    Given user is on library login page
    When user enters admin username
    And user enters admin password
    Then user should be able to see DashbordPage
  #4. Create a new step definition class under step_definitions package
  #named: LoginStepDefs
  #5. Run the code. Get the step definitions from the console
  #6. No Java-selenium code implementation needed. Just add printing line in the
  #implementation regarding what should be happening when the code is ran.
 # Ex: “User is on the login page”
