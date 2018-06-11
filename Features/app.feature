Feature: To verify the login Functionality

  Scenario Outline: 01_Verify login with invalid credentials
    Given I am in Login Page
    When I enter Invalid "<Username>" and "<Password>"
    Then I should not be able to login

    Examples: 
      | Username | Password |
      | Bharat   |    12345 |
      | Admin    |      123 |

  Scenario Outline: 02_Verify login with valid credentials
    Given I am in Login Page
    When I enter Valid "<Username1>" and "<Password1>"
    Then I should be able to login

    Examples: 
      | Username1 | Password1 |
      | admin     | admin     |
      | admin     | admin     |
