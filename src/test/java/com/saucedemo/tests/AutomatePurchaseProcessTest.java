package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AutomatePurchaseProcessTest extends BaseTest {


    @Test
    public void testPurchaseProcess() {
        ProductsPage productsPage = loginPage.login("performance_glitch_user",
                "secret_sauce");
        assertTrue(productsPage.isProductsPageHeaderVisible(),
                "Products page header not visible");
        productsPage.addItemToCart(productsPage.getBackPackAddToCartButton());
        productsPage.addItemToCart(productsPage.getJacketAddToCartButton());
        String expectedResult = "2";
        String actualResult = productsPage.getNumberOfItemsInCart();
        assertEquals(actualResult, expectedResult,
                "Actual and Expected number of items in cart do not match");
        YourCartPage yourCartPage = productsPage.clickOnCart();
        assertTrue(yourCartPage.isYourCartPageHeaderVisible(),
                "Your cart page header not visible");
        YourInformationCheckoutPage yourInformationCheckoutPage = yourCartPage.clickOnCheckout();
        assertTrue(yourInformationCheckoutPage.isYourInformationPageHeaderVisible(),
                "Your information page header not visible");
        yourInformationCheckoutPage.
                fillYourInformation("Pál", "Erdős", "2500");
        OverviewCheckoutPage overviewCheckoutPage = yourInformationCheckoutPage.clickOnContinue();
        assertTrue(overviewCheckoutPage.isOverviewPageHeaderVisible());
        CompleteCheckoutPage completeCheckoutPage = overviewCheckoutPage.clickFinishButton();
        assertTrue(completeCheckoutPage.isThankYouMessageVisible(),
                "Thank you message is not visible");
    }

}
