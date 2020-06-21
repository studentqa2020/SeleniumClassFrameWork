package com.testng.advance.annotation;

import org.testng.annotations.Test;

public class DataProviderAnotherClass {

	
	@Test(dataProvider = "dataProviderMethod", dataProviderClass = DataProviderSameClass.class)
	public void testDataProvide(String email,String pass) {
		System.out.println("Data is: " + email +"Data is: " + pass);
		
	}
}