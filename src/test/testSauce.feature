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

    Scenario: Testing login add product and checkout
#      When I open login form
      Then I give credentials
#      When I add product
###      When I add product
#      Then Product must be in cart
#      When I do checkout
      Then Browser quit

#  taki sam test case, ale i give credentials als standard user
#
#      kolejny scenariusz uruchmianay  2x test casy
#
#      zamknac przegladarke anotaccje cucumber
#
#
#      kazdy scenariusz musi byc niezalezny
#       kolejny scenariusz loguje sie od nowa
#      problematic user-error  musi sie wysypać
#      glitch musi przejsc pomimo glitches



    Scenario: Testing next user
#      When I run driver
      When I open login form
      Then I give credentials
#      When I add product
###      When I add product
#      Then Product must be in cart
#      When I do checkout





#Feature: Testing sauce
#
#  Scenario: Testing login add product and checkout
#    Given I open login form
#    When I give credentials
#    Given I add product
##      When I add product
#    Then Product must be in cart
