package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.waitUntilElementVisible;

public class OverviewCheckoutPage {

    WebDriver driver;
    private By finishButton = By.id("finish");
    private By overviewPageHeader = By.xpath
            ("//span[@class=\"title\"][text()=\"Checkout: Overview\"]");

    public OverviewCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public CompleteCheckoutPage clickFinishButton() {
        scrollToElementJS(finishButton);
        driver.findElement(finishButton).click();
        return new CompleteCheckoutPage(driver);
    }

    public boolean isOverviewPageHeaderVisible() {
        waitUntilElementVisible(5, overviewPageHeader);
        return driver.findElement(overviewPageHeader).isDisplayed();
    }
}
