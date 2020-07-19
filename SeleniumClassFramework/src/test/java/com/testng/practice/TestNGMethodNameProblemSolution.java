package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.CartFuction;
import com.generic.code.DressSelection;
import com.generic.code.Payment;

public class TestNGMethodNameProblemSolution {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Throwable {
		System.out.println("This before test = login");
	}
	@Test()// do nothing
	public void dress() {
		System.out.println("This my dress selection test");
	}
	@Test(dependsOnMethods = {"dress"})
	public void cart() {
		System.out.println("This is my Cart test");
	}
	@Test(dependsOnMethods = {"cart"})
	public void payment() {
		System.out.println("This is my payment test");
	}
	@AfterTest
	public void teardown() {
		System.out.println("After Test = any thing close");
	}
}
