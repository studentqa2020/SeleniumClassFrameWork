package com.generic.code;

import org.openqa.selenium.WebDriver;

import com.page.object.model.ProductPage;
import com.util.Highlighter;
import com.util.TakeAppScreenShot;

public class Payment {
	
	
	public  void getPayment(WebDriver driver){
		
		ProductPage pf = new ProductPage(driver);// 2
		Highlighter.getcolor(driver, pf.getpaymentOptions().get(0), "red");
		pf.getpaymentOptions().get(0).click();//select payment
		Highlighter.getcolor(driver, pf.getorderConfirmedBtn().get(0), "red");
		pf.getorderConfirmedBtn().get(0).click();
		Highlighter.getcolor(driver, pf.getorderSummary());
		System.out.println(pf.getorderSummary().getText());
		
		TakeAppScreenShot.captureScreenShot(driver, "My Order Summary");
		

	}

}
