package com.selenium.situation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickinAutomation {

	public static void main(String[] args) {
		// selenium click
		WebDriver driver = new ChromeDriver();

		driver.findElement(By.xpath("//*[@name='submit']")).click();
		driver.findElement(By.xpath("//*[@name='submit']")).submit();

		// Actions class
		Actions ac = new Actions(driver);
		ac.click().perform();// Lt click
		ac.contextClick().perform();// Rt click
		ac.clickAndHold();
		ac.doubleClick();

		// JsE interface ====>Best
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@name='submit']")));

	}

}
