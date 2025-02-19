package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import org.testng.annotations.Test;

public class AutomatePurchaseProcessTest extends BaseTest {


    @Test
    public void testPurchaseProcess() {
        loginPage.logIn("performance_glitch_user", "secret_sauce");
    }

}
