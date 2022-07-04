Feature: User should be able to login with correct credentials
Scenario: Web table login scenario
When user enters username "Test"
And user enters password "Tester"
And user click login button
Then user should see url contains orders
