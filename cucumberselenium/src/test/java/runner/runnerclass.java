package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src\\test\\resources\\login.feature",
				glue="stepdef")
public class runnerclass extends AbstractTestNGCucumberTests{

}
