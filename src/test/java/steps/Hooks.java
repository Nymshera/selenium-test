package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import enums.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managers.DriverManager;
import managers.DriverManagerFactory;
import utils.TestContext;

public class Hooks {

    private static WebDriver driver;
    private static DriverManager driverManager;

    @Before
    public void setUp() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        TestContext.getInstance().setDriver(driver);
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            scenario.log("Scenario failing, please refer to the image attached to this report");
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot of the error");
        }
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}