package steps;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import pages.DashboardPage;
import pages.LoginPage;



public class LoginSteps {
	
	@Steps
	LoginPage login;
	
	@Steps
	DashboardPage dash;
	
	
	@Given("user is on CMS login page")
	public void user_is_on_CMS_login_page() throws InterruptedException {
	    
		login.openPortal();
	}

	@When("user enters username as and password")
	public void user_enters_username_as_and_password() throws InterruptedException
	{
	   login.enterUsernameAndPassword();
	}

	@When("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		login.clickOnLoginButton();
	}
	

	@Then("user is navigated to home page with page title")
	public void user_is_navigated_to_home_page_with_page_title() throws InterruptedException 
	{
	   dash.LoginSuccess();
	}

}
