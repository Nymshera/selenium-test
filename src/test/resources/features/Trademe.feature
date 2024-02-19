Feature: The search on Trademe
    As a user I want to be able to search for product

Scenario: Search for a car on Trademe
    Given User navigate to Trademe webside
    When User enter a search car 
    And User click on the search button
    Then The result match the criteria