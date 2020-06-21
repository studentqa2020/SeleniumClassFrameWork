package com.sanity;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

import com.config.BaseConfig;
import com.page.object.model.LoginPage;
import com.util.Highlighter;
import com.util.TakeAppScreenShot;
import com.util.Wait;

public class AutomationloginStudent {

	

	  WebDriver driver;
	@Test
	public   void  getLogin() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		driver = new ChromeDriver();//upcasting
		
	
		driver.manage().window().maximize();//maximum or full size
		driver.manage().deleteAllCookies();
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
		login.getEmail().sendKeys(BaseConfig.getconfig("StudentEmail"));
		
		
		
		Highlighter.getcolor(driver, login.getPass(),"black");
		login.getPass().sendKeys(BaseConfig.getconfig("StudentPass"));
		Thread.sleep(3000);

		login.getSubmit().click();
		TakeAppScreenShot.captureScreenShot(driver, "Login success");
		System.out.println(driver.getTitle());
		
		
		
	}

}


