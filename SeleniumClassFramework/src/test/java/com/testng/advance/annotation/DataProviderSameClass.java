package com.testng.advance.annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSameClass {

	@DataProvider
	public static Object[][] dataProviderMethod() {

		return new Object[][] { { "Sarower", "3333", "Queens" }, { "Ahmmed", "9999", "Bronx" } };
	}

	@Test(dataProvider = "dataProviderMethod")
	public void testDataProvide(String email, String pass, String address) {

		System.out.println("User Data is: " + email + "  Password Data is: " + pass + "  Location Data is: " + address);

	}
}