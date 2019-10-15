Feature: Wish list
  Scenario : Create Wishlist
    Given I open Giftshop website
    When I search for the gift item
    And   I select Gift item "item"
    And   I click on Add to wishlist icon
    Then item is added to wishlist

