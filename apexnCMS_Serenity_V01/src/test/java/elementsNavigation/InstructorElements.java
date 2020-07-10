package elementsNavigation;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.components.FileToUpload;
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
		
		public void uploadfile(String filepath)
		{
//			lnkSelectFile.waitUntilClickable().sendKeys(filepath);
			
			FileToUpload fileToUpload = new FileToUpload(getDriver(), "1589466155796-1024.png"); 
			fileToUpload.fromLocalMachine().to(lnkSelectFile);
			
		}
		
		
		public void verifyaddedInst()
		{
			List<WebElement> all = $(By.xpath("//mat-card-content/h4"));
			
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
