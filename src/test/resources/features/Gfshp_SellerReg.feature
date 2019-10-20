Feature: GiftShop Seller Registration
  Scenario: Valid Seller Registration
  Given I am loggd onto  Giftshp website
  When  I click My Accnt optns menu option
  And I clck Register menu optn
  And  I enter firstname "firstname" and "lastname" and email "email" and password "password" and confirmpassword "cpassword"
  And I enter telephone
  And I Enter passwrd
  And I  enter confirm passwrd
  And I choose Yes to Newsletter subscription
  And I choose Yes to Become Seller
  And I check the Privacy Policy
  And I pick Continue button
  And I can view Seller Registration profile
  And I can view Personal details,SellerInformation,Payment Details icon
  And  I can view 'Registered Seller?Login

  And I enter Store Name,Store Phone

  And I select Store logo and Store banner
  And I enter store address
  And I select Store Country, Store Region,Store City
  And I enter Storepostcode  "Storepostcode"
  And I enter Storepostcode ,Store Shipping Policy,Store Return Policy

  And I enter Store Meta Keywords,Store Meta Description,SEO URL For store,And I enter FacebookLink,Google Plus Link,Twitter Link,instagram link,whatsaapp Number
  And click on Next button

  And enter Seller Bank details
  And I enter Tax Identification Number
  And I enter PayPal E-mail ID "PaypalEmailID"
  And I click submit button

  Then I am a registered seller

 #Examples:
   # |firstname|lastname|passwrd|cpasswrd|email|confirmEmail}|Storepostcode|PaypalEmailID|
