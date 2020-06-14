package com.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSameClass {
	@DataProvider(name = "alamin")
	public Object[][] dataProviderMethod() {
		return new Object[][] { { 
			"sarower@gmail.com" , "student1234" },
			{ "ahmmed@gmail.com" , "smarttech" } };
	}
	
	@Test(dataProvider = "alamin")
	public void testMethod(String email,String pass) {
		System.out.println("Data is: " + email +"Data is: " + pass);
		
	}
}