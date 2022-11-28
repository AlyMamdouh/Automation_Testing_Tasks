Feature: User LoggingIn
  I want to check that the user can login in to orange website successfully

  Scenario: User LoggingIn with valid credentials
    Given the user is in the homepage
    When the user enters valid username and valid password
    And the user clicks on Login button
    Then the user is logging in successfully and redirected to the homepage of his/her account