Feature: My Profile (View Profile, Change Photo, Add Address, Delete Address, Edit, Address & Delete Address)

  @MyProfile
  Scenario: user can View profile
    Given user on login dashboard!
    When user tap Login button!
    And user input username! "ferysadewaa@gmail.com"
    And user input password! "Fery1304"
    And user tap button!
    And user on homepage dashboard!
    And user tap icon profile
    And user on page Account
    And user tap profile
    Then user on page Profile


  @MyProfile
  Scenario: user can change photo profile
    Given user on page Profile
    When user tap icon profile
    And user on page Account
    And user tap profile
    And user on page Profile
    And user tap symbol cam on icon profile
    And user tap take photo
    And user tap button take photo
    And user tap ok
    And user on page Profile
    Then user click back to Page Account

  @MyProfile
  Scenario: user can add address
    Given user on page Account
    When user tap Address List
    And user on page My Address
    And user tap add Address
    And user tap search address column
    And user tap search address and input "jalan kober gang mawar no 2 purwokerto"
    And user tap address selected from list
    And user tap save button on page address
    And user on page add address
    And user input address name "My Home At Purwokerto"
    And user input additional Notes "Not add Notes"
    And user click add Address Button
    And user on page My Address
    Then user tap back to Page Account from my Addres


  @MyProfile
  Scenario: user can edit addres
    Given user on page Account
    When user tap Address List
    And user on page My Address
    And user tap other option
    And user tap Edit Address
    And user on page edit address
    And user tap address detail
    And user tap search address column
    And user tap search address and input "Aufa Residence"
    And user tap address selected from list, for edit
    And user tap save button on page address
    And user input address name "My Kost At Jakarta"
    And user input additional Notes "EDIT"
    And user save buton on edit address
    Then user on page My Address
    Then user tap back to Page Account from my Addres


  @MyProfile
  Scenario: user can delete addres
    Given user on page Account
    When user tap Address List
    And user on page My Address
    And user tap other option
    And user tap Delete Address
    And user tap yes,delete address option
    Then user on page My Address





