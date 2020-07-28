@filter
Feature: Apply filters on Instructors, Music and Workouts

  Background: Initial login for filter scenarios
    Given user is on CMS login page
    When user enters username as and password
    And clicks on login button
    Then user is navigated to home page with page title

  @filterInst
  Scenario Outline: Check filters for Instructors
    When user click on the main menu
    And select the option as Instructor
    And select "<filter>"
    Then the filtered list should be visible for "<filter>"

    Examples: 
      | filter  |
      | All     |
      | Active  |
      | Archive |

  @filterMusic
  Scenario Outline: Check filters for Music Category
    When user click on the main menu
    And select the option as Music categories
    And select "<filter>"
    Then the filtered list should be visible for "<filter>"

    Examples: 
      | filter  |
      | All     |
      | Active  |
      | Archive |
      
      
  @filterWorkOutOnDemand
  Scenario Outline: Check filters for Workout on demand Category
    When user click on the main menu
    And select the option as Workouts
    And select "<filter>"
    Then the filtered list should be visible for "<filter>"

    Examples: 
      | filter  |
      | All     |
      | Active  |
      | Archive |
