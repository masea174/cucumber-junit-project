

Feature: User should be able to login with correct credentials

  Scenario: Web table login scenario
  Given User is in webTable Login page
  When user enters username "Test"
And user enters password "Tester"
And user click login button
Then user should see url contains orders

  Scenario: Web table login used the method from POM class
  Given User is in webTable Login page
  When user entres the username"Test" and The password "Tester" to login
  Then user should see url contains orders


    Scenario: map data table practice
      Given User is in webTable Login page
      When user enters bellow data
      |username|Test|
      |password|Tester|
