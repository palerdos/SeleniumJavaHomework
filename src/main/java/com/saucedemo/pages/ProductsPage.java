package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.WaitUtility.waitUntilElementVisible;

public class ProductsPage {

    private WebDriver driver;

    private By backPackAddToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By jacketAddToCartButton = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By shoppingCartLink = By.className("shopping_cart_link");
    private By shoppingCartBadgeNumber = By.className("shopping_cart_badge");
    private By productsPageHeader = By.xpath
            ("//span[@class=\"title\"][text()=\"Products\"]");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart(By item) {
        driver.findElement(item).click();
    }

    public String getNumberOfItemsInCart() {
        return driver.findElement(shoppingCartBadgeNumber).getText();
    }

    public YourCartPage clickOnCart() {
        driver.findElement(shoppingCartLink).click();
        return new YourCartPage(driver);
    }

    public By getBackPackAddToCartButton() {
        return backPackAddToCartButton;
    }

    public By getJacketAddToCartButton() {
        return jacketAddToCartButton;
    }

    public boolean isProductsPageHeaderVisible() {
        waitUntilElementVisible(5, productsPageHeader);
        return driver.findElement(productsPageHeader).isDisplayed();
    }
}
