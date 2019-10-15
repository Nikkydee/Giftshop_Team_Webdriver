Feature: Checkout
  Scenario:  Customer Checkout
    Given I logged user in giftshop website
    When I select a gift ,add to cart
    And I click checkout menu
    Then  I can pay