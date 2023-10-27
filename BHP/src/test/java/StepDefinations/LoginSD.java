package StepDefinations;

import org.openqa.selenium.WebDriver;

import Pages.BaseClass;
import Pages.DashboardPage;
import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD extends BaseClass {

//	public LoginPage loginPage;
	
//	public LoginSD(LoginPage loginPage)
//	{
//		this.loginPage=loginPage;
//	}

@Given("I am on the Login screen")
public void i_am_on_the_login_screen() {
//	WebDriver driver = DriverFactory.getDriver();
	login = new LoginPage(driver);
	dashboard = new DashboardPage(driver);
	
	login.goToLoginPage();
}

@When("I enter email address")
public void i_enter_email_address() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I login with {string} and {string}")
public void i_login_with_email_and_password(String email, String pass) {
	login.Login(email, pass);
}

@When("I enter the password")
public void i_enter_the_password() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I click on the Login button")
public void i_click_on_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I verify I am on the PE dashboard")
public void i_verify_i_am_on_the_pe_dashboard() throws InterruptedException {
    login.verifyDash();
    
}

@Then("I verify I am on the login dashboard")
public void i_verify_i_am_on_the_login_dashboard() throws InterruptedException {
    login.verifyLoginDash();
    
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
