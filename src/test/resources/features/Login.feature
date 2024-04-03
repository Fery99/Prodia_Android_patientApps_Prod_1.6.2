Feature: Prodia Mobile

  @Login
  Scenario: user try to login and use Prodia patiens Apps
    Given user on login dashboard
    When user click Login button
    And user input username "ferysadewaa@gmail.com"
    And user input password "Fery1304"
    And user click button
    And user on homepage dashboard
    