Feature: Health Shop (Get information item heath shop & user complete purchase heath shop)

  @HealthShop
  Scenario: user get product information
    Given user on login dashboard@
    When user tap Login button@
    And user input username@ "ferysadewaa@gmail.com"
    And user input password@ "Fery1304"
    And user tap button@
    And user on homepage dashboard@
    And user click health shop dashboard
    And user on health shop dashboad
    And user select item health shop
    And user get information about product heath shop
    And user add item health shop to cart
    And user tap view cart
    And user on Page cart
    And user tap back to previous page to product detail
    And user get information about product heath shop
    And user tap back to list Health shop
    Then user on health shop dashboad



  @HealthShop
  Scenario: user can search item on Health shop
    Given user on health shop dashboad
    When user tap search item heaath shop coloumn
    And user searching product "Supertin"
    And user get list item base of input search
    And user tap item of search
    And user get information about product heath shop
    And user add tap to add amount
    And user tap icon cart
    Then user on Page cart


  @HealthShop
  Scenario: user complete purchase Health Shop
    Given user on Page cart
    When user cheklist TnC
    And user tap place order button
    And user on Page Health shop for delivery details screen
    And user edit choose delivery address
    And user tap address
    And user tap continue button
    And user select delivery service, Reguler
    And user click pay now button
    And user on payment method screen
    And user select virtual account bank
    And user click pay now button
    And user on page complete Payemnt
    And user tap check payment status
    Then user on page order details and get status order








