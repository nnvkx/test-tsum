@driver:chrome
Feature: Auth tests

  Scenario: happy-path authorization on tsum
    Given User go to Tsum login page
    When User enter "example@tsum.ru" login
    And User enter "12345678" password
    And Click submit town
    And User click enter button
    Then User go to personal page

  Scenario: invalid password auth try
    Given User go to Tsum login page
    When User enter "example@tsum.ru" login
    And User enter "87654321" password
    And Click submit town
    And User click enter button
    Then Popup shows

  Scenario: logout
    Given User go to Tsum login page
    When User enter "example@tsum.ru" login
    And User enter "12345678" password
    And Click submit town
    And User click enter button
    And User go to personal page
    Then User click logout

  Scenario: invalid password auth try
    Given User go to Tsum login page
    And Click submit town
    And Switch to registration form
    And Enter existing "example@tsum.ru" user email
    And Enter password "12121212" for existing user email
    And User click enter button
    Then User already exists popup

