package com.testng.practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
	@AfterTest
	public void teardown() {
		
		
		System.out.println("This is my @AfterTest");
	}
	
	@Test
	public void dress() {
		
		System.out.println("this is my @test for dress");
	}
	
	
	@BeforeTest
	public void setup() 
	{
		
		System.out.println("This is @BeforeTest");
	}
	
	
}
