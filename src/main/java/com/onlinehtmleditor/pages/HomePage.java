package com.onlinehtmleditor.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static utilities.WaitUtility.waitUntilElementVisible;

public class HomePage {

    WebDriver driver;
    private By textBox = By.xpath("//div[@role=\"textbox\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void enterNormalText(String text) {
        driver.findElement(textBox).sendKeys(text);
    }

    private void toggleBoldText() {
        driver.findElement(textBox).sendKeys(Keys.COMMAND, "b");
    }

    private void toggleUnderLinedText() {
        driver.findElement(textBox).sendKeys(Keys.COMMAND, "u");
    }

    private void enterBoldText(String text) {
        toggleBoldText();
        enterNormalText(text);
        toggleBoldText();
    }

    private void enterUnderlinedText(String text) {
        toggleUnderLinedText();
        enterNormalText(text);
        toggleUnderLinedText();
    }


    public void enterStyledMessage(String text) {
        waitUntilElementVisible(5, textBox);
        for (String word : text.split(" ")) {
            switch (word) {
                case "Automation":
                    enterBoldText(word);
                    enterNormalText(" ");
                    break;
                case "Test":
                    enterUnderlinedText(word);
                    enterNormalText(" ");
                    break;
                case "Example":
                    enterNormalText(word);
                    break;
                default:
                    System.out.println("Incorrect word in string");
                    break;
            }
        }
    }

    public String getTextFromTextBox() {
        return driver.findElement(textBox).getText();
    }

}
