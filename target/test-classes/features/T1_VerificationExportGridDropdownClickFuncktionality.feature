Feature:Verification  the click functionality of the "Export Grid" Dropdown

  Background:
  Given  User is on the Login page

    Scenario:Click functionality of the "Export Grid" Dropdown
  When  login as a Truck Driver
  And  select Vehicle feature under Fleet module
  Then  Export Grid dropdown should be clickble