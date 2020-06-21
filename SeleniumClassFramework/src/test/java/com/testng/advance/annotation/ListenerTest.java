package com.testng.advance.annotation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	
	
	public void onFinish(ITestContext Result) {
		System.out.println("******************  Test End  =  "+Result.getName()+"  ********************");
	}
	public void onStart(ITestContext Result) {
		System.out.println("******************  Test Started  =  "+Result.getName()+"  ********************");
	
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		System.out.println("The name of the testcase SuccessPercentage is :" + Result.getName());
	}
	public void onTestFailure(ITestResult Result) {
		System.out.println("##########################  Test Failed  =  "+Result.getName()+"  #####################");
	}
	public void onTestSkipped(ITestResult Result) {
		System.out.println("##########################  Test Skip  =  "+Result.getName()+"  #####################");
	}
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " test case started");
	}
	public void onTestSuccess(ITestResult Result) {
		System.out.println("******************  Test Passed  =  "+Result.getName()+"  ********************");
	}

}