Feature: Homepage availability

  Scenario: Homepage - the homepage is available and clickable
    Given the user navigates to the website
    When the user clicks on Button
    And the user clicks on Button2
    Then the page is loaded