package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private static WebDriver driver;

    public BasePage(WebDriver driver) {
        driver = this.driver;
    }

    public void clickElement(WebElement element) throws Exception {
        try {
            element.click();
        } catch (Exception e) {
            throw new Exception("The element " + element + " can't be clicked");
        }
    }

    public boolean isDisplayed(WebElement element) throws Exception {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            throw new Exception("The element " + element + " isn't displayed");
        }
    }

    public String getText(WebElement element) throws Exception {
        try {
            return element.getText();
        } catch (Exception e) {
            throw new Exception("The text of the element " + element + " can't be obtained");
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("The title can't be obtained");
        }
    }
}
