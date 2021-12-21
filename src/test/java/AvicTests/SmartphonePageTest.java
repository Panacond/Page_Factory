package AvicTests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SmartphonePageTest extends BaseTest{


    @Test(priority = 4)
    public void checkAddToCart() {
        getHomePage().clickButtonCatalog();
        getHomePage().clickButtonPhonesAndAccessories();
        getPhonesAndAccessoriesPage().clickButtonSmartphones();
        getPhonesAndAccessoriesPage().waitForPageLoadComplete(30);
        getSmartphonePage().clickFindModel();
        getSmartphonePage().waitVisibilityOfElement(30,getSmartphonePage().getAddToCart());
        getSmartphonePage().clickButtonCheckout();
        getSmartphonePage().waitForPageLoadComplete(30);
        assertFalse(getSmartphonePage().trueFindXiaomiPocoX3Pro8256GB());

    }

    @Test(priority = 5)
    public void checkColorSmartphone(){
        getHomePage().clickButtonCatalog();
        getHomePage().clickButtonPhonesAndAccessories();
        getPhonesAndAccessoriesPage().clickButtonSmartphones();
        getPhonesAndAccessoriesPage().waitForPageLoadComplete(30);
        getSmartphonePage().setColorBronseXiaomiPocoX3Pro8256GB();
        getSmartphonePage().waitVisibilityOfElement(30,getSmartphonePage().getCheckimgXiaomiPocoX3Pro6128gbMetalBronze());
        assertTrue(getSmartphonePage().trueFindXiaomiPocoX3Pro6128gb());

    }

}
