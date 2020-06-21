package com.sanity;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generic.code.BaseLoginTestNG;
import com.generic.code.CartFuction;
import com.generic.code.DressSelection;
import com.generic.code.Payment;
import com.testng.advance.annotation.ListenerTest;
//@Listeners(ListenerTest.class)
public class SanityTestWithTestNG {//Testng framework

	 WebDriver driver;
	
	@BeforeTest
	public void setup() throws Throwable {
	
		driver =new BaseLoginTestNG().getLogin();
		
	}
	
	@Test
	public void dressSelection() {
		
		DressSelection obj = new DressSelection();
		obj.getDress(driver);//select dress 2	
		
	}
	@Test
	public void cartFunction() {
		CartFuction obj2 = new CartFuction();
		obj2.getAddDressInCart(driver);// add dres	
			
	}
	@Test
	public void payment() {
		
		new Payment().getPayment(driver);//pay 4
	}
	
	
	@AfterTest
	public void teardown() {
		
		//driver.quit();
	}
	
	
}
