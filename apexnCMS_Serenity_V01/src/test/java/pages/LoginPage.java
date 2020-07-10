package pages;

import elementsNavigation.LoginElements;
import net.thucydides.core.annotations.Step;

public class LoginPage {
	
	
	
	LoginElements loginelements;
	
	@Step
	public void openPortal() throws InterruptedException
	
	{
		loginelements.open();
		Thread.sleep(2000);
	}
	
	@Step
	public void enterUsernameAndPassword() throws InterruptedException
	{
		loginelements.enterUserAndPassword();
		Thread.sleep(3000);
	}
	
	@Step
	public void clickOnLoginButton() throws InterruptedException
	{
		loginelements.clickLogin();
		Thread.sleep(3000);
	}
	
	

}
