
Feature: Add Facility

Background: : Login with valid credentials
Given User navigates to website
When  User enters valid username
Then  User enters valid password
And   User selects "English (Australian)"
And   User clicks to login button
Then  User verifies home page title as "OpenEMR"

  @smoke1
  Scenario Outline: Users add to facilities
    Given User navigates to Facilities
    And User validates that user can see text as "Facilities"
    Then User clicks Add facilities button
    And User add required facilities "<Name>","<Tax Id>","<Billing Address>","<POS code>","<Phone>","<Color>"
    Then User clicks the save button
    Examples:
      | Name    | Tax Id | Billing Address | POS code | Phone      | Color   |
      | Huseyin | 12304H | 123 State st    | 12: Home | 1234567890 | #FFFF00 |


