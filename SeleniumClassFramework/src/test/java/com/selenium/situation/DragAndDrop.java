package com.selenium.situation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize(); //
		 
		// Open webpage
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		//*[text()='Drag me to my target']== drag
		//*[@id='droppable'] === drop
	
		WebElement drag=driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
		WebElement drop =driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).perform();
		
		
		 
		// this will drag element to destination
		//act.dragAndDrop(drag, drop).build().perform();
		// driver.quit();;

	}

}
