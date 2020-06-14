package com.testng.practice;

import org.testng.annotations.Test;

public class GroupTest2 {
	   String message = ".com";
	 

	   @Test(groups = { "Saturday" })
	   
	   public void testPrintMessage() {
	      System.out.println("This is Saturday batch");
	     
	   }

	   @Test(groups = { "Sunday" })
	   
	   public void testSalutationMessage() {
	      System.out.println("This is Sunday batch");
	    
	   }

	  
	}