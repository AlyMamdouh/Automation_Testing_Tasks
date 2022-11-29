package Challenge_19_Test.Steps;

import Base_of_Main.Base_All_Main;
import Challenge_19_Main.Ch19_Page;
import Challenge_19_Test.Runner.Ch19_BDD_BehaviourDrivenDevelopment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserLoggingIn extends Ch19_BDD_BehaviourDrivenDevelopment
{

    Ch19_Page Ch19obj;



    @Given("the user is in the homepage")
    public void the_user_is_in_the_homepage() throws InterruptedException
    {
        Ch19obj = new Ch19_Page(AlyDriver);
        Thread.sleep(2500);
    }


    @When("the user enters valid username and valid password")
    public void the_user_enters_valid_username_and_valid_password() throws InterruptedException
    {
        Ch19obj.username.sendKeys("Admin");
        Ch19obj.password.sendKeys("admin123");
        Thread.sleep(2000);

    }


    @When("the user clicks on Login button")
    public void the_user_clicks_on_login_button()
    {

        Ch19obj.loggin.click();

    }


    @Then("the user is logging in successfully and redirected to the homepage of his\\/her account")
    public void the_user_is_logging_in_successfully_and_redirected_to_the_homepage_of_his_her_account() throws InterruptedException
    {


        Thread.sleep(3000);


        Ch19obj.UserLogo.click();
        Assert.assertEquals(Ch19obj.Logout.getText(),"Logout");
        System.out.println(Ch19obj.Logout.getText());


    }



}
