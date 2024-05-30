package steps;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.FreeRangeTestersPage;

public class NavigationBarSteps {
    FreeRangeTestersPage freeRangeTestersPage = new FreeRangeTestersPage();

    @Given("^I'm on the Free Range Testers webside$")
    public void iNavigateToFrt() throws Exception {
        freeRangeTestersPage.navigateToFreeRangeTesters();
    }

    @When("I go to {string} using the navigation bar") 
    public void navigationBarUse(String section) throws Exception {
        freeRangeTestersPage.clickOnSectionNavigationBar(section);
    }

    @Then("I'm on the {string}")
    public void validateSection(String section) throws Exception {
        Assert.assertTrue(freeRangeTestersPage.validateSection(section));
    }

}
