package com.testng.practice;

import org.testng.annotations.Test;

public class CartModule {
	 

	   @Test(groups = { "Regression"})
	   
	   public void test1() {
	      System.out.println("This is CartModule regression Test");
	     
	   }

	   @Test(groups = { "Smoke" })
	   
	   public void test2() {
	      System.out.println("This is CartModule Smoke Test");
	    
	   }

	   @Test(groups = { "Sanity" })
	   
	   public void test3() {
	      System.out.println("this is CartModule  Sanity Test");
	     
	   }  
	}