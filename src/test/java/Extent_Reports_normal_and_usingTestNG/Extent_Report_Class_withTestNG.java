package Extent_Reports_normal_and_usingTestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;



public class Extent_Report_Class_withTestNG
{

    WebDriver ExtendTestNGdriver;
    ExtentReports extent;
    ExtentHtmlReporter htmlReporter;
    ExtentTest ET;

    @BeforeTest
    public void Setup()

    {
        htmlReporter = new ExtentHtmlReporter("extentTestNG.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);



        WebDriverManager.chromedriver().setup();
        ExtendTestNGdriver = new ChromeDriver();
        ExtendTestNGdriver.manage().window().maximize();

    }

    @Test
    public void Testtt()
    {

        ET = extent.createTest("Login Function");


        ExtendTestNGdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        ExtendTestNGdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        ExtendTestNGdriver.findElement(By.name("username")).sendKeys("Admin");
        ET.log(Status.INFO, "UserName is inserted");


        ExtendTestNGdriver.findElement(By.name("password")).sendKeys("admin123");
        ET.log(Status.INFO, "Password is inserted");


        ExtendTestNGdriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        ET.pass("User is loggedin");


        ExtendTestNGdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @AfterTest
    public void TearDown() {
        extent.flush();
        ExtendTestNGdriver.quit();
    }

}