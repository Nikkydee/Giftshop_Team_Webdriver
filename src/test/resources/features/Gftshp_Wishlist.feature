Feature: Wish list
  Scenario Outline: Create Wishlist
    Given I am logged on to the Giftshop website
    When  I search for a gift item
    And   I select the gift item
    And   I select Gift item "item"
    And   I click on Add to wishlist icon
    Then item is added to wishlist

    Examples:

