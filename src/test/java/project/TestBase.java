package project;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.test.TestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.io.IO;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase

{
    public static WebDriver AlyDriver;



    //Method of taking screenshot after each test
    public  void TakeScreenShotYasta (String screenname) throws  IOException {
        File scrFile = ((TakesScreenshot) AlyDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Users\\aabdelhamid\\IdeaProjects\\Induction\\Screenshots\\" + screenname + ".png"));
    }





    @BeforeMethod
    @Parameters ({"Browser", "BaseURL"})
    public void startDriver(@Optional("Chrome") String BrowserName, String BaseURL)
    {
        if (BrowserName.equalsIgnoreCase("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            AlyDriver = new ChromeDriver();

        }

        else if (BrowserName.equalsIgnoreCase("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            AlyDriver = new FirefoxDriver();
        }

        else if (BrowserName.equalsIgnoreCase("IE"))
        {
            WebDriverManager.iedriver().setup();
            AlyDriver = new InternetExplorerDriver();
        }

        else if (BrowserName.equalsIgnoreCase("Safari"))
        {
            WebDriverManager.safaridriver().setup();
            AlyDriver = new SafariDriver();
        }



        AlyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //هيستنى 15 ث علشان الويب ايليمنتس تحمل .. عدت 15ث و محملتش هيدي اكسبشن ايرور .. حملت وسط ال15ث هيكمل باقي الكود

        AlyDriver.navigate().to(BaseURL);
        AlyDriver.manage().window().maximize();

    }

/////**************************************************************************************************************/////
    @AfterMethod

    public void logout()
    {
        AlyDriver.quit();
    }


    @AfterMethod
    public void Screenshot(ITestResult result)throws IOException
    {
        TakeScreenShotYasta (result.getName());
    }
/////**************************************************************************************************************/////
/////**************************************************************************************************************/////
/////**************************************************************************************************************/////

    @DataProvider
    public Object[][] test_data() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        read_excel_data obj=new read_excel_data();
        return obj.read_sheet();
    }




}


/////**************************************************************************************************************/////
/////**************************************************************************************************************/////
/////**************************************************************************************************************/////
