package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.WaitUtility.waitUntilElementVisible;

public class YourCartPage {

    WebDriver driver;
    private By checkoutButton = By.id("checkout") ;
    private By yourCartPageHeader = By.xpath
            ("//span[@class=\"title\"][text()=\"Your Cart\"]");

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public YourInformationCheckoutPage clickOnCheckout() {
        driver.findElement(checkoutButton).click();
        return new YourInformationCheckoutPage(driver);
    }

    public boolean isYourCartPageHeaderVisible() {
        waitUntilElementVisible(5, yourCartPageHeader);
        return driver.findElement(yourCartPageHeader).isDisplayed();
    }
}
