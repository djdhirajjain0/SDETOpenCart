package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"navbar-collapse-header\"]/div/a[2]")
    WebElement registerLink;
    @FindBy(xpath = "//*[@id=\"navbar-collapse-header\"]/div/a[1]")
    WebElement loginLink;

    public void clickRegister() {
        registerLink.click();
    }

    public void clickLogin() {
        loginLink.click();
    }

}
