package com.testng.practice;

import org.testng.annotations.Test;

public class GroupTestCartModule {

	@Test(groups = { "Regression" })

	public void reg1() {
		System.out.println("This is CartModule regression Test1");

	}

	@Test(groups = { "Regression" })

	public void reg2() {
		System.out.println("This is CartModule regression Test2");

	}

	@Test(groups = { "Smoke" })

	public void smoke1() {
		System.out.println("This is CartModule Smoke Test");

	}

	@Test(groups = { "Sanity" })

	public void sanity1() {
		System.out.println("this is CartModule  Sanity Test");

	}
}