Feature: Automating UI Training App

  Scenario Outline: Testing ui training app
    Given i surf to the website
    When i log into app with "admin" "admin"
    When i register a user with <firstname> <lastname> <phone> <attendees> <email>
    When i close all the popups
    Then a confirm banner and a button should appear
    When i click 15 coconuts
    Then i complete the site


    Examples:
      | firstname | lastname | phone        | attendees | email                    |
      | "John"    | "Doe"    | "+32499435282" | 2         | "john.doe@example.com"   |
      | "Jane"    | "Smith"  | "+32499765432" | 1         | "jane.smith@example.com" |