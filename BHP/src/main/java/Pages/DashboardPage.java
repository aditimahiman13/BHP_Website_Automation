package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.DriverFactory;
import Utils.Utils;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DashboardPage extends Utils {

//WebDriver driver=DriverFactory.getDriver();
WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//img[@alt=\"default-profile\"]")
WebElement profileLogo;

@FindBy(xpath="//img[@class='_image_16zlx_88']")
WebElement logoutIcon;

@FindBy(xpath = "//div[@class='_title_1uj6z_16']")
WebElement textNoprojectselected;


public void defaultProjectstate() {
	String actualText="No Project Selected";
	String expectedText=textNoprojectselected.getText();
	Assert.assertEquals(actualText,expectedText);
			
}

public void Logout() {
	clickOn(profileLogo);
	clickOn(logoutIcon);
	
}

}
