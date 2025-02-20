package com.saucedemo.base;

import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    private String SAUCEDEMO_URL = "https://www.saucedemo.com";
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(SAUCEDEMO_URL);
        loginPage = new LoginPage(driver);
        setUtilityDriver(driver);
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
