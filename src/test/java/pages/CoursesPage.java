package pages;

import org.openqa.selenium.By;

public class CoursesPage extends BasePage {

    private String fundamentosTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";

    public CoursesPage() {
        super(driver);
    }
    
    public void clickFundamentosTesting() throws Exception {
        clickElement(By.xpath(fundamentosTestingLink));
    }
}
