package elementsNavigation;

import org.junit.Assert;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class DashboardElements extends PageObject{
	
	
	public void loginVerify()
	{
		String title = getDriver().getTitle();
		Assert.assertTrue(title.contains("APEX - Login"));
	}
	
	public void mainMenu()
	{
		$(By.id("header-menu")).waitUntilClickable().click();
	}
	
	public void clicklogout()
	{
		$(By.id("logout")).click();
	}

}
