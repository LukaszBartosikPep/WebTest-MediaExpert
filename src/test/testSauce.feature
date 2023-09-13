#Feature: Test login
#  Scenario: Testing login correct
#    Given I test login form
#    When I give correct credentials
#    Then Result is true
#  Scenario: Testing login incorrect
#      Given I give incorrect credentials
#
#    Then Result is false
#  Scenario: Check if product added
#    Given I log in
#
#    Then The cart contains


  Feature: Testing sauce

    Scenario: Testing login
      Given I open login form
      When I give credentials

    Scenario: Testing product add
      Given I test adding product
      When I add product
      Then Product must be in cart
