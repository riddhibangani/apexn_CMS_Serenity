@workoutsOnDemand
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
  Scenario Outline: Add new workout with weights
    When click on Create a new workout button
    And enter Title and Description for Workouts
    And enter VideoURL as <videoURL>
    And enter duration for the video
    And select Genre as <genere>
    And select Level as <level>
    And enter Playlist ID as <playlistID>
    When specify that the user use weights
    And select Music category
    And select Instructor
    When click on select the file to import at "testimage.png"
    And click on save button
    Then the new workout is added successfully

    Examples: 
      | genere | level    | videoURL                                                                                                     | playlistID               |
      | CARDIO | BEGINNER | https://player.vimeo.com/external/407776843.hd.mp4?s=6c6cf52a6baa56955259aa2baf4c5f3c9706abfb&profile_id=175 | 5eb135fc6f6bd011cc8bbb74 |

  @addworkoutswithoutweights
  Scenario Outline: Add new workout without weights
    When click on Create a new workout button
    And enter Title and Description for Workouts
    And enter VideoURL as <videoURL>
    And enter duration for the video
    And select Genre as <genere>
    And select Level as <level>
    And enter Playlist ID as <playlistID>
    When specify that the user do not use weights
    And select Music category
    And select Instructor
    When click on select the file to import at "testimage.png"
    And click on save button
    Then the new workout is added successfully

    Examples: 
      | genere | level    | videoURL                                                                                                     | playlistID               |
      | CARDIO | BEGINNER | https://player.vimeo.com/external/407776843.hd.mp4?s=6c6cf52a6baa56955259aa2baf4c5f3c9706abfb&profile_id=175 | 5eb135fc6f6bd011cc8bbb74 |

  @addworkoutssplits
  Scenario Outline: Add new workout with splits
    When click on Create a new workout button
    And enter Title and Description for Workouts
    And enter VideoURL as <videoURL>
    And enter duration for the video
    And select Genre as <genere>
    And select Level as <level>
    And enter Playlist ID as <playlistID>
    When specify that the user do not use weights
    And select Music category
    And select Instructor
    When click on select the file to import at "testimage.png"
    When click on add splits
    And select New split
    And enter splits details as <Name>  and <Start> and <End>
    And click on save button
    Then the new workout is added successfully

    Examples: 
      | genere | level    | videoURL                                                                                                     | playlistID               | Name    | Start | End |
      | CARDIO | BEGINNER | https://player.vimeo.com/external/407776843.hd.mp4?s=6c6cf52a6baa56955259aa2baf4c5f3c9706abfb&profile_id=175 | 5eb135fc6f6bd011cc8bbb74 | Warm up |     0 |  30 |

  @addworkoutssegments
  Scenario Outline: Add new workout with splits
    And click on the existing workout
    And enter Title and Description for Workouts
    And enter VideoURL as <videoURL>
    And enter duration for the video
    And select Genre as <genere>
    And select Level as <level>
    And enter Playlist ID as <playlistID>
    When specify that the user do not use weights
    And select Music category
    And select Instructor
    When click on select the file to import at "testimage.png"
    When click on add splits
    And select New split
    And enter splits details as <Name>  and <Start> and <End>
    When click on segments
    And select segment1
    And enter  segment details as <SegmentStart> and <SegmentEnd> and <RPMLow> and <RPMHigh> and <ResistanceLow> and <ResistanceHigh>
    And click on save button
    Then the new workout is added successfully

    Examples: 
      | genere | level    | videoURL                                                                                                     | playlistID               | Name    | Start | End | SegmentStart | SegmentEnd | RPMLow | RPMHigh | ResistanceLow | ResistanceHigh |  |
      | CARDIO | BEGINNER | https://player.vimeo.com/external/407776843.hd.mp4?s=6c6cf52a6baa56955259aa2baf4c5f3c9706abfb&profile_id=175 | 5eb135fc6f6bd011cc8bbb74 | Warm up |     0 |  30 |            0 |         30 |     30 |      90 |             0 |              2 |  |

  @editWorkout
  Scenario: Edit existing workout
    And click on the existing workout
    And update Title and Description for Workouts
    And click on save button
    Then the workout is updated successfully

  @editWorkoutSplit
  Scenario Outline: Edit existing workout
    And click on the existing workout
    When click on add splits
    And select New split
    And update splits details as <Name>  and <Start> and <End>
    And click on save button
    Then the workout is updated successfully

    Examples: 
      | Name    | Start | End |
      | Workout |    30 | 100 |

  @archiveWrkOutOnDemand
  Scenario: Archive existing instructor
    And click on the existing active workout on demand
    When the archive option is selected
    And click on save button
    Then the workout on demand is archived

  @unarchiveWrkOutOnDemand
  Scenario: Archive existing instructor
    And click on the existing archived workout on demand
    When the archive option is deselected
    And click on save button
    Then the workout on demand is unarchived
