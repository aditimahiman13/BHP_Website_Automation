package Utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	
	public WebDriverWait waitFor() throws InterruptedException {
		WebDriverWait wt = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
		Thread.sleep(2000);
		return wt;
	}
	
	public void enterText(WebElement ele, String str) {
		try {
			waitFor().until(ExpectedConditions.visibilityOf(ele));
			Thread.sleep(2000);
			ele.sendKeys(str);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void clickOn(WebElement ele) {
		try {
			waitFor().until(ExpectedConditions.visibilityOf(ele));
			Thread.sleep(2000);
			ele.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		public void verifyDash(String url) {
//			driver.g
//		}

	}

}
