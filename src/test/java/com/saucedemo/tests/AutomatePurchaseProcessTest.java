package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.OverviewCheckoutPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.YourCartPage;
import com.saucedemo.pages.YourInformationCheckoutPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AutomatePurchaseProcessTest extends BaseTest {


    @Test
    public void testPurchaseProcess() {
        ProductsPage productsPage = loginPage.login("performance_glitch_user",
                "secret_sauce");
        productsPage.addItemToCart(productsPage.getBackPackAddToCartButton());
        productsPage.addItemToCart(productsPage.getJacketAddToCartButton());
        String expectedResult = "2";
        String actualResult = productsPage.getNumberOfItemsInCart();
        assertEquals(actualResult, expectedResult,
                "Actual and Expected number of items in cart do not match");
        YourCartPage yourCartPage = productsPage.clickOnCart();
        YourInformationCheckoutPage yourInformationCheckoutPage = yourCartPage.clickOnCheckout();
        yourInformationCheckoutPage.
                fillYourInformation("Pál", "Erdős", "2500");
        OverviewCheckoutPage overviewCheckoutPage = yourInformationCheckoutPage.clickOnContinue();
    }

}
