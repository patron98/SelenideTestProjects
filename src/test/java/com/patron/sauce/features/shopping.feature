# new feature
# Tags: optional

Feature: A description

  Scenario Outline: i buy something
    Given i surf to the website
    When i login with standard user
    When i buy a couple items with <firstname> <lastname> and <zipcode>

    Examples:
      | firstname | lastname  | zipcode |
      | "John"    | "Doe"     | "12345" |
      | "Jane"    | "Smith"   | "67890" |
      | "Mike"    | "Johnson" | "54321" |