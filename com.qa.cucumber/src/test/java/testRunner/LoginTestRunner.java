package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Selenium\\com.qa.cucumber\\src\\test\\resources\\features\\loginop.feature"},
		glue= {"stepdefinitions"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:test-output"}
		)
public class LoginTestRunner {

}
