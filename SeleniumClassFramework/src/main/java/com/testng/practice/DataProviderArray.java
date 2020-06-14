package com.testng.practice;

import org.testng.annotations.Test;

public class DataProviderArray {

	String user ="sarower";
	String pass="SundayStudent123$";
	//String [] login1={ "Sarower", "SundayStudent123$"};
	//String [] login2={"Sobhan", "Student2019#"};


	String [][] login={ { "Sarower", "SundayStudent123$"},{"Sobhan", "Student2019#"}};
	    @Test 
	    public void testCase3() {
	       
//	    	String a=login1[0]+"::"+login1[1];
//	    	String b=login2[0]+"::"+login2[1];
	    	
	    	String a=login[0][0] + login[0][1] ;
	    	String b=login[1][0] + login[1][1] ;
	    	
	    	System.out.println("Test "+a);
	    	System.out.println("Test "+b);
	    	
	    }
}
