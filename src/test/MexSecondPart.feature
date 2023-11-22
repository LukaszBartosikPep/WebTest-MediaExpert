
  @SecondPartTesting
  Feature: SecondPartTesting


    @BuyingUntilLogin
    Scenario: BuyingUntilLogin
      Given I open page
      Then I type product name "Playstation"
      And I add product to cart 1
      And I check product delivery options

