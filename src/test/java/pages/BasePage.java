package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
    
    public void clickElement(By by) throws Exception {
        try {
            find(by).click();
        } catch (Exception e) {
            throw new Exception("The element " + by + " can't be clicked");
        }
    }

    public boolean elementIsDisplayed(By by) throws Exception {
        try {
            return find(by).isDisplayed();
        } catch (Exception e) {
            throw new Exception("The element isn't displayed");
        }
    }

    public String getText(final By by) throws Exception {
        try {
            return find(by).getText();
        } catch (Exception e) {
            throw new Exception("The text of the " + by + " can't be obtained"); 
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("The title can't be obtained");
        }
    }

    private WebElement find(By by) throws Exception {
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            return wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception e) {
            throw new Exception("Element isn't found");
        }
    }
        

    public void write(By by, String keysToSend) throws Exception {
        try {
            find(by).clear();
            find(by).sendKeys(keysToSend);
        } catch (Exception e) {
            throw new Exception("The text " + keysToSend + " couldn't be written");
        }
    }

    public void selectFromDropdownByValue(By by, String valueToSelect) throws Exception {
        Select dropdown = new Select(find(by));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(By by, int valueToSelect) throws Exception {
        Select dropdown = new Select(find(by));
        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropdownByText(By by, String valueToSelect) throws Exception {
        Select dropdown = new Select(find(by));
        dropdown.selectByVisibleText(valueToSelect);
    }

    public int dropdownSize(By by) throws Exception{
        Select dropdown = new Select(find(by));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();
    }

    public List<String> getDropdownValues(By by) throws Exception {
        Select dropdown = new Select(find(by));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropdownOptions) {
            values.add(option.getText());
        }
        return values;
    }

}
