package com.runner;


import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "pretty", 
		"html:target/site/cucumber-pretty", 
		"rerun:target/rerun.txt",
			"json:target/cucumber.json" }, 
			
			features = {"src/test/resources/Login.feature" },
			glue = { "com.stepdef" }, // package name
			monochrome = true,
			dryRun =false,
			strict = true,
		 tags= {"@Function"}
			
	)

	public class BasicRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void setup() {
		//code
	}
}
