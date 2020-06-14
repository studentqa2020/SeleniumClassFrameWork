package com.testng.practice;

import org.testng.annotations.Test;

public class GroupTest {
	   String message = ".com";
	 

	   @Test(groups = { "class",})
	   
	   public void test1() {
	      System.out.println("This is class");
	     
	   }

	   @Test(groups = { "team1" })
	   
	   public void test2() {
	      System.out.println("This is team one");
	    
	   }

	   @Test(groups = { "team2" })
	   
	   public void test3() {
	      System.out.println("this is team Two");
	     
	   }  
	}