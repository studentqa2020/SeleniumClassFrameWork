package com.selenium.situation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.util.Highlighter;
import com.util.TakeAppScreenShot;

public class MouseHober {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize();
		driver.get("https://www.costco.com/");
		WebElement membership = driver.findElement(By.xpath("(//*[text()='Membership'])[3]"));
		Actions a = new Actions(driver);
		a.moveToElement(membership).perform();
		Highlighter.getcolor(driver, membership);//static
		TakeAppScreenShot.captureScreenShot(driver, "Member Element");
		
		

	}

}
