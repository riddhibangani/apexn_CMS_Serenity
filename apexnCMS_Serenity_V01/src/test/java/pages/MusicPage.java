package pages;

import elementsNavigation.ActionsElements;
import elementsNavigation.MusicElements;
import net.thucydides.core.annotations.Step;

public class MusicPage {
	
	ActionsElements actionelements;
	
	MusicElements musicelements;
	
	@Step
	public void selectMsCOption()
	{
		musicelements.selectMusicCategoryOption();
	}
	
	@Step
	public void clickOnCreateNewMusicCat()
	{
		musicelements.createNewMusicCategorybtn();
	}
	
	@Step
	public void enterMusicTitle() 
	{
		musicelements.enterMscTitle();
	}
	
	@Step
	public void verifyNewMusicAdded()
	{
		musicelements.NewMusicCategory();
	}

	@Step
	public void existingMusicCat() 
	{
		
		musicelements.existingMusicCategory();
	}
	
	@Step
	public void verifyArchivedMusicCat()
	{
		musicelements.archivedMusic();
	}
	
	@Step
	public void updateMusicTitle() throws InterruptedException 
	{
		Thread.sleep(3000);
		musicelements.updateMscTitle();
	}
	
	@Step
	public void verifyupdatedMusicAdded()
	{
		musicelements.UpdatedMusicCategory();
	}
	
	@Step
	public void clickonNewlyAddedMusicCat()
	{
		musicelements.clickonNewAddedMusicCategory();
	}
	

}
