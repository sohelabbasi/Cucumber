Feature: Login scenarios

  Background:

  @regression @background
  Scenario: Valid admin login scenario
    When user enters valid login username and password
    And user clicks on login button
    Then admin user should be able to see dashboard page

  @smoke1 @background
  Scenario: Valid normal user login scenario
    When user enters valid normal login username and password
    And user clicks on login button
    Then normal user should be able to see dashboard page


  @smoke1 @regression @sprint101 @uat @prod @background
  Scenario: invalid admin user login scenario
    When user enters invalid admin login username and password
    And user clicks on login button
    Then system should show the error


