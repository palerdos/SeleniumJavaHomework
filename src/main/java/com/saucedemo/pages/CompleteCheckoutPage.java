package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompleteCheckoutPage {

    WebDriver driver;
    private By thankYouMessage = By.className("complete-header");

    public CompleteCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isThankYouMessageVisible() {
        return driver.findElement(thankYouMessage).isDisplayed();
    }

}
