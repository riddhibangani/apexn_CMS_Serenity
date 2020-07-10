package elementsNavigation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class FilterElements {
	
	public List<String> names = null;
	public int allelements = 0;
	
	//Elements
	
	@FindBy(id = "filter-menu")
//	@CacheLookup
	WebElementFacade drpFilter;

	@FindBy(id = "entity-filter-All")
	@CacheLookup
	WebElementFacade FilterAll;

	@FindBy(id = "entity-filter-Active")
	@CacheLookup
	WebElementFacade FilterActive;

	@FindBy(id = "entity-filter-Archived")
	@CacheLookup
	WebElementFacade FilterArchive;

	@FindAll(@FindBy(xpath = "//mat-card"))
//	@CacheLookup
	List<WebElementFacade> FilterList;

	
	@FindAll(@FindBy(xpath = "//mat-card-content/h4"))
	@CacheLookup
	List<WebElementFacade> FilterListName;
	
	
	
	//Action Methods
	@Step
	public void clickonFilter() throws InterruptedException
	{
		Thread.sleep(3000);
		drpFilter.waitUntilClickable().click();
	}
	@Step
	public void selectAll() throws InterruptedException
	{
		clickonFilter();
		
		FilterAll.waitUntilVisible().click();
	}
	@Step
	public void selectActive() throws InterruptedException
	{
		clickonFilter();
		FilterActive.waitUntilVisible().click();

	}
	@Step
	public void selectArchive() throws InterruptedException
	{
		clickonFilter();
		FilterArchive.waitUntilVisible().click();

	}
	@Step
	public void checkfilteredElement(String filter)
	{
		Boolean result = true;
		WebElement all;

		for(int i=0 ; i<FilterList.size();i++)
		{

			all = FilterList.get(i);

			if(all.getAttribute("class").contains("archived") && filter.equals("Archive"))
			{	
				result = true;
			}
			else if (all.getAttribute("class").contains("archived") && filter.equals("Active"))
			{
				result = false;
				break;
			}
			else if (!all.getAttribute("class").contains("archived") && filter.equals("Archive"))
			{
				result = false;
				break;
			}

			else if (!all.getAttribute("class").contains("archived") && filter.equals("Active"))
			{
				result = true;

			}
			else if((all.getAttribute("class").contains("archived") || !all.getAttribute("class").contains("archived")) && filter.equals("All")) 
			{
				
				
				result = true;
			}

			else
			{
				System.out.println("Not a valid filter");
			}
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

	@Step
	public void checkFilterforAll(String filter)
	{
		
		if(FilterList.size()==allelements)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	@Step
	public void listoffilterdelements() throws InterruptedException 
	{
		selectActive();
		allelements = allelements + FilterList.size();
		System.out.println("The size of active filtered elements" + allelements);
		Thread.sleep(3000);

		selectArchive();
		allelements += FilterList.size();
		System.out.println("The size of archived filtered elements" +allelements);
	
	
	}






}
