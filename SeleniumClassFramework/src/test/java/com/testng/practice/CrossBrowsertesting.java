package com.testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;

public class CrossBrowsertesting {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void getbrowser(String browser) throws Throwable{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("ie")){
		//create firefox instance
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
		}
		
		else{
			//If no browser passed throw exception
			throw new Exception("No driver found");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("http://www.amazon.com/");
		System.out.println("Opened Browser::"+browser);
		BaseLogin.getLogin();
	}

	
}
