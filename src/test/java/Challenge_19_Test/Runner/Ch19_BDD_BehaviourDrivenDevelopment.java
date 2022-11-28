package Challenge_19_Test.Runner;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions (features = "src/test/java/Challenge_19_Test/Feature" ,
        glue = {"Challenge_19_Test/Steps"} ,
        plugin = {"pretty" , "html:tsrget/cucumber-html-report"})

public class Ch19_BDD_BehaviourDrivenDevelopment extends TestBase_19
{

}
