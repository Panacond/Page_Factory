package AvicTests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class XiaomiPageTest extends BaseTest {

    private static final int NUMBER_ELEMENT_PRODUCT = 45;

    @Test(priority = 3)
    public void checkButtonMi() {
        getHomePage().clickButtonMi();
        getHomePage().waitForPageLoadComplete(30);
        assertEquals(getXiaomiPage().getElementsList().size(), NUMBER_ELEMENT_PRODUCT);
    }
}