package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.generic.code.BaseLogin;
import com.page.object.model.ProductPage;
import com.util.Highlighter;
import com.util.TakeAppScreenShot;
import com.util.Wait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AutomationPractice{

	ProductPage pf;
	protected static  WebDriver driver;
	
	@Given("login")
	public void login() throws Throwable {
		driver=BaseLogin.getLogin();

	}

	@Given("find out total dress number")
	public void find_out_total_dress_number() throws Throwable {
		
		System.out.println("Tile page is = "+ driver.getTitle());
		pf = new ProductPage(driver);
		pf.getdressesbtn().click();
		int totalNo = pf.getdressesCount().size();
		System.out.println("Total dress displayed = " + totalNo);
	}

	@Given("find out dress name")
	public void find_out_dress_name() {

		pf.getallDressName().forEach(name -> {

			System.out.println("Found dress name = " + name.getText());

		});
	}

	@When("find out dress price")
	public void find_out_dress_price() {

		pf.getallDressPrice().forEach(price -> {

			System.out.println("Found dress price = " + price.getText());
		});
	}

	@When("select {int}th dress")
	public void select_th_dress(Integer int1) {

		Highlighter.getcolor(driver, pf.getallDressName().get(4), "red");
		pf.getallDressName().get(4).click();
	}

	@When("select four quantity")
	public void select_four_quantity() {
		
		Wait.getExplicitWaitClicable(driver, pf.getquantityinputbox());
		pf.getquantityinputbox().clear();
		Highlighter.getcolor(driver, pf.getquantityinputbox(), "green");
		pf.getquantityinputbox().sendKeys("4");
		
	
	}

	@When("select small size")
	public void select_small_size() {
		//how to handle drop down in selenium
		Select select= new Select(pf.getdressSizeDropDown());
		select.getOptions().forEach(option->{
			System.out.println(option.getText());
		});
	    
		Highlighter.getcolor(driver, pf.getdressSizeDropDown(), "blue");
		select.selectByIndex(1);
		//select.selectByVisibleText("M");
		//select.selectByValue("2");
		Highlighter.getcolor(driver, pf.getaddtoCartBtn(), "yellow");
		pf.getaddtoCartBtn().click();
	}

	@When("select checkout")
	public void select_checkout() {
		Wait.getExplicitWaitClicable(driver, pf.getproceedToCheckOut());
		Highlighter.getcolor(driver, pf.getproceedToCheckOut(), "pink");
		pf.getproceedToCheckOut().click();
		Highlighter.getcolor(driver, pf.getsummaryProceedToCheckOut(), "red");
		pf.getsummaryProceedToCheckOut().click();//summary
	    
	}

	@When("select address")
	public void select_address() {
	    
		Actions action = new Actions(driver);//Action class== helping selenium
		action.moveToElement(pf.getaddressProceedToCheckOut()).build().perform();
		Highlighter.getcolor(driver, pf.getaddressProceedToCheckOut(), "red");
		action.click(pf.getaddressProceedToCheckOut()).build().perform();
		
	}

	@When("select shipping details")
	public void select_shipping_details() {
	    
		Highlighter.getcolor(driver, pf.getcheckBox(), "red");
		pf.getcheckBox().click();//check box
		Highlighter.getcolor(driver, pf.getshippingProceedToCheckOut(), "red");
		pf.getshippingProceedToCheckOut().click();//shipping
	}
	@When("select payment options")
	public void select_payment_options() {
	  
		Highlighter.getcolor(driver, pf.getpaymentOptions().get(0), "red");
		pf.getpaymentOptions().get(0).click();//select payment
	}

	@When("confirmed order")
	public void confirmed_order() {
	  
		Highlighter.getcolor(driver, pf.getorderConfirmedBtn().get(0), "red");
		pf.getorderConfirmedBtn().get(0).click();
	}

	@When("check order summary")
	public void check_order_summary() {
	  
		Highlighter.getcolor(driver, pf.getorderSummary());
		System.out.println(pf.getorderSummary().getText());
	}

	@When("Take screen shot")
	public void take_screen_shot() {
		TakeAppScreenShot.captureScreenShot(driver, "My Order Summary");
		driver.quit();
	}

}
