@workouts
Feature: Ability to add and edit Workouts
  As an admin user I want to be able to add a new Workouts as well as edit existing Workouts

  Background: Login successflly to the APEX CMS portal and select Workouts from main menu
    Given user is on CMS login page
    When user enters username as and password
    And clicks on login button
    Then user is navigated to home page with page title
    When user click on the main menu
    And select the option as Workouts

  @addworkoutswithweights
  Scenario: Add new workout with weights
    When click on Create a new workout button
    And enter Title and Description for Workouts
    And enter VideoURL as "https://player.vimeo.com/external/407776843.hd.mp4?s=6c6cf52a6baa56955259aa2baf4c5f3c9706abfb&profile_id=175"
    And enter duration as "1239"
    And select Genre as "CARDIO"
    And select Level as "BEGINNER"
    And enter Playlist ID as "5eb135fc6f6bd011cc8bbb74"
    When specify that the user use weights
    And select Music category
    And select Instructor
    When click on select the file to import at "/Users/user/Downloads/1589466155796-1024.png"
    And click on save button
    Then the new workout is added successfully

  @addworkoutswithoutweights
  Scenario: Add new workout without weights
    When click on Create a new workout button
    And enter Title and Description for Workouts
    And enter VideoURL as "https://player.vimeo.com/external/407776843.hd.mp4?s=6c6cf52a6baa56955259aa2baf4c5f3c9706abfb&profile_id=175"
    And enter duration as "1239"
    And select Genre as "CARDIO"
    And select Level as "BEGINNER"
    And enter Playlist ID as "5eb135fc6f6bd011cc8bbb74"
    When specify that the user do not use weights
    And select Music category
    And select Instructor
    When click on select the file to import at "/Users/user/Downloads/1589466155796-1024.png"
    And click on save button
    Then the new workout is added successfully

  @addworkoutssplits
  Scenario: Add new workout with splits
    When click on Create a new workout button
    And enter Title and Description for Workouts
    And enter VideoURL as "https://player.vimeo.com/external/407776843.hd.mp4?s=6c6cf52a6baa56955259aa2baf4c5f3c9706abfb&profile_id=175"
    And enter duration as "1239"
    And select Genre as "CARDIO"
    And select Level as "BEGINNER"
    And enter Playlist ID as "5eb135fc6f6bd011cc8bbb74"
    When specify that the user do not use weights
    And select Music category
    And select Instructor
    When click on select the file to import at "/Users/user/Downloads/1589466155796-1024.png"
    When click on add splits
    And select New split
    And enter Name , Start and End
    And click on save button
    Then the new workout is added successfully

  @addworkoutssegments
  Scenario: Add new workout with splits
    When click on Create a new workout button
    And enter Title and Description for Workouts
    And enter VideoURL as "https://player.vimeo.com/external/407776843.hd.mp4?s=6c6cf52a6baa56955259aa2baf4c5f3c9706abfb&profile_id=175"
    And enter duration as "1239"
    And select Genre as "CARDIO"
    And select Level as "BEGINNER"
    And enter Playlist ID as "5eb135fc6f6bd011cc8bbb74"
    When specify that the user do not use weights
    And select Music category
    And select Instructor
    When click on select the file to import at "/Users/user/Downloads/1589466155796-1024.png"
    When click on add splits
    And select New split
    And enter Name , Start and End
    When click on segments
    And select segment1
    And enter  segment details
    And click on save button
    Then the new workout is added successfully

  @editWorkout
  Scenario: Edit existing workout
    And click on the existing workout
    And update Title and Description for Workouts
    And click on save button
    Then the workout is updated successfully

  @editWorkoutSplit
  Scenario: Edit existing workout
    And click on the existing workout
    And update the split details
    And click on save button
    Then the workout is updated successfully
