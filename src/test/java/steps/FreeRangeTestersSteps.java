package steps;

import io.cucumber.java.en.*;
import pages.FreeRangeTestersPage;

public class FreeRangeTestersSteps {
    FreeRangeTestersPage freeRangeTestersPage = new FreeRangeTestersPage();

    @Given("^I'm on the Free Range Testers webside$")
    public void iNavigateToFrt() throws Exception {
        freeRangeTestersPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar") 
    public void navigationBarUse(String section) throws Exception {
        freeRangeTestersPage.clickOnSectionNavigationBar(section);
    }



}
