package com.demoguru.tests;

import com.demoguru.base.BaseTest;
import com.demoguru.pages.SeleniumLiveProjectPage;
import org.testng.annotations.Test;

public class IframeAndTabHandlingTest extends BaseTest {

    @Test
    public void testIframeAndTabHandling() {
        SeleniumLiveProjectPage seleniumLiveProjectPage = homePage.clickIframeImage();
        seleniumLiveProjectPage.closeTab();
    }

}
