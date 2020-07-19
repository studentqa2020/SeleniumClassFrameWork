package com.testng.advance.annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DataProviderSameClassWithFactory {
	 private String email;
	    private String pass;

	    @Factory (dataProvider="dataProviderMethod")
	    public DataProviderSameClassWithFactory( String email, String pass){
	        this.email = email;
	        this.pass = pass;
	    }

	    @DataProvider
	    public static Object[][] dataProviderMethod() {
	        return new Object[][] { { "Sarower", "3333"}, {"Ahmmed", "9999"} };
	    }
	   
	    @Test 
	    public void testCase3() throws InterruptedException {
	        System.out.println("Factory same class "+email+","+pass);
	    }
}