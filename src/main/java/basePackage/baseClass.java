package basePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class baseClass
{
    public static WebDriver driver;

    public void OpenBrowser(String URL)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Softwares\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(URL);

    }

    public void tearDown()
    {

        driver.close();
    }

//    public void log(String str)
//    {
//        Reporter.log(str);
//    }

}
