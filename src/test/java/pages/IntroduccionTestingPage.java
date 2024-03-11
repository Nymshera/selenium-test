package pages;

import org.openqa.selenium.By;

public class IntroduccionTestingPage extends BasePage {

    private String buyButton = "//a[normalize-space()='Compra ahora' and @href]";

    public IntroduccionTestingPage() {
        super(driver);
    }

    public void clickBuyButton() throws Exception {
        clickElement(By.xpath(buyButton));
    }
    
}
