package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartphonePage extends BasePage{
    public SmartphonePage(WebDriver driver) { super(driver);
    }

    @FindBy( xpath = "//a [contains(@data-ecomm-cart, 'Смартфон Xiaomi Poco X3 Pro 8\\/256GB Frost Blue')]")
    private WebElement findModel;

    @FindBy(xpath = "//div[@id='js_cart']")
    private WebElement addToCart;

    @FindBy (xpath = "//a [text()='Оформить заказ']")
    private WebElement buttonCheckout;

    @FindBy( xpath = "//span [contains(text(),'Смартфон Xiaomi Poco X3 Pro 8/256GB Frost Blue')]")
    private WebElement findXiaomiPocoX3Pro8256GB;

    @FindBy(xpath = "//a[contains(@href,'xiaomi-poco-x3-pro-8256gb-metal-bronze')]")
    private WebElement colorBronseXiaomiPocoX3Pro8256GB;

    @FindBy(xpath = "//img[contains(@src,'xiaomi-poco-x3-pro-6128gb-metal-bronze')]")
    private WebElement findXiaomiPocoX3Pro6128gb;

    @FindBy(xpath = "//img[contains(@src,'xiaomi-poco-x3-pro-6128gb-metal-bronze')]")
    private WebElement checkimgXiaomiPocoX3Pro6128gbMetalBronze;

    public void clickFindModel(){
        findModel.click();
    }

    public void clickButtonCheckout(){
        buttonCheckout.click();
    }
    public boolean trueFindXiaomiPocoX3Pro8256GB(){
        return findXiaomiPocoX3Pro8256GB.getText().isEmpty();
    }

    public void setColorBronseXiaomiPocoX3Pro8256GB(){
        colorBronseXiaomiPocoX3Pro8256GB.click();
    }

    public boolean trueFindXiaomiPocoX3Pro6128gb(){
        return findXiaomiPocoX3Pro6128gb.isEnabled();
    }

    public WebElement getCheckimgXiaomiPocoX3Pro6128gbMetalBronze(){
       return checkimgXiaomiPocoX3Pro6128gbMetalBronze;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }
}
