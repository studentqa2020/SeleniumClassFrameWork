package com.sanity;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.generic.code.BaseLoginTestNG;
import com.generic.code.CartFuction;
import com.generic.code.DressSelection;
import com.generic.code.Payment;
import com.report.ExtentTestManager;

//@Listeners(ListenerTest.class)
public class SanityTestWithTestNG {// Testng framework

	WebDriver driver;
	ExtentTest test;


	@BeforeTest
	public void setup() throws Throwable {
		test = ExtentTestManager.startTest("Regression_tc1");// start
		test.assignCategory("Regression Test");
		test.createNode("setup");
		driver = new BaseLoginTestNG().getLogin();

	}

	@Test
	public void dressSelection() {

		DressSelection obj = new DressSelection();
		obj.getDress(driver);// select dress 2

	}

	@Test(dependsOnMethods = { "dressSelection" })
	public void cartFunction() {
		CartFuction obj2 = new CartFuction();
		obj2.getAddDressInCart(driver);// add dres

	}

	@Test(dependsOnMethods = { "cartFunction" })
	public void payment() {

		new Payment().getPayment(driver);// pay 4
	}

	@AfterTest
	public void teardown() {

		driver.quit();

		ExtentTestManager.endTest();// end
	}

}
