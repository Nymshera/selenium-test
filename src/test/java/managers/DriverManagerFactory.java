package managers;

import enums.DriverType;

public class DriverManagerFactory {
    
    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager = null;
        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                System.out.println("Invalid browser selectect");
                break;
        }

        return driverManager;

    }
    
}
