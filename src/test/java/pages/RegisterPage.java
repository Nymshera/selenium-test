package pages;

import java.util.List;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

    private String planDropdown = "//select[@id='cart_cart_item_attributes_plan_with_interval']";

    public RegisterPage() {
        super(driver);
    }

    public List<String> returnPlanDropdownValues() throws Exception {
        return getDropdownValues(By.xpath(planDropdown));
    }
    
}
