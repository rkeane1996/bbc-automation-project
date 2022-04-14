package bbc.automation.project.steps;

import bbc.automation.project.actions.Actions;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class ThenSteps {

    @Autowired
    private Actions actions;

    @Then("I verify the top navigation links are correct")
    public void iVerifyTheTopNavigationLinksAreCorrect() { actions.assertNavigationLinks(); }

    @Then("I verify the date on the home page is correct")
    public void iVerifyTheDateOnTheHomePageIsCorrect() {
        actions.verifyDateIsCorrect();
    }

    @Then("I verify the url for the news section is correct")
    public void iVerifyTheUrlForTheNewsSectionIsCorrect() { actions.verifyNewsUrl(); }

    @Then("results appear for the search")
    public void resultsAppearForTheSearch() { actions.verifySearchResults(); }
}
