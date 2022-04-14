package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:cucumberFeatures/TestSuite.feature",
        glue = {"bbc.automation.project.steps"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-report/report.html",
                "json:target/cucumber-json-report/cucumber.html"
        })
public class TestRunner {
}
