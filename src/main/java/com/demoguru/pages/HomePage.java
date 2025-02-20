package com.demoguru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage {

    WebDriver driver;
    private By seleniumDropDown = By.xpath
            (".//a[@class=\"dropdown-toggle\"][contains(text(), 'Selenium')]");
    private By imageIframeId = By.id("a077aa5e");
    private By emailInputField = By.id("philadelphia-field-email");
    private By submitEmailButton = By.id("philadelphia-field-submit");
    private By tooltipDropdownItem = By.xpath("//a[contains(text(), 'Tooltip')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SeleniumLiveProjectPage clickIframeImage() {
        scrollToElementJS(imageIframeId);
        driver.findElement(imageIframeId).click();
        return new SeleniumLiveProjectPage(driver);
    }

    public void fillEmailInputField(String email) {
        driver.findElement(emailInputField).sendKeys(email);
    }

    public void submitEmail() {
        driver.findElement(submitEmailButton).click();
    }

    public void clickSeleniumDropDown() {
        driver.findElement(seleniumDropDown).click();
    }

    public ToolTipDemoPage clickTooltipDropdownItem () {
        driver.findElement(tooltipDropdownItem).click();
        return new ToolTipDemoPage(driver);
    }
}
