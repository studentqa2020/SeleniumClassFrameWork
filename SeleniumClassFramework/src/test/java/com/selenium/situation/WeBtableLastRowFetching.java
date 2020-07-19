package com.selenium.situation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeBtableLastRowFetching {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
		
		//Header print 
		WebElement allHeadersOfTable =driver.findElement(By.xpath("//table//thead"));
		 // System.out.println("Header of Table::"+allHeadersOfTable.getText());
		
		
		
		WebElement table= driver.findElement(By.xpath("(//table)[1]"));
		
		//System.out.println(table.getText());
		
		
		List<WebElement> tableRows= driver.findElements(By.xpath("(//table)[1]//tbody//tr"));
		
		System.out.println("Row number = "+tableRows.size());//1998
		
		//How to find the last row()
		
		WebElement lastRows= driver.findElement(By.xpath("(//table)[1]//tbody//tr["+tableRows.size()+"]"));
		
		System.out.println("Last row value ="+lastRows.getText());
		
		
		List<WebElement> tableColumn= driver.findElements(By.xpath("(//table)[1]//tbody//tr//td"));
		
		System.out.println("Column number = "+tableColumn.size());
		
		
	}
}
