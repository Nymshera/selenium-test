Feature: Navigation bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

    Scenario Outline: Navigate to diferents sections
        Given I'm on the Free Range Testers webside
        When I go to <section> using the navigation bar
        Examples:
            | section   |
            | Cursos    |
            | Recursos  |
            | Blog      |
            | Mentorías |
            | Udemy     |
