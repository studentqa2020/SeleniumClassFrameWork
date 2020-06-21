package com.testng.advance.annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSameClass {
	
	  @DataProvider
	    public static Object[][] dataProviderMethod() {
	        return new Object[][] { { "Sarower", "3333"}, {"Ahmmed", "9999"} };
	    }
	
	@Test(dataProvider = "dataProviderMethod" )
	public void testDataProvide(String email,String pass) {
		System.out.println("Data is: " + email +"Data is: " + pass);
		
	}
}