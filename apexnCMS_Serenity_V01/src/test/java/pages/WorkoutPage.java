package pages;

import elementsNavigation.WorkoutElements;
import net.thucydides.core.annotations.Step;

public class WorkoutPage {
	
	WorkoutElements workelements;

	@Step
	public void selectWrkOutoption() 
	{
		workelements.selectWorkoutOption();
		
	}
	@Step
	public void clickOnCreateWorkouts() {
		
		workelements.ClickOnCreateNewWorkouts();
		
	}

	@Step
	public void enterTitleAndDescription() 
	{
		
		workelements.enterWorkoutTitleAndDescription();
	}

	@Step
	public void clickOnExistingWorkout() 
	{
		workelements.clickonexistingWorkout();
	}

	@Step
	public void enterVideoURL(String videourl) 
	{
		workelements.EnterWorkoutVideoURL(videourl);
		
	}
	
	@Step
	public void enterDuration() 
	{
		workelements.EnterWorkoutDuration();
		
	}

	@Step
	public void UserUsesWeights() 
	{
		workelements.checkUseruserWeights();
		
	}

	@Step
	public void UserDoNotUseWeights() 
	{
		workelements.unCheckUseruseWeights();
	}

	@Step
	public void selectGenere(String gener) 
	{
		workelements.SelectWorkoutGener(gener);
		
	}

	@Step
	public void selectLevel(String level) 
	{
		workelements.SelectWorkoutLevel(level);
		
	}

	@Step
	public void EnterPlaylistID(String PlaylistID) 
	{
		workelements.EnterWorkoutPlaylistID(PlaylistID);
	}

	@Step
	public void selectMusicCategory() 
	{
		workelements.SelectWorkoutMusic();
		
	}

	@Step
	public void selectInstructor() 
	{
		workelements.SelectWorkoutInstructor();
		
	}

	@Step
	public void verifyNewlyAddedWorkout() 
	{
		workelements.VerifyNewWorkoutAdded();
		
	}

	@Step
	public void clickOnAddSplits() 
	{
		workelements.ClickAddSplits();
		
	}

	@Step
	public void clickOnNewSplit() 
	{
		
		workelements.ClickNewSplit();
		
	}

	@Step
	public void enterSplitDetails() 
	{
		
		workelements.EnterSplitDetails();
		
	}

	@Step
	public void updateSplitDetails() 
	{
		
		workelements.UpdateSplitDetails();
		
	}

	@Step
	public void clickOnSegments() 
	{
		
		workelements.ClickSegments();
		
	}

	@Step
	public void SelectSegment1() 
	{
		
		workelements.SelectNewSegment1();
		
	}
	
	@Step
	public void enterSegmentDetails() 
	{
		workelements.EnterAllSegmentDetails();
	}

}
