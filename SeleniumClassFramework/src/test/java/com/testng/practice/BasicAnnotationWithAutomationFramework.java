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
	@Test//no need 1st test
	public void dressTest() {
		new DressSelection().getDress(driver);
	}
	@Test(dependsOnMethods = {"dressTest"} )
	public void cartTest() {
		new CartFuction().getAddDressInCart(driver);
	}
	@Test(dependsOnMethods = {"cartTest"} )
	public void payment() {
		new Payment().getPayment(driver);
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
