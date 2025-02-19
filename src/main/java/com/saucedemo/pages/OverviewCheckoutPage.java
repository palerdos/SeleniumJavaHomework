package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class OverviewCheckoutPage {

    WebDriver driver;
    private By finishButton = By.id("finish");

    public OverviewCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public CompleteCheckoutPage clickFinishButton() {
        scrollToElementJS(finishButton);
        driver.findElement(finishButton).click();
        return new CompleteCheckoutPage(driver);
    }
}
