package com.testng.advance.annotation;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.config.BaseConfig;
import com.generic.code.BaseLogin;
import com.page.object.model.LoginPage;
import com.util.Highlighter;
import com.util.TakeAppScreenShot;
import com.util.Wait;

public class ParameterTesting {

WebDriver driver;
	@Test
	@Parameters("browser")// must need testng.xml to run 
	public void getsalary(String a) throws Throwable {
		
		//Browser selection
		if(a.contains("chrome")) {
			System.out.println("This is chrome browser");
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();//upcasting
			
			
		}else if(a.contains("ie")) {
			
			System.out.println("This is ie browser");
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();//upcasting
		}
		
		//login 
		driver.manage().window().maximize();//maximum or full size
		driver.get(BaseConfig.getconfig("URL"));
		
		//LoginPage login =new LoginPage(driver);
		LoginPage login = new LoginPage(driver);
		System.out.println(driver.getTitle());
		//new Highlighter().getcolor(driver, login.getLogin());
		login.getLogin().click();// click
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		Wait.getExplicitWaitClicable(driver, login.getEmail());
		
		Highlighter.getcolor(driver, login.getEmail(), "yellow");
		login.getEmail().sendKeys(BaseConfig.getconfig("email"));
		
		
		
		Highlighter.getcolor(driver, login.getPass(),"black");
		login.getPass().sendKeys(BaseConfig.getconfig("pass"));
		Thread.sleep(3000);

		login.getSubmit().click();
		TakeAppScreenShot.captureScreenShot(driver, "Login success");
		System.out.println(driver.getTitle());
		
	
		
	}
	

}

