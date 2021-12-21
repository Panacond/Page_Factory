package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//title")
    private WebElement title;

    @FindBy(xpath = "//*[@id='jvlabelWrap']/jdiv[@class='hoverl_72cd']")
    private WebElement buttonStartChat;

    @FindBy(xpath = "//textarea[@class='inputField_adc3']")
    private WebElement areaInputText;

    @FindBy(xpath = "//jdiv[contains(@class,'message')]/jdiv[contains(@class,'text')]")
    private WebElement resultMassage;

    @FindBy(xpath = "//img [contains(@src,'mi-brand')]")
    private WebElement buttonMi;

    @FindBy(xpath ="//span[@class='sidebar-item']")
    private WebElement buttonCatalog;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href,'telefonyi-i-aksessuaryi')]")
    private WebElement buttonPhonesAndAccessories;

    public void pageResultTitle(){
        title.getText();
    }

    public void startChat(){
        buttonStartChat.click();
    }

    public  void sendMassage(String text){
        areaInputText.sendKeys(text, Keys.ENTER);
    }

    public String getResultMassage(){
        return resultMassage.getText();
    }

    public void clickButtonMi(){
        buttonMi.click();
    }

    public void clickButtonCatalog(){
        buttonCatalog.click();
    }
    public void clickButtonPhonesAndAccessories(){
        buttonPhonesAndAccessories.click();
    }

}