package steps;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CoursesPage;
import pages.FreeRangeTestersPage;
import pages.FundamentosTestingPage;
import pages.IntroduccionTestingPage;
import pages.RegisterPage;

public class CoursesSteps {

    FreeRangeTestersPage freeRangeTestersPage = new FreeRangeTestersPage();
    CoursesPage coursesPage = new CoursesPage();
    IntroduccionTestingPage introduccionTestingPage = new IntroduccionTestingPage();
    FundamentosTestingPage fundamentosTestingPage = new FundamentosTestingPage();
    RegisterPage registerPage = new RegisterPage();


    @And("^Selects? Introducción al Testing$")
    public void navigateToIntro() throws Exception {
        coursesPage.clickFundamentosTesting();
        fundamentosTestingPage.clickIntroduccionTesting();
    }

    @Then("^I'm on the Introducción al testing page$")
    public void validateIntroCoursePage() throws Exception {
        Assert.assertTrue(introduccionTestingPage.validateTitle());
    }

    @When("^(?:I|The user|The client) selects? Elegir Plan$")
    public void selectElegirPlan() throws Exception {
        freeRangeTestersPage.clickElegirPlan();
    }

    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateOptions() throws Exception {
        List<String> list = registerPage.returnPlanDropdownValues();
        List<String> listOptions = Arrays.asList("Academia: $16.99 / mes • 12 productos", "Academia: $176 / año • 12 productos", "Free: Gratis • 3 productos"); 
        Assert.assertEquals(listOptions, list);
    }
    
}
