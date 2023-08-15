package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    @FindBy(xpath = "//*[@id=\"bwp-topbar\"]/div/div/div/div[2]/div[1]/a/text()")
    WebElement AddressText;

    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[2]")
    WebElement ButtonShop;

    public boolean addressTextShown() {
        return AddressText.isDisplayed();
    }

    public void clickOnShop() {
        ButtonShop.click();
    }

}
