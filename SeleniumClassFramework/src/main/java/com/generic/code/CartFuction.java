package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.page.object.model.ProductPage;
import com.util.Highlighter;
import com.util.Wait;

public class CartFuction {
	
	public  WebDriver getAddDressInCart(WebDriver driver){
		
		ProductPage pf = new ProductPage(driver);
		pf.getquantityinputbox().clear();
		new Highlighter().getcolor(driver, pf.getquantityinputbox(), "green");
		pf.getquantityinputbox().sendKeys("4");
		
		//how to handle drop down in selenium
		Select select= new Select(pf.getdressSizeDropDown());
		select.getOptions().forEach(option->{
			System.out.println(option.getText());
		});
		
		new Highlighter().getcolor(driver, pf.getdressSizeDropDown(), "blue");
		select.selectByIndex(1);
		//select.selectByVisibleText("M");
		//select.selectByValue("2");
		new Highlighter().getcolor(driver, pf.getaddtoCartBtn(), "yellow");
		pf.getaddtoCartBtn().click();
		
		
		Wait.getExplicitWaitClicable(driver, pf.getproceedToCheckOut());
		new Highlighter().getcolor(driver, pf.getproceedToCheckOut(), "pink");
		pf.getproceedToCheckOut().click();
		
		new Highlighter().getcolor(driver, pf.getsummaryProceedToCheckOut(), "red");
		pf.getsummaryProceedToCheckOut().click();//summary
		
		
		Actions action = new Actions(driver);//Action class== helping selenium
		action.moveToElement(pf.getaddressProceedToCheckOut()).build().perform();
		new Highlighter().getcolor(driver, pf.getaddressProceedToCheckOut(), "red");
		action.click(pf.getaddressProceedToCheckOut()).build().perform();
		
		new Highlighter().getcolor(driver, pf.getcheckBox(), "red");
		pf.getcheckBox().click();//check box
		
		new Highlighter().getcolor(driver, pf.getshippingProceedToCheckOut(), "red");
		pf.getshippingProceedToCheckOut().click();//shipping
		
		
		return driver;
	}

}
