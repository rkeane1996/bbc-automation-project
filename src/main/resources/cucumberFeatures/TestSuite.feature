Feature: Test Scenarios for BBC news site

  Scenario: Test the Navigation Menu that the URL's are correct
    Given I navigate to the bbc website
    Then I verify the top navigation links are correct

  Scenario: Test Time and date are correct on the bbc home page
    Given I navigate to the bbc website
    Then I verify the date on the home page is correct

  Scenario: Test that the News URL is correct
    Given I navigate to the bbc website
    When I navigate to the bbs news section of the website
    Then I verify the url for the news section is correct

  Scenario: Test the search functionality on the bbc website
    Given I navigate to the bbc website
    When I navigate to the search Page
    And I perform a search for "Houghton Mifflin Harcourt"
    Then results appear for the search