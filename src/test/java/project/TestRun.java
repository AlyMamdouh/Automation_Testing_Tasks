package project;


import Stage2.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class TestRun extends TestBase
{
      HomePage Orange;

    @Test
    public void signin_Valid() throws InterruptedException, IOException {
        Orange = new HomePage(AlyDriver);
        Orange.Login_Valid();



        Thread.sleep(1000);

        //String zeft1 = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6";
        //WebElement zeft2= AlyDriver.findElement(By.xpath(zeft1));
        //Assert.assertEquals(zeft2.getText(),"PIM");
        //                    /*actual result*/   /*expected result*/

        // System.out.println(zeft2.getText());

        // Thread.sleep(1000);

        // assertion of "Logout" button

        AlyDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();

        Thread.sleep(1000);

        String zeft11 = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a";
        WebElement zeft22= AlyDriver.findElement(By.xpath(zeft11));
        Assert.assertEquals(zeft22.getText(),"Logout");
        System.out.println(zeft22.getText());

    }


    @Test
    public void signin_InValid() throws InterruptedException, IOException {
        Orange = new HomePage(AlyDriver);
        Orange.Login_InValid();

        Thread.sleep(2000);

        String zeft3 = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p";
        WebElement zeft4= AlyDriver.findElement(By.xpath(zeft3));
        Assert.assertEquals(zeft4.getText(),"Invalid credentials");

        System.out.println(zeft4.getText());
    }


    @Test
    public void Ver_LinkedIn() throws InterruptedException, IOException {
        Orange = new HomePage(AlyDriver);
        Orange.Verify_LinkedIn();
        Thread.sleep(1000);

        //TakeScreenShotYasta("LinkedIn");

    }

    @Test
    public void Ver_Facebook() throws InterruptedException {
        Orange = new HomePage(AlyDriver);
        Orange.Verify_Facebook();

        Thread.sleep(1000);

    }

    @Test
    public void Ver_Twitter() throws InterruptedException {
        Orange = new HomePage(AlyDriver);
        Orange.Verify_Twitter();

        Thread.sleep(1000);

    }

    @Test
    public void Ver_Youtube() throws InterruptedException {
        Orange = new HomePage(AlyDriver);
        Orange.Verify_Youtube();

        Thread.sleep(1000);

    }

    @Test
    public void Ver_ForgotPass() throws InterruptedException {
        Orange = new HomePage(AlyDriver);
        Orange.Verify_ForgotPass();

        Thread.sleep(2000);

        String zeft5 = "//*[@id=\"app\"]/div[1]/div[1]/div/h6";
        WebElement zeft6= AlyDriver.findElement(By.xpath(zeft5));
        Assert.assertEquals(zeft6.getText(),"Reset Password link sent successfully");

        System.out.println(zeft6.getText());

    }


    // DataDriven

    @Test(dataProvider = "test_data")
    public void signin_Valid_DD(String Username , String Password) throws InterruptedException {
        Orange = new HomePage(AlyDriver);
        AlyDriver.findElement(By.name("username")).sendKeys(Username);
        AlyDriver.findElement(By.name("password")).sendKeys(Password);

        Thread.sleep(1000);

    }



}
