@LiveWorkout
Feature: Ability to add and edit Workouts live
  As an admin user I want to be able to add a new Workouts as well as edit existing Workouts and delete it

  Background: Login successflly to the APEX CMS portal and select Workouts from main menu
    Given user is on CMS login page
    When user enters username as and password
    And clicks on login button
    Then user is navigated to home page with page title
    When user click on the main menu
    And select the option as Live Workout

  @addliveworkouts
  Scenario Outline: Add live workout
    When click on Create a new live workout button
    And enter the date for live workout
    And enter start time for live workout
    And enter title for live workout
    And enter the description for live workouts
    And enter live video url <Vimeo>
    And enter duration for live workouts
    And select Genre as <genere>
    And select Level as <level>
    And enter Playlist ID as <playlistID>
    When specify that the user use weights
    And select Music category
    And select Instructor
    When click on select the file to import at "testimage.png" for live workout
    And click on save button for live workout
    Then the new live workout is added successfully

    Examples: 
      | Vimeo                                                                                                        | genere    | level    | playlistID               |
      | https://player.vimeo.com/external/427286507.source.mp4?s=480d3093e25d70c79b4cbada0453232b5e31d0ff&download=1 | ENDURANCE | ADVANCED | 5eb135fc6f6bd011cc8bbb74 |

  #@deleteliveworkouts
  #Scenario: Delete live workout
    #When click on delete workout
    #And confirm on delete item popup
    #Then the workout is deleted

  @editliveworkouts
  Scenario: Edit existing live workout
    And click on the existing live workout
    And update Title and Description for live Workouts
    And click on save button for live workout
    Then the live workout is updated successfully
