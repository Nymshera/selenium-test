package pages;

import org.openqa.selenium.By;

public class TrademeHomePage extends BasePage{

    public String searchTextField = "//input[@id='search']";
    public String searchButton = "//button[normalize-space()='Search']";
    public String titleHomePage = "Buy & Sell on NZ's #1 Auction & Classifieds Site | Trade Me";

    public TrademeHomePage() {
        super(driver);
    }

    public void navigateToTrademe() throws Exception {
        navigateTo("https://www.trademe.co.nz/");
    }

    public void performSearch(String product) throws Exception {
        write(By.xpath(searchTextField), product);
    }

    public void clickSearchButton() throws Exception {
        clickElement(By.xpath(searchButton));
    }

    public boolean homePageIsDisplayed() throws Exception {
        return getTitle().equals(titleHomePage);
    }
    
}