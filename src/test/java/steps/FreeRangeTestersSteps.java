package steps;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.CoursesPage;
import pages.FreeRangeTestersPage;
import pages.FundamentosTestingPage;
import pages.IntroduccionTestingPage;
import pages.RegisterPage;

public class FreeRangeTestersSteps {
    FreeRangeTestersPage freeRangeTestersPage = new FreeRangeTestersPage();
    CoursesPage coursesPage = new CoursesPage();
    FundamentosTestingPage fundamentosTestingPage = new FundamentosTestingPage();
    IntroduccionTestingPage introduccionTestingPage = new IntroduccionTestingPage();
    RegisterPage registerPage = new RegisterPage();

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

    @And("^Selects? Introducción al Testing$")
    public void navigateToIntro() throws Exception {
        coursesPage.clickFundamentosTesting();
        fundamentosTestingPage.clickIntroduccionTesting();
    }

    @When("^(?:I|The user|The client) selects? Elegir Plan$")
    public void selectElegirPlan() throws Exception {
        freeRangeTestersPage.clickElegirPlan();
    }

    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateOptions() throws Exception {
        List<String> list = registerPage.returnPlanDropdownValues();
        List<String> listOptions = Arrays.asList("Academia: $16.99 / mes • 12 productos", "Academia: $176 / año • 12 productos", "Free: Gratis • 1 producto"); 
        Assert.assertEquals(listOptions, list);
    }

}
