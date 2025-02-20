package utilities;

import org.openqa.selenium.By;

public class GetUtility extends  Utility {

    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }

}
