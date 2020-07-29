package elementsNavigation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utilities.GenerateRandomeString;

public class WorkoutLiveElements extends PageObject{
	
	GenerateRandomeString randomestring = new GenerateRandomeString();
	Boolean result = true;
	
	//WebElements
	
	@FindBy(id = "workout-live")
	@CacheLookup
	WebElementFacade Wrkout_live_menuitem;
	
	@FindBy(xpath = "//span[contains(text(),'Create a new workout')]")
	@CacheLookup
	WebElementFacade btnCreateLiveWorkout;
	
	@FindBy(id = "startDate")
	@CacheLookup
	WebElementFacade Wrklive_startdate;
	
	@FindBy(id = "startTime")
	@CacheLookup
	WebElementFacade Wrklive_starttime;
	
	@FindBy (id ="title")
	@CacheLookup
	WebElementFacade txtworkoutlive_title;
	
	@FindBy (id ="description")
	@CacheLookup
	WebElementFacade txtworkoutlive_description;
	
	@FindBy (id ="videoUrl")
	@CacheLookup
	WebElementFacade txtworkoutlive_videoUrl;
	
	@FindBy (id ="duration")
	@CacheLookup
	WebElementFacade numworkoutlive_duration;
	
	@FindAll(@FindBy(xpath = "//mat-card-content/h4"))
	//	@CacheLookup
	List<WebElement> AllWorkoutLive;
	

	public void SelectWorkoutLiveOption() 
	{
		Wrkout_live_menuitem.waitUntilVisible().click();
		
	}

	public void ClickOnCreateLiveWorkout() 
	{
		btnCreateLiveWorkout.waitUntilEnabled().click();
		
	}

	public void EnterLiveWorkoutStartDate() 
	{
		
		Wrklive_startdate.sendKeys(randomestring.date);
	}

	public void EnterLiveWorkoutStartTime() 
	{
		Wrklive_starttime.sendKeys(randomestring.time);
	}

	public void EnterLiveWorkoutTitle() 
	{
		txtworkoutlive_title.sendKeys(randomestring.WrkTitle);
		
	}

	public void EnterLiveWorkoutDescription() 
	{
		txtworkoutlive_description.sendKeys(randomestring.WrkDesc);
		
	}

	public void EnterLiveWorkoutVideoURL(String vimeo) 
	{
		txtworkoutlive_videoUrl.sendKeys(vimeo);
		
	}

	public void EnterLiveWorkoutDuration() 
	{
		numworkoutlive_duration.sendKeys(String.valueOf(randomestring.wrkduration));
		
	}

	public void VerifyNewlyAddedLiveWorkout() 
	{
		WebElement newWorkoutlive;


		for(int i=0 ; i<AllWorkoutLive.size();i++)
		{

			newWorkoutlive = AllWorkoutLive.get(i);

			if(newWorkoutlive.getText().equals(randomestring.WrkTitle))
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
			System.out.println("Workout live is added successfully");

		}
		else
		{
			System.out.println("Workout live is not added successfully");
			Assert.assertEquals(false, result);

		}
		
	}

}
