package PagesPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.util.List;

public class clickupFormPage {
    //All Element Present in Site
    @FindBy(xpath = "//input[@placeholder='Enter text']")
    private WebElement userName;

    @FindBy(xpath = "//textarea")
    private WebElement DescriptionBox;

    @FindBy(xpath = "//div[@class='cu-form__date-picker-input ng-untouched ng-pristine ng-invalid flatpickr-input']")
    private WebElement dueDate;

    @FindBy(xpath = "//div[@class='dayContainer']/span")
    private List<WebElement> date;

    @FindBy(xpath = "//span[text()='Select a status']")
    private WebElement Clickstatus;

    @FindBy(xpath = "//div[@class='status-list__container status-list__scroll-view']//div[@class='status-list__status']")
    private List<WebElement> noOfStutus;

    //"//div[@class='status-list__status']",

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement mobileNo;

    @FindBy(xpath = "//div[@class='cu-checkbox__label']")
    private WebElement ClickHere;

    @FindBy(xpath = "//button[@class='cu-form__submit' and text()=' Submit ']")
    private WebElement SubmitBtn;

    @FindBy(xpath = "//p[text()='Your submission has been received.']") private WebElement Thanksmsg;

    public clickupFormPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setName(String name)
    {
        userName.sendKeys(name);

    }

    public void setDescriptionBox(String msg){
        DescriptionBox.sendKeys(msg);
    }

    public void setDate(WebDriver driver,String dt)
        {
            dueDate.click();

            try {
                for (WebElement d : date) {
                    if (d.getText().equals(dt)) {
                        d.click();
                    }
                }
            }catch(Exception e)
            {
                List<WebElement> date = driver.findElements(By.xpath("//div[@class='dayContainer']/span"));
                for (WebElement d : date)
                {
                if (d.getText().equals(dt))
                {
                    d.click();
                }
            }
            }

        }
    public void ClickOnStatus()
    {
        Clickstatus.click();
    }

    public void setStatusDrp(String statName, WebDriver driver)
    {


        driver.findElement(By.xpath("//div[text()=' Open ']")).click();
//        for(WebElement status : noOfStutus)
//        {
//            System.out.println(status.getText());
//            if(status.getText().equalsIgnoreCase(statName))
//            {
//
//
//                Actions actions = new Actions(driver);
//                Actions a = actions.moveToElement(status);
//                a.click().build().perform();
//                //.getElement(status)).click().build().perform()
//
//                status.click();
//
//                WebDriverWait wait2 = new WebDriverWait(driver, 15);
//                wait2.until(ExpectedConditions.visibilityOfAllElements(status));
//            }
//        }


    }

    public void setMobileNo(String mobNum)
    {
        mobileNo.sendKeys(mobNum);
        Reporter.log("Enter mobile number");
    }

    public void  setClickHere()
    {
        ClickHere.click();
    }

    public void  setSubmitBtn()
    {
        SubmitBtn.click();
    }

    public String getThanksmsg()
    {
        String ThankYoumsg=Thanksmsg.getText();
        return ThankYoumsg;
    }

}
