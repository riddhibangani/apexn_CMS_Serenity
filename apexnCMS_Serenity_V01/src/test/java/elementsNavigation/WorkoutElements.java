package elementsNavigation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utilities.GenerateRandomeString;

public class WorkoutElements extends PageObject
{
	GenerateRandomeString randomestring = new GenerateRandomeString();


	//WebElements

	@FindBy(id = "workout-on-demand")
	@CacheLookup
	WebElementFacade Wrkout_menuitem;

	@FindBy (xpath = "//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']//span[@class='mat-button-wrapper']")
	@CacheLookup
	WebElementFacade btnCreateNewWorkout;

	@FindBy (id ="title")
	@CacheLookup
	WebElementFacade txtworkout_title;

	@FindBy (id ="description")
	@CacheLookup
	WebElementFacade txtworkout_description;

	@FindBy (id ="videoUrl")
	@CacheLookup
	WebElementFacade txtworkout_videoUrl;

	@FindBy (id ="duration")
	@CacheLookup
	WebElementFacade numworkout_duration;

	@FindBy (id = "genre")
	@CacheLookup
	WebElementFacade drpworkout_genre;

	@FindBy (id = "level")
	@CacheLookup    
	WebElementFacade drpworkout_level;

	@FindBy (id = "playlist-id")
	@CacheLookup
	WebElementFacade txtworkout_playlistid;

	@FindBy (id = "weights-input")
	@CacheLookup
	WebElementFacade checkworkout_weights;

	@FindBy (id = "music")
	@CacheLookup
	WebElementFacade drpworkout_musiccategory;

	@FindBy (id = "instructor")
	@CacheLookup
	WebElementFacade drpdown_Instructor;

	@FindAll(@FindBy(xpath = "//mat-option"))
	//	@CacheLookup
	List<WebElement> drplists;




	//Action Methods

	public void selectWorkoutOption() {

		Wrkout_menuitem.waitUntilVisible().click();

	}

	public void ClickOnCreateNewWorkouts() 
	{

		btnCreateNewWorkout.waitUntilEnabled().click();
	}

	public void enterWorkoutTitleAndDescription() {

		txtworkout_title.waitUntilVisible().sendKeys(randomestring.WrkTitle);
		txtworkout_description.waitUntilVisible().sendKeys(randomestring.WrkDesc);

	}

	public void clickonexistingWorkout() {
		// TODO Auto-generated method stub

	}

	public void EnterWorkoutVideoURL(String videourl) {

		txtworkout_videoUrl.sendKeys(videourl);

	}

	public void EnterWorkoutDuration() {

		numworkout_duration.sendKeys(String.valueOf(randomestring.wrkduration));
	}

	public void checkUseruserWeights() {

		checkworkout_weights.waitUntilClickable();
		Boolean checekboxDisplay = checkworkout_weights.isDisplayed();
		System.out.println("Is the checkbox displayed: " + checekboxDisplay);

		Boolean checkboxSelected = checkworkout_weights.isSelected();
		System.out.println("Is the checkbox selected: "+ checkboxSelected);

		checkworkout_weights.click();

		Boolean checkboxStatus = checkworkout_weights.isSelected();
		System.out.println("The updated status of checkbox is: "+ checkboxStatus);



	}

	public void unCheckUseruseWeights() {
		// TODO Auto-generated method stub

	}

	public void SelectWorkoutGener(String gener) {

		drpworkout_genre.click();

		for (WebElement drplist : drplists)
		{
			if(drplist.getText().equals(gener))
			{
				drplist.click();
				break;
			}
			else
			{
				System.out.println("Value not found");
			}
		}


	}

	public void SelectWorkoutLevel(String level) {

		drpworkout_level.waitUntilEnabled().click();
		
		for (WebElement drplist : drplists)
		{
			if(drplist.getText().equals(level))
			{
				drplist.click();
				break;
			}
			else
			{
				System.out.println("Value not found");
			}
		}

	}

	public void EnterWorkoutPlaylistID(String PlaylistID) {

		txtworkout_playlistid.sendKeys(PlaylistID);

	}

	public void SelectWorkoutMusic() {

		drpworkout_musiccategory.waitUntilClickable().click();
		drplists.get(0).click();

	}

	public void SelectWorkoutInstructor() {

		drpdown_Instructor.waitUntilVisible().click();
		
		drplists.get(0).click();

	}

	public void VerifyNewWorkoutAdded() {
		// TODO Auto-generated method stub

	}

	public void ClickAddSplits() {
		// TODO Auto-generated method stub

	}

	public void ClickNewSplit() {
		// TODO Auto-generated method stub

	}

	public void EnterSplitDetails() {
		// TODO Auto-generated method stub

	}

	public void UpdateSplitDetails() {
		// TODO Auto-generated method stub

	}

	public void ClickSegments() {
		// TODO Auto-generated method stub

	}

	public void SelectNewSegment1() {
		// TODO Auto-generated method stub

	}

	public void EnterAllSegmentDetails() {
		// TODO Auto-generated method stub

	}




}
