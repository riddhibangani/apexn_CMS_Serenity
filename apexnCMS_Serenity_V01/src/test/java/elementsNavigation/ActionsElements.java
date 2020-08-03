package elementsNavigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ActionsElements extends PageObject{
	
	@FindBy(id = "submit-button")
//	@CacheLookup
	WebElementFacade btnSave_Inst;
	
	@FindBy(xpath = "//*[@id='is-archived']/label")
//	@CacheLookup
	WebElementFacade checkboxArchive;
	
	//mat-checkbox[@id='is-archived']/lable
	
	@FindBy(xpath = "//mat-card-actions//div//span")
	WebElementFacade btn_Save_LiveWrk;
			
	@Step
	public void clicksaveButton()

	{
		btnSave_Inst.click();
	}
	
	@Step
	public void clicksaveLiveWrkButton()

	{
		btn_Save_LiveWrk.click();
	}
	
	@Step
	public void selectArchive()
	
	{
		checkboxArchive.waitUntilClickable();
		Boolean checekboxDisplay = checkboxArchive.isDisplayed();
		System.out.println("Is the checkbox displayed: " + checekboxDisplay);
		
		Boolean checkboxSelected = checkboxArchive.isSelected();
		System.out.println("Is the checkbox selected: "+ checkboxSelected);
		
		checkboxArchive.click();
		
		Boolean checkboxStatus = checkboxArchive.isSelected();
		System.out.println("The updated status of checkbox is: "+ checkboxStatus);
	}
	@Step
	public void deselectArchive() 
	{	
		
		checkboxArchive.waitUntilClickable();
		Boolean checekboxDisplay = checkboxArchive.isDisplayed();
		System.out.println("Is the checkbox displayed: " + checekboxDisplay);
		
		Boolean checkboxSelected = checkboxArchive.isSelected();
		System.out.println("Is the checkbox selected: "+ checkboxSelected);
		
		checkboxArchive.click();
		
		Boolean checkboxStatus = checkboxArchive.isSelected();
		System.out.println("The updated status of checkbox is: "+ checkboxStatus);
		
	}
	

}
