package com.cucumberpom.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//main//java//com//cucumberpom//Features//truTime.feature", // the path of the feature
	    glue = { "com.cucumberpom.StepDefinitions" }, // the path of the step definition files
		plugin = { "pretty", "html:target//cucumber//report.html", "json:target//cucumber//report.json","junit:target//cucumber//report.xml"},
		dryRun = false, 
		monochrome = true)   

public class testRunner extends AbstractTestNGCucumberTests {    //Runs cucumber every detected feature as separated test

}
