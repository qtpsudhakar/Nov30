package cucumber.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Ohrm" }, glue = { "cucumber.selenium" })
public class OhrmLoginFeatureRunner extends AbstractTestNGCucumberTests {

}
