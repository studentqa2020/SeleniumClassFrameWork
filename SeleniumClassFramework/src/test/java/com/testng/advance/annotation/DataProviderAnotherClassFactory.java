package com.testng.advance.annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DataProviderAnotherClassFactory {
	 private String email;
	    private String pass;

	    @Factory (dataProvider = "dataProviderMethod", dataProviderClass = DataProviderSameClass.class)
	    public DataProviderAnotherClassFactory( String email, String pass){
	        this.email = email;
	        this.pass = pass;
	    }
	   
	    @Test 
	    public void testCase3() throws InterruptedException {
	        System.out.println("Factory "+email+","+pass);
	    }
}