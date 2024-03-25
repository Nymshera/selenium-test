package managers;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager extends DriverManager{

    @Override
    public void createDriver() {
        // System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


}
