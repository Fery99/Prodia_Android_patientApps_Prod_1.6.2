Feature: can book and get service lab test

  @LabTest
  Scenario: user get product information (Search Product)
    Given user on login dashboard.
    When user tap Login button.
    And user input username# "ferysadewaa@gmail.com".
    And user input password# "Fery1304".
    And user tap button.
    And user on homepage dashboard.
    And user tap dashboard labtets.
    And user on Lab Test Dashboard.
    And user select coloumn search lab test.
    And user input product "C-peptide".
    And user search of product and get list of product.
    And user tap product of result.
    Then user on page Lab Test detail.


  @LabTest
  Scenario: user can add to cart and remove item on cart
    Given user on page Lab Test detail
    When user tap add to cart Lab test Home service
    And user tap view cart Lab test Home service
    And user on page cart Lab test Home service
    And user tap remove
    And user get informn cart its empty
    And user back button
    Then user on page Lab Test detail

  @LabTest_HomeService
  Scenario: user complete payment and get VA
    Given user on page Lab Test detail
    When user tap add to cart
    And user tap view cart
    And user on page cart
    And user checklist I agree to Prodia..
    And user click book button
    And user tap Home Service
    And user tap edit address home service
    And user tap address selected from listt
    And user tap continue buttonn
    And user tap schedule
    And user on page choose date book lab test
    And user tap for choose date
    And user tap date
    And user tap oke for date
    And user tap choose Branch & Time
    And user tap continue button for back to page book lab test
    And user checklist i'll retrieve..
    And user tap Choose Payment
    And user checklist i agree to...
    And user tap continue T&C
    And user on Page Payment method
    And user select VA method
    And user tap Pay Now
    Then user on Page Transaction and get VA