Feature: GiftShop Buyer Registration

  Background:

    Given I can see Giftshop website
    When  I click the My Account options drop down
    And I click on Register menu option
    And  I enter firstname "titoto838pe"  #change the parameters to rerun a fresh test
    And  I enter lastname "Oyinloluuara"
    And I enter email "titotourupe@gmail.com"
    And I input password
    And I confirm password
    And I input telephone
    And I select Yes to Newsletter subscription
    And I check the Privacy Policy
    And I click Continue button
  Scenario: Valid Buyer Registration

    Then I am registered

  Scenario: Invalid Buyer Registration

   Then I get a validation message'Already registered email