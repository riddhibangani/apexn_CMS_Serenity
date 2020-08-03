//package starter;
//
//import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		dryRun = false,
//		tags= "@filterInst",
//		
//        plugin = {"pretty"},
//        features = "src/test/resources/features",
//        glue = {"steps"}
//)
//
//public class TestNGRunner extends AbstractTestNGCucumberTests
//{
//	
//	@Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() 
//	{
//          return super.scenarios();
//    }
//	
//
//}
