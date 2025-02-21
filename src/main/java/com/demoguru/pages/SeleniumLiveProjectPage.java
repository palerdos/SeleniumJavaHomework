package com.demoguru.pages;

import org.openqa.selenium.WebDriver;

import static utilities.SwitchToUtility.switchToDefaultWindow;
import static utilities.SwitchToUtility.switchToNewWindow;
import static utilities.WaitUtility.waitUntilTitleIs;

public class SeleniumLiveProjectPage {

    WebDriver driver;
    private String tabTitle = "Selenium Live Project for Practice";

    public SeleniumLiveProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeTab() {
        switchToNewWindow();
        waitUntilTitleIs(5, tabTitle);
        driver.close();
        switchToDefaultWindow();
    }
}
