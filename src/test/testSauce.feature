Feature: Test login
  Scenario: Testing login correct
    Given I test login form
    When I give correct credentials
    Then Result is true
  Scenario: Testing login incorrect
      Given I give incorrect credentials

    Then Result is false
  Scenario: Check if product added
    Given I log in

    Then The cart contains