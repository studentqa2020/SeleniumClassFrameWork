package com.testng.advance.annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DataProviderAndFactory {

	String email;
	String pass;
	String url;

	@Factory(dataProvider = "dataProviderMethod")
	public DataProviderAndFactory(String email, String pass, String url) {
		this.email = email;
		this.pass = pass;
		this.url = url;
	}

	@DataProvider
	public static Object[][] dataProviderMethod() {

		return new Object[][] { { "Sarower", "3333", "www.something" }, { "Ahmmed", "9999", "www.something" } };
	}

	@Test
	public void test1() {

		System.out.println("User Data for test1 tesing : " + email + "  Password Data is: " + pass + "  Location Data is: " + url);

	}
	@Test
	public void test2() {

		System.out.println("User Data for test2 testing : " + email + "  Password Data is: " + pass + "  Location Data is: " + url);

	}
	@Test
	public void test3() {

		System.out.println("User Data for test3 testing : " + email + "  Password Data is: " + pass + "  Location Data is: " + url);

	}
}
