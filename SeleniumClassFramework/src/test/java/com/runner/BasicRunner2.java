package com.runner;


import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = { "pretty", 
							"html:target/site/cucumber-pretty", 
							"rerun:target/rerun.txt",
							"json:target/cucumber.json" }, 
			
features = {
		"Feature Files/Dress.feature" },
			glue = { "com.stepdef" }, // package name
			monochrome = true,
			dryRun =false,
			strict = true,
			tags= {"@Smoke"}
			
	)

	public class BasicRunner2 extends AbstractTestNGCucumberTests {

	@BeforeTest//===cucumber hook
	public void setup() {
		//code
	}
}
