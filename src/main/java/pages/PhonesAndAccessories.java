package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonesAndAccessories extends BasePage {
    public PhonesAndAccessories(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/a[@href='https://avic.ua/smartfonyi']")
    private WebElement buttonSmartphones;

    public void clickButtonSmartphones() {
        buttonSmartphones.click();
    }

}
