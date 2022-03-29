Feature: As a user, I should be able to log in.
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user use username "<username>" and passcode "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page
    Examples:
      | username | password |
      | user17 | Userpass123 |
      | user47 | Userpass123 |
      | user77 | Userpass123 |