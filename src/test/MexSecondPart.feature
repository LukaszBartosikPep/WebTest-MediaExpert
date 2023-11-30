
  @SecondPartTesting
  Feature: SecondPartTesting


    @BuyingUntilLogin
    Scenario: BuyingUntilLogin
      Given I open page
      Then I type product name "Nintendo"
      And I add product to cart 1
      And I check product delivery options
      Then Form must be valid and proceed

    @TestingReceipt
    Scenario: TestingReceipt
      Given I open page
      Then I type product name "Nintendo"
      And I add product to cart 2

    @TestingLocalShop
    Scenario: TestingLocalShopData
      Given I open page
      Then I search for shop
     Then Shop data must be valid






