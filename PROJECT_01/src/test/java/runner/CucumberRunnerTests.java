package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
features = "src/test/resources/Feature/Skills.feature", 
tags = "",
glue = "STEPS")
 

//https://stackoverflow.com/questions/41034116/how-to-execute-cucumber-feature-file-parallel
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
 
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
 
}