package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {

    WebDriver driver;
    private By checkoutButton = By.id("checkout") ;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public YourInformationCheckoutPage clickOnCheckout() {
        driver.findElement(checkoutButton).click();
        return new YourInformationCheckoutPage(driver);
    }
}
