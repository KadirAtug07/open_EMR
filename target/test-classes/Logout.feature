Feature: Logout

  Background: : Login with valid credentials
    Given User navigates to website
    When  User enters valid username
    Then  User enters valid password
    And   User selects "English (Australian)"
    And   User clicks to login button
    Then  User verifies home page title as "OpenEMR"

  @smoke
    Scenario: User can successfully log out
      Given User navigates to home page
      When User clicks to Log out button
      And User navigates to login page with title as "OpenEMR Login"