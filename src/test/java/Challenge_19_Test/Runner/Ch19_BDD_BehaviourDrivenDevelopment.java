package Challenge_19_Test.Runner;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions (features = "src/test/java/Challenge_19_Test/Feature" ,     // path Folder el Feature (Path from content root)
        glue = {"Challenge_19_Test/Steps"} ,                                 // path folder el Steps mn ba3d el java folder (Path from source root)
        plugin = {"pretty" , "html:tsrget/cucumber-html-report"})            // hy3ml report esmo cucumber-html-report w hy3ml folder y7oto feh esmo tsrget

public class Ch19_BDD_BehaviourDrivenDevelopment extends TestBase_19 {}
