package steps;

import elementsNavigation.FilterElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class FilterSteps {
	
	@Steps
	FilterElements filterE;
	
	@When("^click on filter option$")
    public void click_on_filter_option() throws Throwable 
    {
		filterE.clickonFilter();
    }
 
 @And("^select \"([^\"]*)\"$")
    public void select_something(String filter) throws InterruptedException 
    {
		if(filter.equals("All"))
		{
			
			filterE.listoffilterdelements();
			filterE.selectAll();
			System.out.println("Selected all");
			
		}
		else if(filter.equals("Archive"))
		{
			filterE.selectArchive();
			System.out.println("Selected archive");
		}
		else
		{
			filterE.selectActive();
			System.out.println("Selected active");
		}
    }
 
 @Then("^the filtered list should be visible for \"([^\"]*)\"$")
 public void the_filtered_list_should_be_visible_for_something(String filter) 
    {
	 if(filter.equals("All"))
	 {
		 
		 filterE.checkFilterforAll(filter);
	 }
	 
	 filterE.checkfilteredElement(filter);
	 
	 
    }

}
