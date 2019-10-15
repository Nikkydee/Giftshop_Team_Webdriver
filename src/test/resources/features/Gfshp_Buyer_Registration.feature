Feature: GiftShop Buyer Registration

  Background:

    Given I can see Giftshop website
    When  I click the My Account options drop down
    And I click on Register menu option
    And I input password
    And I confirm password
    And I input telephone
    And I select Yes to Newsletter subscription
    And I check the Privacy Policy
    And I click Continue button

  Scenario: Valid Buyer Registration
    And  I enter firstname "Adenke"
    And  I enter lastname "Oyinloluuara"
    And I enter email "funmi@gmail.com"
    And I select No to Become Seller

    Then I am registered

  Scenario: Invalid Buyer Registration

    And  I input an invalid firstname "Adenike"
    And  I input an invalid lastname "Oyinlola"
    And I input an already registered email
    And I select No to Become Seller

    Then I get a validation message'Already registered email