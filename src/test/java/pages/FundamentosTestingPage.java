package pages;

import org.openqa.selenium.By;

public class FundamentosTestingPage extends BasePage {

    private String introduccionTestLink = "//a[normalize-space()='Introducción al Testing de Software' and @href]";

    public FundamentosTestingPage() {
        super(driver);
    }

    public void clickIntroduccionTesting() throws Exception {
        clickElement(By.xpath(introduccionTestLink));
    }

    
}
