package bbc.automation.project.steps;

import bbc.automation.project.actions.Actions;
import bbc.automation.project.config.TestConfig;
import bbc.automation.project.model.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = TestConfig.class)
@CucumberContextConfiguration
public class GivenSteps {

    @Autowired
    private WebDriver driver;

    @Autowired
    private Actions actions;

    @Autowired
    private Constants constants;

    @Given("I navigate to the bbc website")
    public void iNavigateToTheBbcWebsite() {
        driver.navigate().to(constants.BBC_HOME_URL);
        actions.clickConsentPopUp();
    }
}
