package pages;

import elementsNavigation.DashboardElements;
import net.thucydides.core.annotations.Step;

public class DashboardPage {
	
	
	DashboardElements dashelements;
	
	@Step
	public void LoginSuccess() throws InterruptedException
	{
		Thread.sleep(2000);
		dashelements.loginVerify();
	}
	
	@Step
	public void clickMainMenu()
	{
		dashelements.mainMenu();
	}
	
	@Step
	public void clickOnLogoutButton()
	{
		dashelements.clicklogout();
	}

}
