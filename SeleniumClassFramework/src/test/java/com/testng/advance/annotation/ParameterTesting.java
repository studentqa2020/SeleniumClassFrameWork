package com.testng.advance.annotation;

import org.testng.annotations.Test;

public class ParameterTesting {
	String browserValue ="Chrome";
	@Test
	//@Parameters("browser") 
	public void getbrowser() {
		System.out.println(browserValue);

	}

}
