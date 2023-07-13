# new feature
# Tags: optional

Feature: Testing Login

  Scenario Outline: i login with all usernames
    Given i surf to the website
    When i login with "<usernames>" and password "secret_sauce"
    Then i should get to the "inventory" page

    Examples:
      | usernames               |
      | standard_user           |
      | problem_user            |
      | performance_glitch_user |

