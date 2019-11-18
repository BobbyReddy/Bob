package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features" ,monochrome=true, strict =true,
glue ="stepDefinations",tags = "@seleniumTest",
plugin = {"pretty" , "html:target/cucumber" ,"json:target/cucumber.json" ,"junit:target/cukes.xml"})

public class TestRunner {

}


//dryRun=true , monochrome=true, strict =true,