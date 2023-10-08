package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/" }, // feature file or folder name
		glue = { "stepdefinitions" }, 
		tags = ( "@Smoke, @Regression" ),
		plugin = {"pretty","html:target/cucumber-reports.html"},
		monochrome = true, publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
