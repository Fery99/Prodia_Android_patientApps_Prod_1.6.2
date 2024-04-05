Feature: Prodia Mobile

  @Signin
  Scenario: user try to login and use Prodia patiens Apps
    Given user on login dashboard
    When user tap Login button
    And user input username "ferysadewaa@gmail.com"
    And user input password "Fery1304"
    And user tap button
    And user on homepage dashboard
    And user tap on
