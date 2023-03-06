@Search
Feature: As Deel user I want to search for salaries

  @SearchSalaryInCountry
  Scenario: As Deel user I want to search a salary for a specific role inside a country
    Given I am on Deel salary page
    When I select QA Engineer as role
    And I select Canada as country
    And I click on search
    Then Chart results for role QA Engineer in country Canada should be displayed