package elementsNavigation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
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
	String deleteLiveWrk;

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

	@FindBy(xpath = "//*[@id='file-input']")
	WebElementFacade wrklive_importfile; 

	@FindAll(@FindBy(xpath = "//mat-icon[text()='delete']"))
	//	@CacheLookup
	List<WebElement> DeleteWrkOutLive;

	@FindAll(@FindBy(xpath = "//mat-icon[text()='edit']"))
	//	@CacheLookup
	List<WebElement> EditWrkOutLive;


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

	public void SelectAndUploadFile(String importfile) throws InterruptedException 
	{
		Thread.sleep(2000);

		evaluateJavascript("$('#file-input').removeAttr(\"style\")");

		System.out.println("----------Uploadfile start--------"+ importfile);
		System.out.println(wrklive_importfile);
		System.out.println("Input Element" + wrklive_importfile.getTextValue());
		System.out.println("File Element" + wrklive_importfile.getTextValue());

		withAction().moveToElement(wrklive_importfile);
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData/";

		//		String path = this.getClass().getClassLoader().getResource(importfile).getPath();

		wrklive_importfile.sendKeys(path+importfile);
		System.out.println("Keys sent");


	}

	public void clickonexistingLiveWorkout() 
	{
		int i = randomestring.randomenumbers(EditWrkOutLive.size());
		EditWrkOutLive.get(i).click();

	}

	public void updateLiveWorkoutTitleAndDescription() 
	{
		txtworkoutlive_title.clear();
		txtworkoutlive_title.sendKeys(randomestring.WrkTitle1);
		txtworkoutlive_description.clear();
		txtworkoutlive_description.sendKeys(randomestring.WrkDesc1);
	}

	public void VerifyNewLiveWorkoutUpdated() 
	{
		WebElement updatedliveWorkout;


		for(int i=0 ; i<AllWorkoutLive.size();i++)
		{

			updatedliveWorkout = AllWorkoutLive.get(i);

			if(updatedliveWorkout.getText().equals(randomestring.WrkTitle1))
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
			System.out.println("Workout live is updated successfully");

		}
		else
		{
			System.out.println("Workout live is not updated successfully");
			Assert.assertEquals(false, result);

		}

	}

	public void ClickonDeleteicon() 
	{
		int i = randomestring.randomenumbers(DeleteWrkOutLive.size());
		deleteLiveWrk = DeleteWrkOutLive.get(i).getText();
		DeleteWrkOutLive.get(i).click();

	}

	public void ClickOnConfirmDelete() 
	{
		Alert confirmationAlert = getAlert();
		//driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("Alert text is " + alertText);
		confirmationAlert.accept();
		getAlert().accept();

	}
	public void VerifyLiveWorkoutisDeleted() 
	{
		WebElement deletedWorkoutlive;


		for(int i=0 ; i<AllWorkoutLive.size();i++)
		{

			deletedWorkoutlive = AllWorkoutLive.get(i);

			if(deletedWorkoutlive.getText().equals(deleteLiveWrk))
			{	
				result = false;
				break;
			}

			else
			{
				result = true;

			}
		}

		if(result==true)
		{
			Assert.assertEquals(true, result);
			System.out.println("Workout live is deleted successfully");

		}
		else
		{
			System.out.println("Workout live is not deleted successfully");
			Assert.assertEquals(false, result);

		}

	}

}


