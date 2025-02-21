package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility {

    private static Object[] windowHandles;

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    public static void switchToNewWindow() {
        windowHandles = driver.getWindowHandles().toArray();
        switchTo().window((String) windowHandles[1]);
    }

    public static void switchToDefaultWindow() {
        windowHandles = driver.getWindowHandles().toArray();
        switchTo().window((String) windowHandles[0]);
    }

}
