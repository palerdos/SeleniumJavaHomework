package com.onlinehtmleditor.tests;

import com.onlinehtmleditor.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RichTextEditorTest extends BaseTest {

    @Test
    public void testTextEditor() {
        String expectedText = "Automation Test Example";
        homePage.enterStyledMessage(expectedText);
        String actualText = homePage.getTextFromTextBox().replaceAll("\u2060", "");
        assertEquals(actualText, expectedText, "Actual text does not match expected text");
    }
}
