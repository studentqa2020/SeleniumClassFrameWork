package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.config.BaseConfig;
import com.page.object.model.LoginPage;
import com.page.object.model.ProductPage;
import com.util.Highlighter;
import com.util.Wait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefSceanrioLogin {
	public static WebDriver driver;
	LoginPage login;
	

	@Given("open a browser")
	public void open_a_browser() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Put URL")
	public void put_URL() throws Throwable {
		driver.manage().window().maximize();// maximum or full size
		driver.get(BaseConfig.getconfig("URL"));

	}

	@When("Click Signin")
	public void click_Signin() {
		login = new LoginPage(driver);
		login.getLogin().click();

	}

	@When("put valid user name")
	public void put_valid_user_name() throws Throwable {

		Wait.getExplicitWaitClicable(driver, login.getEmail());
		Highlighter.getcolor(driver, login.getEmail(), "yellow");
		login.getEmail().sendKeys(BaseConfig.getconfig("email"));

	}

	@When("put valid password")
	public void put_valid_password() throws Throwable {
		Highlighter.getcolor(driver, login.getPass(), "black");
		login.getPass().sendKeys(BaseConfig.getconfig("pass"));
		Thread.sleep(3000);
	}

	@When("click sign in button")
	public void click_sign_in_button() {
		Wait.getExplicitWaitClicable(driver, login.getSubmit());
		login.getSubmit().click();

	}

	@Then("Validate login was success\\(sign out btn)")
	public void validate_login_was_success_sign_out_btn() throws Throwable {
		Thread.sleep(3000);
		if (login.getLogOut().size() > 0) {
			System.out.println("Login passes");
		} else {
			System.out.println("Login failed");
		}
		driver.getTitle();
	}

}