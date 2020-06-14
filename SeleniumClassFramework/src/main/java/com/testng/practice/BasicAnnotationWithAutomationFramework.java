package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.CartFuction;
import com.generic.code.DressSelection;
import com.generic.code.Payment;

public class BasicAnnotationWithAutomationFramework {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Throwable {
		driver = BaseLogin.getLogin();
	}
	@Test
	public void test1() {
		DressSelection obj = new DressSelection();
		obj.getDress(driver);
	}
	@Test
	public void test2() {
		CartFuction obj = new CartFuction();
		obj.getAddDressInCart(driver);
	}
	@Test
	public void test3() {
		Payment.getPayment(driver);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
