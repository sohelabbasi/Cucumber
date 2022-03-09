Feature: Verify dashboard options

  @smoke1
  Scenario: Verification of dashboard feature
    When user enters valid login username and password
    And user clicks on login button
    Then user verify dashboard page
