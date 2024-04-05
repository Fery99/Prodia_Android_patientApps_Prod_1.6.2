Feature: Prodia Mobile
# ini feature pertama ngga ada masalah sama null nyaa
  @Signin
  Scenario: user try to login and use Prodia patiens Apps
    Given user on login dashboard
    When user tap Login button
    And user input username "ferysadewaa@gmail.com"
    And user input password "Fery1304"
    And user tap button
    And user on homepage dashboard
#    cek element my profile
    And user tap on
