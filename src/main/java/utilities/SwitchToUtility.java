package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility {

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    public static void switchToNewWindow() {
        Object[] windowHandles = driver.getWindowHandles().toArray();
        switchTo().window((String) windowHandles[1]);
    }

}
