package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Pages.DashboardPage;
import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


	@Before
	public void setup() {
		DriverFactory.driver= DriverFactory.initializeDriver();
	}

	@After
	public void tearDown() {
		//DashboardPage db=new DashboardPage();
		//db.Logout();
		//DriverFactory.driver = null;
		DriverFactory.driver.quit();
	}
}
