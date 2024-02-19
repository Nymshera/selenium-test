package steps;

import org.openqa.selenium.WebDriver;
import enums.DriverType;
import io.cucumber.java.Before;
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

    public static WebDriver getDriver() {
        return driver;
    }
}