package elementsNavigation;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utilities.GenerateRandomeString;

public class MusicElements extends PageObject{

	GenerateRandomeString randomestring = new GenerateRandomeString();

	//Elements

	@FindBy(id = "music-categories")
	@CacheLookup
	WebElementFacade MscCatgy_menuitem;

	@FindBy(xpath = "//button[@class='create-btn mat-flat-button mat-button-base mat-primary _mat-animation-noopable']/span[@class='mat-button-wrapper' and 1]")
	@CacheLookup
	WebElementFacade btnCreateNewMsc;

	@FindBy(id = "title")
	@CacheLookup
	WebElementFacade txtTitle;


	//	Action Methods


	public void selectMusicCategoryOption()
	{
		MscCatgy_menuitem.waitUntilClickable().click();
	}

	public void createNewMusicCategorybtn()
	{
		btnCreateNewMsc.waitUntilVisible().click();
	}

	public void enterMscTitle()
	{
		txtTitle.waitUntilVisible().sendKeys(randomestring.MscTitle);
	}

	public void updateMscTitle()
	{
		txtTitle.waitUntilVisible().clear();
		txtTitle.sendKeys(randomestring.MscTitle1);
	}

	public void existingMusicCategory()
	{
		List<WebElementFacade> allexistingMsc = findAll("//mat-card-actions");
		allexistingMsc.get(1).click();

	}

	public void clickonNewAddedMusicCategory()
	{
		List<WebElementFacade> allMusic = findAll("//mat-card-content/h4");

		WebElement newMusicCategory;


		for(int i=0 ; i<allMusic.size();i++)
		{
			newMusicCategory = allMusic.get(i);

			if(newMusicCategory.getText().equals(randomestring.MscTitle))
			{	
				newMusicCategory.click();
				break;
			}
			else
			{
				System.out.println("New Music Category is not visible");
			}
		}
	}

	public void NewMusicCategory()

	{
		List<WebElementFacade> allMusic = findAll("//mat-card-content/h4");

		WebElement newMusicCategory;
		Boolean result = true;

		for(int i=0 ; i<allMusic.size();i++)
		{

			newMusicCategory = allMusic.get(i);

			if(newMusicCategory.getText().equals(randomestring.MscTitle))
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
			System.out.println("Music Category is added successfully");

		}
		else
		{
			System.out.println("Music Category is not added successfully");
			Assert.assertEquals(false, result);

		}

	}


	public void UpdatedMusicCategory()
	{
		List<WebElementFacade> allMusic = findAll("//mat-card-content/h4");

		WebElement updatedMscCat;
		Boolean result = true;

		for(int i=0 ; i<allMusic.size();i++)
		{

			updatedMscCat = allMusic.get(i);

			if(updatedMscCat.getText().equals(randomestring.MscTitle1))
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
			System.out.println("Music Category is updated successfully");

		}
		else
		{
			System.out.println("Music Category is not updated successfully");
			Assert.assertEquals(false, result);

		}
	}

	/// needs to update the validation

	public void archivedMusic()
	{
		Boolean result;

		List<WebElementFacade> allexistingMusic = findAll("//mat-card-content/h4");
		for(int i=0; i<allexistingMusic.size(); i++)
		{
			if(allexistingMusic.get(i).getAttribute("class").contains("archived"))
			{
				result = true;
			}
			else 
			{
				result = false;
			}
			if(result==true)
			{
				Assert.assertEquals(true, result);
			}
			else
			{
				Assert.assertEquals(false, result);
			}
		}

	}




}