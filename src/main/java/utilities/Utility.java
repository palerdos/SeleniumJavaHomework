package utilities;

import org.openqa.selenium.WebDriver;

public class Utility {

    public  static WebDriver driver;

    public static void setUtilityDriver(WebDriver driver) {
        Utility.driver = driver;
    }
}
