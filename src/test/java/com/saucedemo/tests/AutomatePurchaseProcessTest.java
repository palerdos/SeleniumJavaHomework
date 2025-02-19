package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import org.testng.annotations.Test;

public class AutomatePurchaseProcessTest extends BaseTest {


    @Test
    public void testPurchaseProcess() {
        loginPage.setUsername("performance_glitch_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

}
