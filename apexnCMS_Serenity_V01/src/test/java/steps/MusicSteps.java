package steps;

import elementsNavigation.ActionsElements;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.MusicPage;

public class MusicSteps {

	@Steps
	MusicPage music;


	@Steps
	ActionsElements action; 


	@And("^select the option as Music categories$")
	public void select_the_option_as_music_categories()
	{
		music.selectMsCOption();
	}


	@When("^click on Create a new music category button$")
	public void click_on_create_a_new_music_category_button()
	{
		music.clickOnCreateNewMusicCat();
	}

	@Then("^the new music category is added successfully$")
	public void the_new_music_category_is_added_successfully()
	{
		music.verifyNewMusicAdded();
	}

	@And("^enter the title for music$")
	public void enter_the_title_for_music() 
	{
		music.enterMusicTitle();
	}

	@And("^click on the existing music category$")
	public void click_on_the_existing_music_category()
	{
		music.existingMusicCat();
	}
	
	@When("^click on the new music category created$")
    public void click_on_the_new_music_category_created()
    {
		music.clickonNewlyAddedMusicCat();
    }

	@When("^the archive option is selected$")
	public void the_archive_option_is_selected() 
	{
		action.selectArchive();
	}
	
	@Then("^the music category is archived$")
    public void the_music_category_is_archived()
    {
		music.verifyArchivedMusicCat();
    }
	
	@And("^update the title for music$")
    public void update_the_title_for_music() throws InterruptedException
    {
		music.updateMusicTitle();
    }

	@Then("^the music category is updated successfully$")
    public void the_music_category_is_updated_successfully()
    {
		music.verifyupdatedMusicAdded();
    }


}






