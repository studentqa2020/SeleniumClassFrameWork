package com.selenium.situation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class AlertPoPupInSelenium {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.manage().window().maximize(); //

		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		
		//*[@type='text']
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("123456");
		
		//*[@name='submit']
		
		//selenium click
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		

		//>>>>>>>>>>>got alert pop up or pop up window === Alert interface
		
		//Alert obj = new Alert(); XXXXXXXXXXXXXXXXX
		
		Alert obj = driver.switchTo().alert();// move from main window to alert window
		 System.out.println( "Before clcik ="+obj.getText());
		obj.accept();// click ok btn
		// obj.dismiss();// click cancel btn
		 System.out.println("After click = "+ obj.getText());
		
		driver.quit();
		 


	}

}
