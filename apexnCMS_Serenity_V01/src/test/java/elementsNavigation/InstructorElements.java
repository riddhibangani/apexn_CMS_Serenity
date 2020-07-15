package elementsNavigation;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//import net.thucydides.core.pages.components.FileToUpload;
import utilities.ConfigFileReader;
import utilities.GenerateRandomeString;

public class InstructorElements extends PageObject
{

	ConfigFileReader configFileReader= new ConfigFileReader();
	GenerateRandomeString randomestring = new GenerateRandomeString();

	@FindBy(id = "instructors")
	@CacheLookup
	WebElementFacade Inst_menuitem;

	@FindBy(xpath = "//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")
	@CacheLookup
	WebElementFacade btnCreateNewInst;

	@FindBy(id = "name")
	@CacheLookup
	WebElementFacade txtName;

	@FindBy(id = "bio")
	@CacheLookup
	WebElementFacade txtBio;

	@FindBy(xpath = "//*[@id=\"is-archived\"]/label/div")
	@CacheLookup
	WebElementFacade checkboxArchive;

	@FindBy(xpath = "//*[@id=\"file\"]/div/button/span/input")
	@CacheLookup
	WebElementFacade lnkSelectFileInput;

	@FindBy(id = "file")
	@CacheLookup
	WebElementFacade lnkSelectFile;

	@FindBy(id = "submit-button")
	@CacheLookup
	WebElementFacade btnSave_Inst;


	//Action Methods

	public void selectInstructoroptions()
	{
		Inst_menuitem.waitUntilVisible().click();
	}

	public void createanewInst()
	{
		btnCreateNewInst.waitUntilEnabled().click();
	}

	public void enterNameAndBioInst()
	{
		txtName.waitUntilVisible().sendKeys(randomestring.InstName);
		txtBio.sendKeys(randomestring.InstBio);

	}

	public InstructorElements(WebDriver driver)
	{
		super(driver);
	}

	public void uploadfile(String filepath) throws InterruptedException
	{
		Thread.sleep(3000);

		evaluateJavascript("$('#file-input').removeAttr(\"style\")");

		System.out.println("----------Uploadfile start--------"+ filepath);
		System.out.println(lnkSelectFileInput);
		System.out.println("Input Element" + lnkSelectFileInput.getTextValue());
		System.out.println("File Element" + lnkSelectFile.getTextValue());

		lnkSelectFileInput.sendKeys(filepath);
		System.out.println("Keys sent");

		lnkSelectFile.click();

		//FileToUpload fileToUpload = new FileToUpload(getDriver(), filename); 

		//fileToUpload.fromLocalMachine().to(lnkSelectFile);

		//upload(filename).to(lnkSelectFile);

	}


	public void verifyaddedInst()
	{
		List<WebElementFacade> all = findAll("//mat-card-content/h4");

		WebElement newInstructor;
		Boolean result = true;

		for(int i=0 ; i<all.size();i++)
		{

			newInstructor = all.get(i);

			if(newInstructor.getText().equals(randomestring.InstName))
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
			System.out.println("Instructor is added successfully");

		}
		else
		{
			System.out.println("Instructor is not added successfully");
			Assert.assertEquals(false, result);

		}
	}

	public void clickonNewlyAddedInst() {

		List<WebElementFacade> all = findAll("//mat-card-content/h4");

		WebElement newaddedInstructor;

		for(int i=0 ; i<all.size();i++)
		{

			newaddedInstructor = all.get(i);

			if(newaddedInstructor.getText().equals(randomestring.InstName))
			{
				newaddedInstructor.click();
				break;
			}
			else
			{
				System.out.println("Newly added Instructor not found");
			}

		}

	}

}