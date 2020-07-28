package elementsNavigation;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
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
	Boolean result = true;
	String currentArchivedInst = null;
	String currentActiveInst = null;

	@FindBy(id = "instructors")
	@CacheLookup
	WebElementFacade Inst_menuitem;

	@FindBy(xpath = "//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")
	@CacheLookup
	WebElementFacade btnCreateNewInst;

	@FindBy(id = "name")
	//	@CacheLookup
	WebElementFacade txtName;

	@FindBy(id = "bio")
	//	@CacheLookup
	WebElementFacade txtBio;

	@FindBy(xpath = "//*[@id='is-archived']/label")
//	@CacheLookup
	WebElementFacade checkboxArchive;

	@FindBy(xpath = "//*[@id=\"file\"]/div/button/span/input")
	//	@CacheLookup
	WebElementFacade lnkSelectFileInput;

	@FindBy(id = "file")
	@CacheLookup
	WebElementFacade lnkSelectFile;

	@FindBy(id = "submit-button")
	@CacheLookup
	WebElementFacade btnSave_Inst;

	@FindAll(@FindBy(xpath = "//mat-card-content/h4"))
	//	@CacheLookup
	List<WebElement> AllInst;

	@FindAll(@FindBy(xpath = "//mat-icon[text()='edit']"))
	//	@CacheLookup
	List<WebElement> EditInst;

	@FindAll(@FindBy(xpath = "//mat-card[not(contains(@class,'apex-archived'))]/descendant::mat-icon[text()='edit']"))
	//	@CacheLookup
	List<WebElement> NotArchiveInst;
	
	
	@FindAll(@FindBy(xpath = "//mat-card[(contains(@class,'apex-archived'))]//h4"))
	//	@CacheLookup
	List<WebElement> ArchiveInst;
	
	@FindAll(@FindBy(xpath = "//mat-card[(contains(@class,'apex-archived'))]/descendant::mat-icon[text()='edit']"))
	//	@CacheLookup
	List<WebElement> NotActiveInst;
	
	@FindAll(@FindBy(xpath = "//mat-card[not(contains(@class,'apex-archived'))]//h4"))
	//	@CacheLookup
	List<WebElement> ActiveInst;
	



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
		Thread.sleep(2000);

		evaluateJavascript("$('#file-input').removeAttr(\"style\")");

		System.out.println("----------Uploadfile start--------"+ filepath);
		System.out.println(lnkSelectFileInput);
		System.out.println("Input Element" + lnkSelectFileInput.getTextValue());
		System.out.println("File Element" + lnkSelectFile.getTextValue());

		withAction().moveToElement(lnkSelectFileInput);
		lnkSelectFileInput.sendKeys(filepath);
		System.out.println("Keys sent");

//		lnkSelectFile.click();

		//FileToUpload fileToUpload = new FileToUpload(getDriver(), filename); 

		//fileToUpload.fromLocalMachine().to(lnkSelectFile);

		//upload(filename).to(lnkSelectFile);

	}


	public void verifyaddedInst()
	{

		WebElement newInstructor;


		for(int i=0 ; i<AllInst.size();i++)
		{

			newInstructor = AllInst.get(i);

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

		WebElement newaddedInstructor;


		for(int i=0 ; i<AllInst.size();i++)
		{

			newaddedInstructor = AllInst.get(i);

			if(newaddedInstructor.getText().equals(randomestring.InstName))
			{
				EditInst.get(i).click();
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
			System.out.println("Instructor is clicked successfully");

		}
		else
		{
			System.out.println("Instructor is not clicked successfully");
			Assert.assertEquals(false, result);

		}

	}

	public void updateNameAndBioInst() 
	{

		txtName.waitUntilVisible().clear();
		txtName.sendKeys(randomestring.InstName1);

		txtBio.waitUntilVisible().clear();
		txtBio.sendKeys(randomestring.InstBio1);

	}

	public void verifyupdatedInst() 
	{

		WebElement updatedInstructor;


		for(int i=0 ; i<AllInst.size();i++)
		{

			updatedInstructor = AllInst.get(i);

			if(updatedInstructor.getText().equals(randomestring.InstName1))
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
			System.out.println("Instructor is updated successfully");

		}
		else
		{
			System.out.println("Instructor is not updated successfully");
			Assert.assertEquals(false, result);

		}

	}

	public void clickOnExistingInst() 
	{

		int i = randomestring.randomenumbers(EditInst.size());
		EditInst.get(i).click();

	}

	public void ClickOnActiveInstructor() 
	{
		int i = randomestring.randomenumbers(NotArchiveInst.size());
		NotArchiveInst.get(i).click();
		currentArchivedInst = txtName.getTextValue();
		
		System.out.println(txtName.getTextValue());
		System.out.println(txtName.getText());
		System.out.println(txtName.getTextContent());
		System.out.println(txtName.getValue());
		

	}
	
	public void ClickOnArchivedInstructor() 
	{
		
		int i = randomestring.randomenumbers(NotActiveInst.size());
		NotActiveInst.get(i).click();
		
		currentActiveInst = txtName.getTextValue();
		System.out.println(txtName.getTextValue());
		
	}

	public void VerifyArchivedInstructor() 
	{
		WebElement ArchivedInstructor;
		
		for(int i=0 ; i<ArchiveInst.size();i++)
		{

			ArchivedInstructor = ArchiveInst.get(i);

			if(ArchivedInstructor.getText().equals(currentArchivedInst))
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
			System.out.println("Instructor is archived successfully");

		}
		else
		{
			System.out.println("Instructor is not archived successfully");
			Assert.assertEquals(false, result);

		}
		
	}

	public void VerifyUnArchivedInstructor() 
	{
		WebElement UnArchivedInstructor;
		
		for(int i=0 ; i<ActiveInst.size();i++)
		{

			UnArchivedInstructor = ActiveInst.get(i);

			if(UnArchivedInstructor.getText().equals(currentActiveInst))
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
			System.out.println("Instructor is unarchived successfully");

		}
		else
		{
			System.out.println("Instructor is not unarchived successfully");
			Assert.assertEquals(false, result);

		}
		
	}

	

}