Feature: LoginFeature
  This feature..

  Scenario: Login with correct username and password
    Given I navigate to the login
    And I enter username as "address@address.com" and password as "12345+"
    And I click login button
    Then I should see userform page
