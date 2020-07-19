package com.testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting {
	String browserValue ="Chrome";
	@Test
	//@Parameters("browser") 
	public void getbrowser(String browserValue) {
		this.browserValue =browserValue;
		System.out.println(browserValue);

	}

}
