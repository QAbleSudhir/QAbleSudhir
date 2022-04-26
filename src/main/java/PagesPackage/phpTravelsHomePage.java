package PagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class phpTravelsHomePage {
    @FindBy(xpath = "//input[@name='email']")
    private WebElement EmailBox;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement Password;
    @FindBy(xpath = "//div[@class='btn-box pt-3 pb-4']//button[@type='submit']")
    private WebElement LoginBtn;
    @FindBy(xpath = "//div[@class='section-heading']//h2")
    private WebElement profileMsg;
    @FindBy(xpath = "//div[@class='cookies_bg']//button")
    private WebElement cookieBtn;

    public phpTravelsHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setEmailBox(String mailID) {
        EmailBox.sendKeys(mailID);
    }


    public void setPassword(String pwd) {
        Password.sendKeys(pwd);
    }

    public void ClickOnLoginBtn() {
        LoginBtn.click();
    }

    public String getProfileName() {
        String pMsg = profileMsg.getAttribute("span");
        System.out.println(pMsg);
        return pMsg;
    }

    public WebElement getcookieBtn()
    {
        return cookieBtn;
    }

}
