package steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TrademeHomePage;

public class TrademeSteps {

    TrademeHomePage trademeHomePage = new TrademeHomePage();

    @Given("^User navigate to Trademe webside$") 
    public void navigateToTrademe() throws Exception {
        trademeHomePage.navigateToTrademe();
        Assert.assertTrue(trademeHomePage.homePageIsDisplayed());
    }

    @When("^User enter a search car$")
    public void searchForCar() throws Exception {
        trademeHomePage.performSearch("car");
    }

    @And("^User click on the search button$")
    public void clickSearchButton() throws Exception {
        trademeHomePage.clickSearchButton();
    }

    @Then("^The result match the criteria$")
    public void validateResults() {
        
    }
    
}
