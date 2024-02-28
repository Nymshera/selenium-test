package utils;

import org.openqa.selenium.WebDriver;

public class TestContext {
    private WebDriver driver;
    private static TestContext instance;

    private TestContext() {
        // Constructor privado para evitar la creación de instancias externas
    }

    public static TestContext getInstance() {
        if (instance == null) {
            instance = new TestContext();
        }
        return instance;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}

