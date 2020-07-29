package steps;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.WorkoutLivePage;

public class WorkoutLiveSteps {

	@Steps
	WorkoutLivePage worklive;


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



}
