Feature: Test login
  Scenario: Testing login in
    Given I test login form
    When I give correct credentials
    Then Result is true
    When I give incorrect credentials
    Then Result is false
  Scenario: Check if product added
    Given I click on add

    Then The button changed to Remove