package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// @RunWith(Cucumber.class)
@CucumberOptions(features = {"Feature"},
    format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
    glue = "StepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests {

}

