@Navigation
Feature: Navigation bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

    Background: I am on the Free Range Testers web without logging in
        Given I'm on the Free Range Testers webside

    @Sections
    Scenario Outline: Navigate to diferents sections
        When I go to "<section>" using the navigation bar
        Then I'm on the "<section>"
        Examples:
            | section              |
            | Cursos               |
            | Recursos             |
            | Blog                 |
            | Programas de estudio |
            | Mentorías            |
            | Udemy                |

    Scenario: Courses are presented correctly to potencial customers
        When I go to Cursos using the navigation bar
        And Select Introducción al Testing

    @Plans
    Scenario: Users can select a plan when signing up
        When I select Elegir Plan
        Then I can validate the options in the checkout page