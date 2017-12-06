package cucumber.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Ohrm" }, glue = { "cucumber.selenium" })
public class RunCukesTest {

}