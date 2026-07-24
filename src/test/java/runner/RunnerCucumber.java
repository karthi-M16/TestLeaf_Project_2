package runner;

import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;


@CucumberOptions(features = {"src/test/resources/features/demo.feature"} , 
        glue = {"stepdefinition" , "hooks"} ,
        publish = true
    )
public class RunnerCucumber  extends BaseClass{


}
