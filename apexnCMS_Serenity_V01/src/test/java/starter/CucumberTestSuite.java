package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import utilities.GenerateRandomeString;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		dryRun = false,
		tags= "@deleteliveworkouts",
		
        plugin = {"pretty",
				 "html:target/cucumber-reports/HTMLReports/reports.html"},
        features = "src/test/resources/features",
        glue = {"steps"}
)
public class CucumberTestSuite extends GenerateRandomeString{
	
	@BeforeClass
	 public static void generateramdomestring() 
	 {
		randomestring();
		
	 }
	
	
}
