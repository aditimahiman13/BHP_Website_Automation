package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/Features/Login.feature","src/test/java/Features/Dashoboard.feature" },
					 //glue = { "StepDefinations", "LoginSD",	"hooks" },
                      glue= {"StepDefinations"},
					 plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json",
							 	"junit:target/cucumber-reports/Cucumber.xml",
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
     ,monochrome = true
     ,publish = true

)

public class RunnerFile extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
