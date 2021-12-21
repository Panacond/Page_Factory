package AvicTests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends BaseTest {

    private static final String HOME_PAGE_TITLE = "AVIC™ - удобный интернет-магазин бытовой техники и электроники в Украине. | Avic";
    private static final String INPUT_TEXT = "Hello";

    @Test(priority = 1)
    public void checkTitle() {
        getHomePage().pageResultTitle();
        assertTrue(getDriver().getTitle().contains(HOME_PAGE_TITLE));
    }

    @Test(priority = 2)
    public void checkChat() {
        getHomePage().implicitWait(30);
        getHomePage().startChat();
        getHomePage().implicitWait(30);
        getHomePage().sendMassage(INPUT_TEXT);
        getHomePage().waitForPageLoadComplete(30);
        assertTrue(getHomePage().getResultMassage().contains(INPUT_TEXT));
    }
}
