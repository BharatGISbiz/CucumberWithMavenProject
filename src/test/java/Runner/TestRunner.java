package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Features", glue="stepDefinition",
//				 format={"json:target/cucumber.json",
//				 "html:/target/cucumber.html"})

@CucumberOptions(features = "Features",glue = "stepDefinition",
                 plugin = { "pretty", "json:target/cucumber.json",
							"html:/target/cucumber.html"},
                 monochrome = true)

public class TestRunner {

}
