Feature: User able to login

@smoke
  Scenario: Login with valid credentials
    Given User navigates to website
    When  User enters valid username
    Then  User enters valid password
    And   User selects "English (Australian)"
    And   User clicks to login button
    Then  User verifies home page title as "OpenEMR"

  @smoke
  Scenario: Login with invalid username
    Given User navigates to website
    When  user enters invalid userName
    Then  User enters valid password
    And   User selects "English (Australian)"
    And   User clicks to login button
    Then user gets error message as "Invalid username or password"

    @smoke
    Scenario: Login with invalid password
      Given User navigates to website
      When  User enters valid username
      Then  User enters invalid password
      And   User selects "English (Australian)"
      And   User clicks to login button
      Then user gets error message as "Invalid username or password"

      @smoke
      Scenario: Login with invalid username and password
        Given User navigates to website
        When  user enters invalid userName
        Then  User enters invalid password
        And   User selects "English (Australian)"
        And   User clicks to login button
        Then user gets error message as "Invalid username or password"


