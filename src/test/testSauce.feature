


  Feature: Testing sauce
#
    Scenario: Testing login add product and checkout
      When I open login form
      Then I give credentials "performance_glitch_user" "secret_sauce"
      When I add product
      Then Product must be in cart
      When I do checkout
      Then Browser quit

    Scenario: Testing problem_user
      When I open login form
      Then I give credentials "problem_user" "secret_sauce"
      When I add product
      Then Product must be in cart
      When I do checkout
      Then Browser quit



    Scenario: Testing menu
      When I open login form
      Then I give credentials "standard_user" "secret_sauce"
      Then I click menu button
      Then If menu is visible
      Then I do redirection
      Then Browser quit


      Scenario: Check if removing works
        When I open login form
        Given I give credentials "standard_user" "secret_sauce"
        When I add product
        Then I remove product
        Then Browser quit






