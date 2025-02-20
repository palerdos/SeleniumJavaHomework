package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.waitUntilElementVisible;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By loginErrorMessage = By.cssSelector("#login_button_container h3");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private void setUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }

    private void setPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public ProductsPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new ProductsPage(driver);
    }

    public ProductsPage login(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getLoginErrorMessage() {
        waitUntilElementVisible(5, loginErrorMessage);
        return getText(loginErrorMessage);
    }
}
