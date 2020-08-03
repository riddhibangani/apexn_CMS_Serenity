package pages;

import elementsNavigation.WorkoutLiveElements;
import net.thucydides.core.annotations.Step;

public class WorkoutLivePage {
	
	
	WorkoutLiveElements workliveelements;

	@Step
	public void selectWrkLiveoption() 
	{
		workliveelements.SelectWorkoutLiveOption();
		
	}

	@Step
	public void clickOnCreateWorkoutsLive() 
	{
		workliveelements.ClickOnCreateLiveWorkout();
		
	}

	@Step
	public void EnterStartDate() 
	{
		workliveelements.EnterLiveWorkoutStartDate();
		
	}

	@Step
	public void EnterStartTime() 
	{
		workliveelements.EnterLiveWorkoutStartTime();
		
	}

	@Step
	public void EnterWrkLiveTitle() 
	{
		workliveelements.EnterLiveWorkoutTitle();
		
	}

	@Step
	public void EnterWrkLiveDesp() 
	{
		workliveelements.EnterLiveWorkoutDescription();
		
	}
	
	@Step
	public void EnterWrkLiveVideoURL(String vimeo) 
	{
		workliveelements.EnterLiveWorkoutVideoURL(vimeo);
		
	}

	@Step
	public void EnterWrkLiveDuration() 
	{
		workliveelements.EnterLiveWorkoutDuration();
		
	}

	@Step
	public void VerifyAddedNewWrkLive() 
	{
		workliveelements.VerifyNewlyAddedLiveWorkout();
		
	}

	@Step
	public void SelectFiletoImport(String importfile) throws InterruptedException 
	{
		workliveelements.SelectAndUploadFile(importfile);
		
	}

	@Step
	public void clickOnExistingLiveWorkout() 
	{
		workliveelements.clickonexistingLiveWorkout();
		
	}

	@Step
	public void updateLiveTitleAndDescription() 
	{
		workliveelements.updateLiveWorkoutTitleAndDescription();
		
	}

	@Step
	public void verifyNewlyUpdatedLiveWorkout() 
	{
		workliveelements.VerifyNewLiveWorkoutUpdated();
		
	}

	@Step
	public void deleteLiveWorkout() 
	{
	
		workliveelements.ClickonDeleteicon();
		
	}

	@Step
	public void clickonConfirmDelete() 
	{
		
		workliveelements.ClickOnConfirmDelete();
	}

	@Step
	public void verifyDeletedLiveWrkout() 
	{
		
		workliveelements.VerifyLiveWorkoutisDeleted();
	}

}
