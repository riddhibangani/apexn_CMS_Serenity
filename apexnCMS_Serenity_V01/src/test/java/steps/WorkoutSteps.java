package steps;

import elementsNavigation.ActionsElements;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.DashboardPage;
import pages.WorkoutPage;

public class WorkoutSteps {

	@Steps
	WorkoutPage workout;

	@Steps
	ActionsElements action; 

	@Steps
	DashboardPage dash;


	@And("^select the option as Workouts$")
	public void select_the_option_as_workouts()
	{
		workout.selectWrkOutoption();
	}

	@When("^click on Create a new workout button$")
	public void click_on_create_a_new_workout_button() 
	{
		workout.clickOnCreateWorkouts();
	}

	@And("^enter Title and Description for Workouts$")
	public void enter_title_and_description_for_workouts() 
	{
		workout.enterTitleAndDescription();
	}

	@And("^click on the existing workout$")
	public void click_on_the_existing_workout() 
	{
		workout.clickOnExistingWorkout();
	}

	@And("^update Title and Description for Workouts$")
	public void update_title_and_description_for_workouts() 
	{
		workout.updateTitleAndDescription();
	}

	@And("^enter VideoURL as (.+)$")
	public void enter_videourl_as(String videourl)

	{
		workout.enterVideoURL(videourl);
	}

	@And("^enter duration for the video$")
	public void enter_duration_for_the_video() 
	{

		workout.enterDuration();
	}

	@When("^specify that the user use weights$")
	public void specify_that_the_user_use_weights() 
	{
		workout.UserUsesWeights();
	}

	@When("^specify that the user do not use weights$")
	public void specify_that_the_user_do_not_use_weights()
	{
		workout.UserDoNotUseWeights();
	}


	@And("^select Genre as (.+)$")
	public void select_genre_as(String genere) 
	{
		workout.selectGenere(genere);
	}

	@And("^select Level as (.+)$")
	public void select_level_as(String level) 
	{
		workout.selectLevel(level);
	}

	@And("^enter Playlist ID as (.+)$")
	public void enter_playlist_id_as(String playlistid)
	{
		workout.EnterPlaylistID(playlistid);
	}

	@And("^select Music category$")
	public void select_music_category()
	{
		workout.selectMusicCategory();
	}

	@And("^select Instructor$")
	public void select_instructor() 
	{
		workout.selectInstructor();
	}

	@Then("^the new workout is added successfully$")
	public void the_new_workout_is_added_successfully() {
		workout.verifyNewlyAddedWorkout();
	}


	@Then("^the workout is updated successfully$")
	public void the_workout_is_updated_successfully() 
	{
		workout.verifyNewlyUpdatedWorkout();
	}

	@And("^click on the existing active workout on demand$")
	public void click_on_the_existing_active_workout_on_demand()
	{
		workout.clickOnActiveWrkOutOnDemand();
	}

	@Then("^the workout on demand is archived$")
	public void the_workout_on_demand_is_archived() 
	{
		workout.verifyWrkOnDemandArchive();
	}

	@And("^click on the existing archived workout on demand$")
	public void click_on_the_existing_archived_workout_on_demand() 
	{
		workout.clickOnArchivedWrkOutOnDemand();
	}

	@Then("^the workout on demand is unarchived$")
	public void the_workout_on_demand_is_unarchived()
	{
		workout.verifyWrkOutOnDemandUnArchive();
	}


	@When("^click on add splits$")
	public void click_on_add_splits() 
	{

		workout.clickOnAddSplits();
	}

	@And("^select New split$")
	public void select_new_split()
	{
		workout.clickOnNewSplit();
	}

	@And("^enter splits details as (.+)  and (.+) and (.+)$")
	public void enter_splits_details_as_and_and(String name, String start, String end)
	{
		workout.enterSplitDetails(name,start,end);
	}

	@And("^update splits details as (.+)  and (.+) and (.+)$")
	public void update_splits_details_as_and_and(String name, String start, String end) 
	{

		workout.updateSplitDetails(name,start,end);
	}


	@When("^click on segments$")
	public void click_on_segments() 
	{
		workout.clickOnSegments();
	}

	@And("^select segment1$")
	public void select_segment1() 
	{
		workout.SelectSegment1();
	}

	@And("^enter  segment details as (.+) and (.+) and (.+) and (.+) and (.+) and (.+)$")
	public void enter_segment_details_as_and_and_and_and_and(String segmentstart, String segmentend, String rpmlow, String rpmhigh, String resistancelow, String resistancehigh) 
	{

		workout.enterSegmentDetails(segmentstart,segmentend,rpmlow,rpmhigh,resistancelow,resistancehigh);
	}

}
