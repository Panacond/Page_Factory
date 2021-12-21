package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class XiaomiPage extends BasePage{
    public XiaomiPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//article [@class='brand__item']")
    private List<WebElement> searchResultProduct;

    public List<WebElement> getElementsList(){
        return searchResultProduct;
    }


    List<WebElement> elementsList = driver.findElements(xpath("//article [@class='brand__item']"));

}
