package pages;

import elementsNavigation.ActionsElements;
import elementsNavigation.InstructorElements;
import net.thucydides.core.annotations.Step;

public class InstructorPage 
{
	InstructorElements instelement;
	
	ActionsElements actionelements;
	
	@Step
	public void selectInstoption()
	{
		instelement.selectInstructoroptions();
	}
	
	@Step
	public void clickOnCreateNewInt()
	{
		instelement.createanewInst();
	}
	
	@Step
	public void enterInstNameAndBio() throws InterruptedException
	{
		instelement.enterNameAndBioInst();
		Thread.sleep(3000);
	}
	
	@Step
	public void selectFiletoimport(String filepath) throws InterruptedException 
	{
	
		instelement.uploadfile(filepath);
	}
	
	@Step
	public void clickOnSaveButton()
	{
		actionelements.clicksaveButton();
	}
	
	@Step
	public void verifyAddedInst()
	{
		instelement.verifyaddedInst();
	}
	
	@Step
	public void clickonNewAddedInstructor()
	{
		instelement.clickonNewlyAddedInst();
	}

	@Step
	public void updateInstNameAndBio() 
	{
		
		instelement.updateNameAndBioInst();
	}

	@Step
	public void verifyUpdatedInst() 
	{
		instelement.verifyupdatedInst();
		
	}
	
	@Step
	public void clickOnExistingInstructor() 
	{
		instelement.clickOnExistingInst();
		
	}
	
	@Step
	public void verifyInstArchive() 
	{
		instelement.VerifyArchivedInstructor();
		
	}
	@Step
	public void clickOnActiveInst() 
	{
		instelement.ClickOnActiveInstructor();
		
	}
	@Step
	public void verifyInstUnArchive() 
	{
		instelement.VerifyUnArchivedInstructor();
		
	}

	@Step
	public void clickOnArchivedInst() 
	{
		instelement.ClickOnArchivedInstructor();
		
	}
	
	
	
}
