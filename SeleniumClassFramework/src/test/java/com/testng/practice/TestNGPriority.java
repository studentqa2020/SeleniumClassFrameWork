package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.CartFuction;
import com.generic.code.DressSelection;
import com.generic.code.Payment;

public class TestNGPriority {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Throwable {
		System.out.println("This before test = login");
	}
	@Test(priority = 2)
	public void dress() {
		System.out.println("This my dress selection test");
	}
	@Test(priority = 1)
	public void cart() {
		System.out.println("This is my Cart test");
	}
	@Test(priority = 0)
	public void payment() {//most important ==> run 1st
		System.out.println("This is my payment test");
	}
	@AfterTest
	public void teardown() {
		System.out.println("After Test = any thing close");
	}
}
