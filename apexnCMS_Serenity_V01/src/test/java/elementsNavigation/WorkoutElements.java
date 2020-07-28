package elementsNavigation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utilities.GenerateRandomeString;

public class WorkoutElements extends PageObject
{
	GenerateRandomeString randomestring = new GenerateRandomeString();
	Boolean result = true;
	String currentArchivedWrkOutOnDemand = null;
	String currentActiveWrkOutOnDemand = null;


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

	@FindBy (xpath = "//*[@id='weights']/label")
	//	@CacheLookup
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

	@FindAll(@FindBy(xpath = "//mat-card-content/h4"))
	//	@CacheLookup
	List<WebElement> AllWorkoutOnDemand;

	@FindAll(@FindBy(xpath = "//mat-icon[text()='edit']"))
	//	@CacheLookup
	List<WebElement> EditWrkOutOnDemand;

	@FindAll(@FindBy(xpath = "//mat-card[not(contains(@class,'apex-archived'))]/descendant::mat-icon[text()='edit']"))
	//	@CacheLookup
	List<WebElement> NotArchiveWrkOutOnDemand;

	@FindAll(@FindBy(xpath = "//mat-card[(contains(@class,'apex-archived'))]//h4"))
	//	@CacheLookup
	List<WebElement> ArchiveWrkOutOnDemand;

	@FindAll(@FindBy(xpath = "//mat-card[(contains(@class,'apex-archived'))]/descendant::mat-icon[text()='edit']"))
	//	@CacheLookup
	List<WebElement> NotActiveWrkOutOnDemand;

	@FindAll(@FindBy(xpath = "//mat-card[not(contains(@class,'apex-archived'))]//h4"))
	//	@CacheLookup
	List<WebElement> ActiveWrkOutOnDemand;

	@FindBy (id = "add-split")
	@CacheLookup
	WebElementFacade Wrk_splits;

	@FindBy(xpath = "//mat-panel-title[@class='mat-expansion-panel-header-title']")
	@CacheLookup
	WebElementFacade Wrk_Newsplits;

	@FindBy(id = "split-0-name")
	@CacheLookup
	WebElementFacade Wrk_Newsplits_Name;

	@FindBy(id = "split-0-start")
	@CacheLookup
	WebElementFacade Wrk_Newsplits_Start;

	@FindBy(id = "split-0-end")
	@CacheLookup
	WebElementFacade Wrk_Newsplits_End;

	//Segments

	@FindBy(xpath = "//*[@id='split-0-add']/span/mat-icon")
	@CacheLookup
	WebElementFacade Wrk_segment;

	@FindBy(xpath = "//*[contains(@id,'mat-expansion-panel-header-')]/span[1]/mat-panel-title")
	@CacheLookup
	List<WebElement> Wrk_NewSegment;
	
	@FindBy(id = "split-0-segment-0-start")
	@CacheLookup
	WebElementFacade Wrk_NewSegment_Start;
	
	@FindBy(id = "split-0-segment-0-end")
	@CacheLookup
	WebElementFacade Wrk_NewSegment_End;
	
	@FindBy(id = "split-0-segment-0-rpmLow")
	@CacheLookup
	WebElementFacade Wrk_NewSegment_RPMLow;
	
	@FindBy(id = "split-0-segment-0-rpmHigh")
	@CacheLookup
	WebElementFacade Wrk_NewSegment_RPMHigh;
	
	@FindBy(id = "split-0-segment-0-resistanceLow")
	@CacheLookup
	WebElementFacade Wrk_NewSegment_ResistanceLow;

	@FindBy(id = "split-0-segment-0-resistanceHigh")
	@CacheLookup
	WebElementFacade Wrk_NewSegment_ResistanceHigh;

	//Action Methods

	public void selectWorkoutOption() {

		Wrkout_menuitem.waitUntilVisible().click();

	}

	public void ClickOnCreateNewWorkouts() 
	{

		btnCreateNewWorkout.waitUntilEnabled().click();
	}

	public void enterWorkoutTitleAndDescription() {

		txtworkout_title.clear();
		txtworkout_title.waitUntilVisible().sendKeys(randomestring.WrkTitle);
		txtworkout_description.clear();
		txtworkout_description.waitUntilVisible().sendKeys(randomestring.WrkDesc);

	}
	
	public void updateWorkoutTitleAndDescription() 
	{
		txtworkout_title.clear();
		txtworkout_title.waitUntilVisible().sendKeys(randomestring.WrkTitle1);
		txtworkout_description.clear();
		txtworkout_description.waitUntilVisible().sendKeys(randomestring.WrkDesc1);

	}

	public void clickonexistingWorkout() {


		int i = randomestring.randomenumbers(EditWrkOutOnDemand.size());
		EditWrkOutOnDemand.get(i).click();

	}

	public void EnterWorkoutVideoURL(String videourl) {

		txtworkout_videoUrl.clear();
		txtworkout_videoUrl.sendKeys(videourl);

	}

	public void EnterWorkoutDuration() {

		numworkout_duration.clear();
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

	public void unCheckUseruseWeights() 
	{
		checkworkout_weights.waitUntilClickable();
		Boolean checekboxDisplay = checkworkout_weights.isDisplayed();
		System.out.println("Is the checkbox displayed: " + checekboxDisplay);

		Boolean checkboxSelected = checkworkout_weights.isSelected();
		System.out.println("Is the checkbox selected: "+ checkboxSelected);

		if(checkboxSelected==true)
		{
			System.out.println("Is the checkbox selected: "+ checkboxSelected);
			checkworkout_weights.click();
		}
		else
		{
			System.out.println("Is the checkbox selected: "+ checkboxSelected);

		}

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

		txtworkout_playlistid.click();
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

	public void VerifyNewWorkoutAdded() 
	{

		WebElement newWorkoutOnDemand;


		for(int i=0 ; i<AllWorkoutOnDemand.size();i++)
		{

			newWorkoutOnDemand = AllWorkoutOnDemand.get(i);

			if(newWorkoutOnDemand.getText().equals(randomestring.WrkTitle))
			{	
				result = true;
				break;
			}

			else
			{
				result = false;

			}
		}

		if(result==true)
		{
			Assert.assertEquals(true, result);
			System.out.println("Workout on demand is added successfully");

		}
		else
		{
			System.out.println("Workout on demand is not added successfully");
			Assert.assertEquals(false, result);

		}

	}


	// Splits test methods

	public void ClickAddSplits() 
	{
		Wrk_splits.click();

	}

	public void ClickNewSplit()  
	{
		//		Wrk_Newsplits.wait(2000);

		//		withAction().moveToElement(Wrk_Newsplits).build().perform();
		Wrk_Newsplits.waitUntilPresent().click();

	}

	public void EnterSplitDetails(String name, String start, String end) 
	{
		Wrk_Newsplits_Name.clear();
		Wrk_Newsplits_Name.sendKeys(name);
		Wrk_Newsplits_Start.clear();
		Wrk_Newsplits_Start.sendKeys(start);
		Wrk_Newsplits_End.clear();
		Wrk_Newsplits_End.sendKeys(end);

	}

	public void UpdateSplitDetails(String name, String start, String end) 
	{
		Wrk_Newsplits_Name.clear();
		Wrk_Newsplits_Name.sendKeys(name);
		Wrk_Newsplits_Start.clear();
		Wrk_Newsplits_Start.sendKeys(start);
		Wrk_Newsplits_End.clear();
		Wrk_Newsplits_End.sendKeys(end);

	}

	// Segments test methods
	
	public void ClickSegments() 
	{
		Wrk_segment.waitUntilPresent().click();

	}

	public void SelectNewSegment1() 
	{
		WebElement newSegment;

		for(int i=0 ; i<Wrk_NewSegment.size();i++)
		{
			newSegment = Wrk_NewSegment.get(i);

			if(newSegment.getText().contains("Segment"))
			{
				newSegment.click();
				break;
			}
			else
			{
				System.out.println("Segment panel not visible");
			}
		}



	}

	public void EnterAllSegmentDetails(String segmentstart, String segmentend, String rpmlow, String rpmhigh, String resistancelow, String resistancehigh) 
	{
		
		Wrk_NewSegment_Start.clear();
		Wrk_NewSegment_Start.sendKeys(segmentstart);
		Wrk_NewSegment_End.clear();
		Wrk_NewSegment_End.sendKeys(segmentend);
		Wrk_NewSegment_RPMLow.clear();
		Wrk_NewSegment_RPMLow.sendKeys(rpmlow);
		Wrk_NewSegment_RPMHigh.clear();
		Wrk_NewSegment_RPMHigh.sendKeys(rpmhigh);
		Wrk_NewSegment_ResistanceLow.clear();
		Wrk_NewSegment_ResistanceLow.sendKeys(resistancelow);
		Wrk_NewSegment_ResistanceHigh.clear();
		Wrk_NewSegment_ResistanceHigh.sendKeys(resistancehigh);

	}

	//archive and active workout on demand


	public void ClickOnActiveWorkoutOnDemand() 
	{

		int i = randomestring.randomenumbers(NotArchiveWrkOutOnDemand.size());
		NotArchiveWrkOutOnDemand.get(i).click();
		currentArchivedWrkOutOnDemand = txtworkout_title.getTextValue();

		System.out.println(txtworkout_title.getTextValue());
		System.out.println(txtworkout_title.getText());
		System.out.println(txtworkout_title.getTextContent());
		System.out.println(txtworkout_title.getValue());

	}

	public void VerifyArchivedWorkoutOnDemand() 
	{
		WebElement ArchivedWorkoutOnDemand;

		for(int i=0 ; i<ArchiveWrkOutOnDemand.size();i++)
		{

			ArchivedWorkoutOnDemand = ArchiveWrkOutOnDemand.get(i);

			if(ArchivedWorkoutOnDemand.getText().equals(currentArchivedWrkOutOnDemand))
			{	

				result = true;
				break;

			}

			else
			{
				result = false;

			}

		}

		if(result==true)
		{
			Assert.assertEquals(true, result);
			System.out.println("Workout on demand is archived successfully");

		}
		else
		{
			System.out.println("Workout on demand is not archived successfully");
			Assert.assertEquals(false, result);

		}

	}

	public void ClickOnArchivedWorkoutOnDemand() 
	{
		int i = randomestring.randomenumbers(NotActiveWrkOutOnDemand.size());
		NotActiveWrkOutOnDemand.get(i).click();

		currentActiveWrkOutOnDemand = txtworkout_title.getTextValue();
		System.out.println(txtworkout_title.getTextValue());

	}

	public void VerifyUnArchivedWorkoutOnDemand() 
	{
		WebElement UnArchivedWorkoutOnDemand;

		for(int i=0 ; i<ActiveWrkOutOnDemand.size();i++)
		{

			UnArchivedWorkoutOnDemand = ActiveWrkOutOnDemand.get(i);

			if(UnArchivedWorkoutOnDemand.getText().equals(currentActiveWrkOutOnDemand))
			{	

				result = true;
				break;

			}

			else
			{
				result = false;

			}

		}

		if(result==true)
		{
			Assert.assertEquals(true, result);
			System.out.println("Workout on demand is unarchived successfully");

		}
		else
		{
			System.out.println("Workout on demand is not unarchived successfully");
			Assert.assertEquals(false, result);

		}

	}

	public void VerifyNewWorkoutUpdated() 
	{
		WebElement updatedWorkout;


		for(int i=0 ; i<AllWorkoutOnDemand.size();i++)
		{

			updatedWorkout = AllWorkoutOnDemand.get(i);

			if(updatedWorkout.getText().equals(randomestring.WrkTitle1))
			{	
				result = true;
				break;
			}

			else
			{
				result = false;

			}
		}

		if(result==true)
		{
			Assert.assertEquals(true, result);
			System.out.println("Workout on demand is updated successfully");

		}
		else
		{
			System.out.println("Workout on demand is not updated successfully");
			Assert.assertEquals(false, result);

		}
		
	}

	

}


