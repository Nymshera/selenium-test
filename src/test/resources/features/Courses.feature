Feature: Courses functionality
    As a user 
    I want to access all courses 
    and I can buy them 

    Background: I am on the Free Range Testers web without logging in
        Given I'm on the Free Range Testers webside

    @Cursos
    Scenario: Acces to "Introducción al testing" course
        When I go to "Cursos" using the navigation bar
        And Select Introducción al Testing
        Then I'm on the Introducción al testing page

    @Plans
    Scenario: Users can select a plan when signing up
        When I select Elegir Plan
        Then I can validate the options in the checkout page