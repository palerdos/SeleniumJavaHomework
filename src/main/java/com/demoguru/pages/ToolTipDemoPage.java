package com.demoguru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.WaitUtility.waitUntilElementVisible;

public class ToolTipDemoPage {

    WebDriver driver;
    private By downLoadNowButton = By.id("download_now");

    public ToolTipDemoPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDownloadButtonVisible() {
        waitUntilElementVisible(10, downLoadNowButton);
        return driver.findElement(downLoadNowButton).isDisplayed();
    }

}
