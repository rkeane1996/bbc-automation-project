package bbc.automation.project.steps;

import bbc.automation.project.actions.Actions;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class WhenSteps {

    @Autowired
    private Actions actions;

    @When("I navigate to the bbs news section of the website")
    public void iNavigateToTheBbsNewsSectionOfTheWebsite() {
        actions.navigateToNewsPage();
    }

    @When("I perform a search for {string}")
    public void iPerformASearchForHMH(String searchItem) { actions.performSearch(searchItem); }

    @When("I navigate to the search Page")
    public void iNavigateToTheSearchPage() {
        actions.navigateToSearchPage();
    }
}
