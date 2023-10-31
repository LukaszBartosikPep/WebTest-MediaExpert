


Feature: Testing sauce
#
#  Scenario: Testing login add product and checkout
#    When I open login form
#    Then I give credentials "lbartosik@pepco.eu" "Expedition8"
#    When I click login
#    Then I check if logged in
#    Then I logout and close browser
  Scenario: Test product search
    When I open login form
    When I give credentials "lbartosik@pepco.eu" "Expedition8"
    When I go to main page
    When I type product name
    When I click search
    Then Product list must be valid





