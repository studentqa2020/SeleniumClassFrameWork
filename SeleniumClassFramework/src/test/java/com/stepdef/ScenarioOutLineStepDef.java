package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.page.object.model.LoginPage;
import com.util.Highlighter;
import com.util.Wait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutLineStepDef {

	 WebDriver driver;
	 LoginPage login;
	
	@Given("open a browser and send url")
	public void open_a_browser_and_send_url() {		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();   
	}
	@Given("Put URL {string} from below example table")
	public void put_URL_from_below_example_table(String url) {   
		driver.manage().window().maximize();//maximum or full size
		driver.get(url);
	}
	@When("Click Signin button")
	public void click_Signin_button() {
		login = new LoginPage(driver);
		login.getLogin().click();
	}
	@When("put valid user name {string} from below table")
	public void put_valid_user_name_from_below_table(String user) {
		Wait.getExplicitWaitClicable(driver, login.getEmail());
		Highlighter.getcolor(driver, login.getEmail(), "yellow");
		login.getEmail().sendKeys(user);
	}
	@When("put valid password {string} from below table")
	public void put_valid_password_from_below_table(String pass) throws InterruptedException {
		Highlighter.getcolor(driver, login.getPass(),"black");
		login.getPass().sendKeys(pass);
		Thread.sleep(3000);   
	}
	@When("click sign in")
	public void click_sign_in() {
		login.getSubmit().click();  
	}
	@Then("Validate login pass or fail")
	public void validate_login_pass_or_fail() throws Throwable {
		Thread.sleep(3000);	
		if (login.getLogOut().size()>0) {
			System.out.println("Login passes");
		}else {
			System.out.println("Login failed");
		}
		driver.quit();
	}
}
