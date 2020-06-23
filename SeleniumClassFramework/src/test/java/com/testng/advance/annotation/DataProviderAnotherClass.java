package com.testng.advance.annotation;

import org.testng.annotations.Test;

public class DataProviderAnotherClass {

	@Test(dataProvider = "dataProviderMethod", dataProviderClass = DataProviderSameClass.class)
	public void testDataProvide(String email, String pass, String address) {

		System.out.println("User Data is: " + email + "  Password Data is: " + pass + "  Location Data is: " + address);

	}
}