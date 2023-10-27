package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utils.DriverFactory;

public class BaseClass {

	public WebDriver driver = DriverFactory.getDriver();

	protected LoginPage login = new LoginPage(driver);
	//protected LoginPage login;
	protected DashboardPage dashboard = new DashboardPage(driver);
	//protected DashboardPage dashboard ;
	
	@BeforeClass
	public void setupApplication() {

//			Reporter.log("=====Browser Session Started=====", true);

//	                ChromeDriver driver = new ChromeDriver();
		driver.get("https://bhp-qa.coditas.org/login");

//			Reporter.log("=====Application Started=====", true);
	}

	@AfterClass
	public void closeApplication() {

		driver.quit();
		Reporter.log("=====Browser Session End=====", true);

	}

}
