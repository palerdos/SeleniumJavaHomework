package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewCheckoutPage {

    WebDriver driver;
    private By finishButton = By.id("finish");

    public OverviewCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public CompleteCheckoutPage clickFinishButton() {
        driver.findElement(finishButton).click();
        return new CompleteCheckoutPage(driver);
    }
}
