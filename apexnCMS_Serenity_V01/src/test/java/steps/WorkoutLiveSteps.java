package steps;

import elementsNavigation.ActionsElements;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.WorkoutLivePage;

public class WorkoutLiveSteps {

	@Steps
	WorkoutLivePage worklive;
	
	@Steps
	ActionsElements action; 


	@And("^select the option as Live Workout$")
	public void select_the_option_as_live_workout() 
	{
		worklive.selectWrkLiveoption();
	}


	@When("^click on Create a new live workout button$")
	public void click_on_create_a_new_live_workout_button() 
	{
		worklive.clickOnCreateWorkoutsLive();
	}

	@And("^enter the date for live workout$")
	public void enter_the_date_for_live_workout() 
	{
		worklive.EnterStartDate();
	}

	@And("^enter start time for live workout$")
	public void enter_start_time_for_live_workout() 
	{
		worklive.EnterStartTime();
	}

	@And("^enter title for live workout$")
	public void enter_title_for_live_workout()
	{
		worklive.EnterWrkLiveTitle();
	}


	@And("^enter the description for live workouts$")
	public void enter_the_description_for_live_workouts() 
	{
		worklive.EnterWrkLiveDesp();
	}

	@And("^enter live video url (.+)$")
	public void enter_live_video_url(String vimeo) 
	{
		worklive.EnterWrkLiveVideoURL(vimeo);
	}

	@And("^enter duration for live workouts$")
	public void enter_duration_for_live_workouts() 
	{
		worklive.EnterWrkLiveDuration();
	}


	@Then("^the new live workout is added successfully$")
	public void the_new_live_workout_is_added_successfully() 
	{
		worklive.VerifyAddedNewWrkLive();
	}

	@When("^click on select the file to import at \"([^\"]*)\" for live workout$")
    public void click_on_select_the_file_to_import_at_something_for_live_workout(String importfile) throws InterruptedException 
    {	
		worklive.SelectFiletoImport(importfile);
    }

	@And("^click on save button for live workout$")
    public void click_on_save_button_for_live_workout(){
        
		action.clicksaveLiveWrkButton();
    }


    @And("^click on the existing live workout$")
    public void click_on_the_existing_live_workout() 
    {
    	worklive.clickOnExistingLiveWorkout();
    }
    
    @And("^update Title and Description for live Workouts$")
    public void update_title_and_description_for_live_workouts() 
    {
    	worklive.updateLiveTitleAndDescription();
    }
    
    @Then("^the live workout is updated successfully$")
    public void the_live_workout_is_updated_successfully() 
    {
    	worklive.verifyNewlyUpdatedLiveWorkout();
    }
    
    @When("^click on delete workout$")
    public void click_on_delete_workout() 
    {
    	worklive.deleteLiveWorkout();
    }
    
    @And("^confirm on delete item popup$")
    public void confirm_on_delete_item_popup() 
    {
    	worklive.clickonConfirmDelete();
    }

    @Then("^the workout is deleted$")
    public void the_workout_is_deleted() 
    {
    	worklive.verifyDeletedLiveWrkout();
    }
}
