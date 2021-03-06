@musicCategory
Feature: Ability to add and edit music categories
  As an admin user I want to be able to add a new music categoris as well as edit existing music categories

  
  Background: Login successflly to the APEX CMS portal and select Music Category from main menu
  	Given user is on CMS login page
    When user enters username as and password
    And clicks on login button
    Then user is navigated to home page with page title
    When user click on the main menu
    And select the option as Music categories
  
   @addMusic
  Scenario: Add new music category
    When click on Create a new music category button
    And enter the title for music
    And click on save button
    Then the new music category is added successfully
   
    
    @addandEditMusic
    Scenario: Add new music category and edit the same
    When click on Create a new music category button
    And enter the title for music
    And click on save button
    Then the new music category is added successfully
    When click on the new music category created
    And update the title for music
    And click on save button
    Then the music category is updated successfully
   
    
    @EditMusic
    Scenario: Edit existing music category
    And click on the existing music category
    And update the title for music
    And click on save button
    Then the music category is updated successfully
    
    
    @archiveMusic
    Scenario: Archive existing music category
    And click on the existing music category
    When the archive option is selected
    And click on save button
    Then the music category is archived
    