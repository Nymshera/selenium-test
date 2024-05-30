package pages;

import org.openqa.selenium.By;

public class IntroduccionTestingPage extends BasePage {

    private String buyButton = "//a[normalize-space()='Compra ahora' and @href]";
    private String titlePage = "//h2[normalize-space()='Introducción al Testing de Software']";

    public IntroduccionTestingPage() {
        super(driver);
    }

    public void clickBuyButton() throws Exception {
        clickElement(By.xpath(buyButton));
    }

    public boolean validateTitle() throws Exception {
        return elementIsDisplayed(By.xpath(titlePage));
    }
    
}
