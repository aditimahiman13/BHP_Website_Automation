package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.DriverFactory;
import Utils.Utils;

public class LoginPage extends Utils {

//	WebDriver driver = DriverFactory.getDriver();
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[contains(.,'Log In')]")
	WebElement loginButton;
	
	@FindBy(xpath="//img[@alt='logo']")
	WebElement logoText;

	@FindBy(xpath="//span[contains(text(),'Forgot password?')]")
	WebElement forgotPasswordLink;

	@FindBy(xpath="//input[@placeholder='Enter your email']")
	WebElement emailForgot;

	@FindBy(xpath="//span[contains(text(),'Request Reset Link')]")
	WebElement buttonResetLink;

	@FindBy(xpath="//h1[contains(text(),'Password Reset Link Sent!')]")
	WebElement textResetLink;


	
	
	public void goToLoginPage() {
		driver.get("https://bhp-qa.coditas.org/login");
	}

	
	public void Login(String strEmail,String strPassword) {
		enterText(email, strEmail);
		enterText(password, strPassword);
		clickOn(loginButton);
		;
		
//		Email.sendKeys(strEmail);
//		Password.sendKeys(strPassword);
//		LoginButton.click();
	}
	public void verifyDash() throws InterruptedException {
		Thread.sleep(10000);
		String actualURL="https://bhp-qa.coditas.org/dashboard";
		String expectedURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);		
	}
	
	public void verifyLoginDash() throws InterruptedException {
		Thread.sleep(10000);
		String actualURL="https://bhp-qa.coditas.org/login";
		String expectedURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);		
	}



	

	
	
	

}
