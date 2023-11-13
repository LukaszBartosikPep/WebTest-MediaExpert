


Feature: Testing sauce
##
#  Scenario: Testing login add product and checkout
#    When I open page
#    Then I give credentials "lbartosik@pepco.eu" "Expedition8"
#     When I click login
#    Then I check if logged in
#    Then I logout and close browser
#  Scenario: Test product search
#    When I open page
##    When I give credentials "lbartosik@pepco.eu" "Expedition8"
##    When I click login    ///za atomowe
##    Then I check if logged in
##    When I go to main page
#    When I type product name "Technics"
#    When I click search  ///za drobny
#    //np search for product technics
#    Then Product list must be valid "Technics"
#
#
#  Scenario: Test search menu
#    When I open page
#    When I click on product button
#    #Depends on the windows size, this option must be implemented
#    When I chose the subcategory
#    Then Given list of product must be visible "Monitory gamingowe"
    Scenario: Testing cart
      When I open page
      When I type product name "Technics"
      When I click search
      When I add product to cart 2
#      Then Products must be visible






