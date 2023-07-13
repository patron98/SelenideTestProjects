# new feature
# Tags: optional

Feature: Booking site

  Scenario Outline: Book a Room
    Given i go to the website
    When i book a room with form data: <firstname> <lastname> <email> <phone>
    When i book a room with start-end date: <startDate> - <endDate>
    Then the booking is confirmed with <startDate> - <endDate>

    Examples:
      | firstname | lastname  | email                         | phone         | startDate | endDate |
      | "John"    | "Doe"     | "john.doe@example.com"        | "12345678901" | "01"      | "05"    |
      | "Alice"   | "Smith"   | "alice.smith@example.com"     | "98765432140" | "06"      | "12"    |
      | "Michael" | "Johnson" | "michael.johnson@example.com" | "55555555455" | "13"      | "18"    |
      | "Sarah"   | "Brown"   | "sarah.brown@example.com"     | "11111111411" | "22"      | "28"    |

