package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class VerifyLoginErrorTest extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
        loginPage.clickLoginButton();
        String actualResult = loginPage.getLoginErrorMessage();
        String expectedResult = "Epic sadface: Username is required";
        assertEquals(actualResult, expectedResult, "Actual and expected" +
                " error message do not match");
        ProductsPage productsPage = loginPage.login
                ("standard_user", "secret_sauce");
        String footerText = productsPage.getFooterText();
        assertTrue(footerText.contains("2025") && footerText.contains("Terms of Service"));
    }

}
