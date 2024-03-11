package pages;

import org.openqa.selenium.By;

public class FreeRangeTestersPage extends BasePage{

    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String choosePlanButton = "//a[normalize-space()='Elegir Plan']";

    public FreeRangeTestersPage() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() throws Exception {
        navigateTo("https://www.freerangetesters.com/");
    }

    public void homePageIsDisplayed() {
        //getTitle().equals(driver)
    }

    public void clickOnSectionNavigationBar(String section) throws Exception {
        //Reemplaza el marcador de posición en secrionLink con el nombre
        String xpathSection = String.format(sectionLink,section);
        clickElement(By.xpath(xpathSection));
    }

    public void clickElegirPlan() throws Exception {
        clickElement(By.xpath(choosePlanButton));
    }

    
    
}
