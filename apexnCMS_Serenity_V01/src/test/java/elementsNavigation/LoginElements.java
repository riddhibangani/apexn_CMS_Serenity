package elementsNavigation;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import utilities.ConfigFileReader;

public class LoginElements extends PageObject

{
	ConfigFileReader configFileReader= new ConfigFileReader();

	public void enterUserAndPassword()

	{
		$(By.id("email")).waitUntilVisible().sendKeys(configFileReader.getusername());
		$(By.id("password")).sendKeys(configFileReader.getpassword());
	}

	public void clickLogin()
	{
		$(By.id("submit-button")).click();
	}

	


}
