package com.testng.practice;

import org.testng.annotations.Test;

public class ProductModule {

	 

	   @Test(groups = { "Regression"})
	   
	   public void test1() {
	      System.out.println("This is ProductModule regression Test");
	     
	   }

	   @Test(groups = { "Smoke" })
	   
	   public void test2() {
	      System.out.println("This is ProductModule Smoke Test");
	    
	   }

	   @Test(groups = { "Sanity" })
	   
	   public void test3() {
	      System.out.println("this is ProductModule Sanity Test");
	     
	   }  
	}