package com.testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting {

	@Test
	@Parameters("browser") // browser =fire,chrom,safari
	public void getbrowser(String browserValue) {
		//browserValue=browser
		
		
		System.out.println(browserValue);

	}

}
