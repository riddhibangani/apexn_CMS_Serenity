package steps;

import elementsNavigation.ActionsElements;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.DashboardPage;
import pages.FilterPage;
import pages.InstructorPage;

public class InstructorSteps {

	@Steps
	InstructorPage instructor;

	@Steps
	FilterPage filterp;

	@Steps
	ActionsElements action; 

	@Steps
	DashboardPage dash;


	@When("^user click on the main menu$")
	public void user_click_on_the_main_menu()
	{
		dash.clickMainMenu();
	}


	@And("^select the option as Instructor$")
	public void select_the_option_as_instructor()
	{
		instructor.selectInstoption();
	}

	@When("^click on Create a new instructor button$")
	public void click_on_Create_a_new_instructor_button()  
	{
		instructor.clickOnCreateNewInt();
	}

	@And("^enter name and bio$")
	public void enter_name_and_bio() throws InterruptedException 
	{
		instructor.enterInstNameAndBio();
	}

	@When("^click on select the file to import at \"([^\"]*)\"$")
	public void click_on_select_the_file_to_import_at_something(String filepath) throws InterruptedException  
	{

		instructor.selectFiletoimport(filepath);

	}

	@And("^click on save button$")
	public void click_on_save_button() 
	{
		action.clicksaveButton();
	}

	@Then("^the new instructor is added successfully$")
	public void the_new_instructor_is_added_successfully() 
	{
		instructor.verifyAddedInst();
	}

	@When("^click on the new instructor created$")
	public void click_on_the_new_instructor_created() {

		instructor.clickonNewAddedInstructor();

	}

	@And("^update name and bio$")
	public void update_name_and_bio() 
	{
		instructor.updateInstNameAndBio();
	}

	@Then("^the instructor is updated successfully$")
	public void the_instructor_is_updated_successfully()
	{
		instructor.verifyUpdatedInst();
	}

	@And("^click on the existing instructor$")
	public void click_on_the_existing_instructor()
	{
		instructor.clickOnExistingInstructor();
	}

	@Then("^the instructor is archived$")
	public void the_instructor_is_archived() 
	{
		instructor.verifyInstArchive();
	}

	@And("^click on the existing active instructor$")
	public void click_on_the_existing_active_instructor() 
	{
		instructor.clickOnActiveInst();
	}
	
	@And("^click on the existing archived instructor$")
    public void click_on_the_existing_archived_instructor()
    {
		instructor.clickOnArchivedInst();
    }
	
	@When("^the archive option is deselected$")
	public void the_archive_option_is_deselected() 
	{

		action.deselectArchive();
	}
	
	@Then("^the instructor is unarchived$")
    public void the_instructor_is_unarchived()
    {
		instructor.verifyInstUnArchive();
    }

}











