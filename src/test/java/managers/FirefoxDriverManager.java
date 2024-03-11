package managers;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        //System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver/geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
    
}
