package com.selenium.situation;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

import com.util.Highlighter;

public class DropDownMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize(); //
		// Launch the URL
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		
		//select china
		
		WebElement countryInputBox= driver.findElement(By.xpath("//*[@name='country']"));
		
		Select sel = new Select(countryInputBox);
		Highlighter.getcolor(driver, countryInputBox);
		sel.selectByIndex(47);//china
		Thread.sleep(3000);
		sel.selectByVisibleText("BRAZIL");
		Thread.sleep(3000);
		sel.selectByValue("14");//BAN
		
		sel.getOptions();
		
//		
//		WebElement countryInputBox= driver.findElement(By.xpath("//*[@name='country']"));
//		Highlighter.getcolor(driver, countryInputBox);
//		
//		countryInputBox.click();//open input box
//		
//		//*[@name='country']/option==264 (china =48) 
//		
//		List<WebElement> country= driver.findElements(By.xpath("//*[@name='country']/option")); //==264
//		
//		System.out.println(country.size());
//		
//		country.get(47).click();//china
//		
//		countryInputBox.click();// close input box
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
		 * 
		 * Select select = new Select(driver.findElement(By.name("country")));
		 * select.selectByVisibleText("BANGLADESH");
		 * 
		 * // Using sleep command so that changes can be noticed Thread.sleep(2000);
		 * 
		 * // Step 5: Select option 'Africa' now (Use selectByVisibleText)
		 * select.selectByIndex(2);
		 * 
		 * Thread.sleep(2000); select.selectByValue("234");
		 * 
		 * Thread.sleep(2000); // Step 6: Print all the options for the selected drop
		 * down and select one // option of your choice // Get the size of the Select
		 * element List<WebElement> dropDownOptions = select.getOptions();
		 * 
		 * int OptionsCount = dropDownOptions.size();
		 * 
		 * // Setting up the loop to print all the options for (int i = 0; i <
		 * OptionsCount; i++) { // Storing the value of the option String value =
		 * select.getOptions().get(i).getText(); // Printing the stored value
		 * System.out.println(value); // Putting a check on each option that if any of
		 * the option is equal to 'Africa" // then select it
		 * 
		 * if (value.equals("UNITED STATES")) { select.selectByIndex(i); break; }
		 * 
		 * } // Kill the browser driver.quit();
		 */
	}

}
