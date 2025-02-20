package com.demoguru.tests;

import com.demoguru.base.BaseTest;
import com.demoguru.pages.SeleniumLiveProjectPage;
import com.demoguru.pages.ToolTipDemoPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class IframeAndTabHandlingTest extends BaseTest {

    @Test
    public void testIframeAndTabHandling() {
        SeleniumLiveProjectPage seleniumLiveProjectPage = homePage.clickIframeImage();
        seleniumLiveProjectPage.closeTab();
        String email = "test@email.com";
        homePage.fillEmailInputField(email);
        homePage.submitEmail();
        String expectedValue = "Successfully";
        assertTrue(getAlertText().contains(expectedValue));
        acceptAlert();
        homePage.clickSeleniumDropDown();
        ToolTipDemoPage toolTipDemoPage = homePage.clickTooltipDropdownItem();
        assertTrue(toolTipDemoPage.isDownloadButtonVisible());
    }

}
