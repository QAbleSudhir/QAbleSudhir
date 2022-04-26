package PagesPackage;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class RahulShettyPage {
    @FindBy(xpath = "//input[@name='radioButton']")
    private List<WebElement> radioBtns;

    @FindBy(xpath = "//input[@id='autocomplete']")
    private WebElement SuggessionBox;

    @FindBy(xpath = "//select[@id='dropdown-class-example']")
    private List<WebElement> DropDownExample;

    @FindBy(xpath = "//div[@id='checkbox-example']//input")
    private List<WebElement> Checkboxs;

    @FindBy(xpath = "//button[@id='openwindow']")
    private WebElement OpenWindowBtn;

    @FindBy(xpath = "//a[@id='opentab']")
    private WebElement opentabBtn;

    @FindBy(xpath = "//input[@name='enter-name']")
    private WebElement AlertTextBox;

    @FindBy(xpath = "//input[@id='alertbtn']")
    private WebElement AlertBtn;

    @FindBy(xpath = "//input[@id='confirmbtn']")
    private WebElement AlertConfirmbtn;

    @FindBy(xpath = "//table[@name='courses']")
    private WebElement Coursetable;

    @FindBy(xpath = "//div[@class='tableFixHead']")
    private WebElement tableFixHead;

    @FindBy(xpath = "//button[@id='mousehover']")
    private WebElement MouseHoverBtn;

    @FindBy(xpath = "//iframe[@id='courses-iframe']")
    private WebElement iframe;

    public RahulShettyPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public void setRadioBtns(String btnname)
    {
        for (WebElement btn:radioBtns)
        {
            System.out.println(btn.getText());
            if(btn.getAttribute("value").equals(btnname))
            {
                btn.click();
            }
        }

    }

    public void setSuggessionBox()
    {
        SuggessionBox.click();
        SuggessionBox.sendKeys("india");



       // Reporter.log("Test123 entered..");

    }





}
