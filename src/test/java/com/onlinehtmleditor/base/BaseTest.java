package com.onlinehtmleditor.base;

import com.onlinehtmleditor.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    private String ONLINEHTMLEDITOR_URL = "https://onlinehtmleditor.dev";
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(ONLINEHTMLEDITOR_URL);
        homePage = new HomePage(driver);
        setUtilityDriver(driver);
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
