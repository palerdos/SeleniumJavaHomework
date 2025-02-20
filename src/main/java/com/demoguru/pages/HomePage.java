package com.demoguru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage {

    //https://demo.guru99.com/test/guru99home/
    WebDriver driver;
    private By seleniumDropDown = By.xpath
            (".//a[@class=\"dropdown-toggle\"][contains(text(), 'Selenium')]");
    private By imageIframeId = By.id("a077aa5e");
    private By imageLink = By.linkText("http://www.guru99.com/live-selenium-project.html");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SeleniumLiveProjectPage clickIframeImage() {
        scrollToElementJS(imageIframeId);
        driver.findElement(imageIframeId).click();
        return new SeleniumLiveProjectPage(driver);
    }


}
