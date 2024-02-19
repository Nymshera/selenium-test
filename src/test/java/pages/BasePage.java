package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import utils.TestContext;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = TestContext.getInstance().getDriver();
    }

    public void navigateTo(String url) throws Exception {
        try {
            driver.get(url);
        } catch (Exception e) {
            throw new Exception("The website " + url + " couldn't be loaded");
        }
    }
    
    public void clickElement(String locator) throws Exception {
        try {
            find(locator).click();
        } catch (Exception e) {
            throw new Exception("The element can't be clicked");
        }
    }

    public boolean isDisplayed(String locator) throws Exception {
        try {
            return find(locator).isDisplayed();
        } catch (Exception e) {
            throw new Exception("The element isn't displayed");
        }
    }

    public String getText(String locator) throws Exception {
        try {
            return find(locator).getText();
        } catch (Exception e) {
            throw new Exception("The text of the " + locator + " can't be obtained");
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("The title can't be obtained");
        }
    }

    private WebElement find(String locator) throws Exception {
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        } catch (Exception e) {
            throw new Exception("Element isn't found");
        }
    }
        

    public void write(String locator, String textToWrite) throws Exception {
        try {
            find(locator).clear();
            find(locator).sendKeys(textToWrite);
        } catch (Exception e) {
            throw new Exception("The text couldn't be written");
        }
    }
}
