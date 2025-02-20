package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.WaitUtility.waitUntilElementVisible;

public class CompleteCheckoutPage {

    WebDriver driver;
    private By thankYouMessage = By.className("complete-header");

    public CompleteCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isThankYouMessageVisible() {
        waitUntilElementVisible(5, thankYouMessage);
        return driver.findElement(thankYouMessage).isDisplayed();
    }

}
