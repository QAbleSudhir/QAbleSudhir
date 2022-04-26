package PagesPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TutorialsPointHomePage {
    public WebDriver driver;

    //Defines All Elements :
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//table//input[@value='Male']")
    private WebElement MaleBtn;

    @FindBy(xpath = "//input[@value='Female']")
    private WebElement FemaleBtn;

    @FindBy(xpath = "//form[@target='_blank']//td//input[@name='exp']")
    private List<WebElement> yearOfExp;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    private WebElement dateBox;

    @FindBy(xpath = "//input[@name='profession']")
    private List<WebElement> Professions;

    @FindBy(xpath = "//input[@name='photo'and @type='file']")
    private WebElement upladPic;

    @FindBy(xpath = "//input[@name='tool']")
    private List<WebElement> seleniumFlewers;

    @FindBy(xpath = "//select[@name='continents']")
    private WebElement country;

    @FindBy(xpath = "//select[@name='selenium_commands']")
    private WebElement seleniumCmds;

    @FindBy(xpath = "//button[@name='submit']")
    private WebElement submitBtn;

    public TutorialsPointHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setFirstName() {
        firstName.sendKeys("Sudhir");
    }

    public void setLastName() {
        lastName.sendKeys("Motghare");
    }

    public void ClickOnMaleBtn(WebDriver driver)
    {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",MaleBtn);
    }

    public void ClickOnFemaleBtn() {
        FemaleBtn.click();
    }

    public  void setYearOfExperience(String experience)
    {
        for (WebElement num : yearOfExp)
        {
            String text=num.getAttribute("value");
            if(text.equals(experience))
            {
                num.click();
            }
        }

    }

    public void setDateBox(String date) {
        dateBox.sendKeys(date);
    }

    public void setProfessions(String Profession)
    {
        for (WebElement prof : Professions)
        {
            if (prof.getAttribute("value").equals(Profession))
            {
                prof.click();
            }
        }
    }


    public void setUpladPic()
    {
        upladPic.sendKeys("C:\\Users\\Admin\\Downloads\\profilepic.png");
    }

    public void setSeleniumFlewars(String flwName)
    {
        for (WebElement flawer:seleniumFlewers)
        {
            if(flawer.getAttribute("value").equals(flwName))
            {
                flawer.click();
            }
        }
    }

    public void setCountry(String Cntry)
    {
        Select sel = new Select(country);
        List<WebElement> all = sel.getOptions();
        for (WebElement a : all)
        {
            if (a.getText().equals(Cntry))
            {
                a.click();
            }
        }

    }

    public void setSeleniumCmds(String cmd)
    {Select sel1 = new Select(seleniumCmds);
        List<WebElement> all = sel1.getOptions();
        for (WebElement a : all) {
            if (a.getText().equals(cmd)) {
                a.click();
            }
        }

    }

    public void SubmitForm()
    {
        submitBtn.click();
    }

}
