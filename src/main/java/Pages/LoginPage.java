package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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


	@FindBy(xpath = "//a[@href='/forgot-password']")
	WebElement forgotPasswordLink;

	@FindBy(xpath="//input[@placeholder='Enter your email']")
	WebElement emailForgot;

	@FindBy(xpath="//span[contains(text(),'Request Reset Link')]")
	WebElement buttonResetLink;

	@FindBy(xpath="//h1[contains(text(),'Password Reset Link Sent!')]")
	WebElement textResetLink;
	@FindBy(xpath = "//p[contains(text(),'Incorrect password. Try again.')]")
	WebElement invalidPassword;

	@FindBy(xpath = "//p[contains(text(),'Incorrect email. Try again.')]")
	WebElement invalidEmail;

	@FindBy(xpath = "//p[contains(text(),'Enter Email ID.')]")
	WebElement enterEmailMessage;

	@FindBy(xpath = "//p[contains(text(),'Enter password.')]")
	WebElement enterPasswordMessage;




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
		//Thread.sleep(5000);
//		String actualURL="https://bhp-qa.coditas.org/login";
//		String expectedURL=driver.getCurrentUrl();
//		Assert.assertEquals(actualURL, expectedURL);

	}

	public void verifyValidEmailInvalidPassword(){
		String actualpassword="Incorrect password. Try again.";
		String expectedpassword=invalidPassword.getText();
		Assert.assertEquals(actualpassword,expectedpassword);
	}

	public void verifyInvalidEmailValidPassword(){
		String actualemail="Incorrect email. Try again.";
		String expectedemail=invalidEmail.getText();
		Assert.assertEquals(actualemail,expectedemail);
	}

	public void verifyBlankEmailValidPassword(){
		String actualemail="Enter Email ID.";
		String expectedemail=enterEmailMessage.getText();
		Assert.assertEquals(actualemail,expectedemail);
	}

	public void verifyValidEmailBlankPassword(){
		String actualemail="Enter password.";
		String expectedemail=enterPasswordMessage.getText();
		Assert.assertEquals(actualemail,expectedemail);
	}

	public void verifyBlankEmailBlankPassword(){
		String actualemail="Enter Email ID.";
		String expectedemail=enterEmailMessage.getText();
		Assert.assertEquals(actualemail,expectedemail);
		String actualpassword="Enter password.";
		String expectedpassword=enterPasswordMessage.getText();
		Assert.assertEquals(actualemail,expectedemail);

	}





	public void forgotPassword() throws InterruptedException {

//		forgotPasswordLink.click();
//		emailForgot.sendKeys("aditi.mahiman+PE@coditas.com");
//		buttonResetLink.click();
//
		clickOn(forgotPasswordLink);
		enterText(emailForgot,"aditi.mahiman+PE@coditas.com");
		clickOn(buttonResetLink);



	}

	public void verifyReset(){
		String actualText="Password Reset Link Sent!";
		String expectedText=textResetLink.getText();
		Assert.assertEquals(actualText, expectedText);
	}

}
