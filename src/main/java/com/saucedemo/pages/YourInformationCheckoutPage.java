package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class YourInformationCheckoutPage {

    WebDriver driver;
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");

    public YourInformationCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private void setFirstName(String firstName) {
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    private void setLastName(String lastName) {
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    private void setPostalCode(String postalCode) {
        driver.findElement(postalCodeField).clear();
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void fillYourInformation(String firstName, String lastName, String postalCode) {
        setFirstName(firstName);
        setLastName(lastName);
        setPostalCode(postalCode);
    }

    public OverviewCheckoutPage clickOnContinue() {
        driver.findElement(continueButton).click();
        return new OverviewCheckoutPage(driver);
    }
}
