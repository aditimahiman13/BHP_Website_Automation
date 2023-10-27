package Pages;

//import jdk.internal.org.jline.terminal.TerminalBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.DriverFactory;
import Utils.Utils;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.awt.*;
import java.awt.event.KeyEvent;

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

@FindBy(xpath = "(//img[@alt='indicator-arrow'])[1]")
WebElement clickDropdown;


@FindBy(xpath="//input[@id=\"react-select-3-input\"]")
WebElement projectName;



@FindBy(xpath = "(//div[@class=' css-1xjjmxq'])[1]")
WebElement fieldDropdown;

@FindBy(xpath = "//span[contains(text(),'Add Row')]")
WebElement buttonAddRow;
	@FindAll({@FindBy(xpath = "//div[contains(@class,'row--rowheight')]")})
	WebElement row;

//@FindAll(By.(xpath = "//div[contains(@class,'row--rowheight')]")
//WebElement row;
@FindBy(xpath = "//img[@alt='bin']")
WebElement iconDelete;

@FindBy(xpath = "//span[contains(text(),'Delete')]")
WebElement buttonDelete;
@FindBy(xpath = "//span[contains(text(),'Cancel')]")
WebElement buttonCancel;
@FindBy(xpath = "//div[contains(text(),'Row deleted!')]")
WebElement messageDelete;

@FindBy(xpath = "//div[@data-props-id='poRaisedOn']")
WebElement allRows;
@FindBy(xpath = "//div[@data-name=\"view\"]")
WebElement table;
<<<<<<< HEAD

@FindBy(xpath = "//div[@class=\" css-1dimb5e-singleValue\"]")
WebElement dropdown;

=======
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
@FindBy(xpath = "//div[contains(@class,'row--rowheight')][3]//div[@data-props-id=\"vendorSupplyingPlant\"]")
WebElement rowVendor;
@FindBy(xpath = "(//h6[contains(@class,'_vendorName_')])[3]")
WebElement vendorName;
@FindBy(xpath = "//h6[text()='-']")
WebElement vendorName1;

@FindBy(xpath = "(//div[@data-props-id='text'])[3]")
WebElement sendText;
@FindBy(xpath="//div[contains(@class,'row--rowheight')][3]//div[@data-props-id=\"text\"]")
WebElement rowText;//

//@FindBy(xpath = "(//div[contains(@class,'InovuaReactDataGrid__cell__content')][normalize-space()='0'])[6]")
//WebElement rowBudget;
	@FindBy(xpath = "//div[contains(@class,'row--rowheight')][3]//div[@data-props-id=\"totalPlannedBudget\"]")
	WebElement rowBudget;

@FindBy(xpath = "//div[contains(@class,'row--rowheight')][3]//div[@data-props-id=\"9_2023\"]")
WebElement monthSept;
@FindBy(xpath = "//div[contains(@class,'row--rowheight')][3]//div[@data-props-id=\"10_2023\"]")
WebElement monthOct;
@FindBy(xpath = "//div[contains(@class,'row--rowheight')][3]//div[@data-props-id=\"11_2023\"]")
WebElement monthNov;

@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/input[1]")
WebElement textSearch;

@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]")
WebElement vendorSearch;

@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]")
WebElement filterIconText;
@FindBy(xpath = "//td[contains(text(),'Contains')]")
WebElement filterTextContains;

@FindBy(xpath = "//td[contains(text(),'Does not contain')]")
WebElement filterTextDoesNotContain;

@FindBy(xpath = "//td[contains(text(),'Equals')]")
WebElement filterTextEquals;

@FindBy(xpath = "//td[contains(text(),'Does not equal')]")
WebElement filterTextDoesNotEqual;

@FindBy(xpath = "//td[contains(text(),'Empty')]")
WebElement filterTextEmpty;

@FindBy(xpath = "//td[contains(text(),'Not empty')]")
WebElement filterTextNotEmpty;

@FindBy(xpath = "//td[contains(text(),'Starts with')]")
WebElement filterTextStartsWith;

@FindBy(xpath = "//td[contains(text(),'Ends with')]")
WebElement filterTextEndsWith;

@FindBy(xpath = "//td[contains(text(),'Enable')]")
WebElement filterTextEnable;

@FindBy(xpath = "//td[contains(text(),'Disable')]")
WebElement filterTextDisable;

@FindBy(xpath = "//tbody/tr[13]/td[1]")
WebElement filterTextClear;

@FindBy(xpath = "//td[contains(text(),'Clear all')]")
WebElement filterTextClearAll;

<<<<<<< HEAD
@FindBy(xpath = "//div[@class='_customEditorWrapper_lubsw_1']/input")
WebElement input;

@FindBy(xpath = "//div[contains(@class,'InovuaReactDataGrid__footer-row--last-in-section')]//div[contains(@class,'InovuaReactDataGrid__footer-row-cell--last ')]")
WebElement CumTotal;

=======
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55









public void defaultProjectstate() {

	String actualText="No Project Selected";
	String expectedText=textNoprojectselected.getText();
	System.out.print(expectedText);
	Assert.assertEquals(actualText,expectedText);
			
}

public void selectProject() throws InterruptedException {
//	clickDropdown.click();
//	Thread.sleep(2000);
//	String projectName="WBS Multiple Test - IPS - FX00.C.21111.1223";
//	//enterText(fieldDropdown,projectName);
//	Robot rob = null;
//	try {
//		rob = new Robot();
//	} catch (AWTException e) {
//		throw new RuntimeException(e);
//	}
////	rob.keyPress(KeyEvent.VK_1);
//	rob.keyPress(KeyEvent.VK_ENTER);
////	fieldDropdown.sendKeys(Keys.ENTER);
//	Thread.sleep(5000);

clickOn(clickDropdown);
enterText(projectName,"WBS Multiple Test - IPS - FX00.C.21111.1223");
projectName.sendKeys(Keys.ENTER);

}

public void  verifySelectedProject(){
	String actualText="WBS Multiple Test - IPS - FX00.C.21111.1223";
	String expectedText=dropdown.getText();
	System.out.print(expectedText);
	Assert.assertEquals(actualText,expectedText);

}

public void AddRow() throws InterruptedException {

	buttonAddRow.click();
	Thread.sleep(2000);


}

public void verifyAddRowCount(){
	java.util.List<WebElement> row = driver.findElements(By.xpath("//div[contains(@class,'row--rowheight')]"));
	int rowCount = row.size();
	System.out.println("Number of rows in the table: " + rowCount);
	if (rowCount > 2) {
		System.out.println("Row added Successfully");
	} else {
		System.out.println("Row not added. " + rowCount + " rows.");
	}
}

	public void addVendorDetails() throws InterruptedException {
		WebElement elementToDoubleClick = rowVendor;
		Actions actions = new Actions(driver);

		// Perform a double click on the element
		actions.doubleClick(elementToDoubleClick).perform();
		//actions.click(rowVendor).sendKeys(rowVendor, "\b").perform();
		//Thread.sleep(2000);
		//WebElement input = driver.findElement(By.xpath("//div[contains(@class,'row--rowheight')][3]//h6[@class='_vendorName_2l5b7_1']"));
		//rowVendor.sendKeys("Samsung");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value = arguments[1];", rowVendor, "Samsung");
		actions.sendKeys(rowVendor, "Samsung").keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
//		Thread.sleep(2000);
//		vendorName1.sendKeys(Keys.ENTER);
//		vendorName1.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
	}

<<<<<<< HEAD
=======
	public void addVendorDetails() throws InterruptedException {
		WebElement elementToDoubleClick = rowVendor;
		Actions actions = new Actions(driver);

		// Perform a double click on the element
		actions.doubleClick(elementToDoubleClick).perform();
		//actions.click(rowVendor).sendKeys(rowVendor, "\b").perform();
		//Thread.sleep(2000);
		//WebElement input = driver.findElement(By.xpath("//div[contains(@class,'row--rowheight')][3]//h6[@class='_vendorName_2l5b7_1']"));
		//rowVendor.sendKeys("Samsung");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value = arguments[1];", rowVendor, "Samsung");
		actions.sendKeys(rowVendor, "Samsung").keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
//		Thread.sleep(2000);
//		vendorName1.sendKeys(Keys.ENTER);
//		vendorName1.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
	}

>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
	public void addText() throws InterruptedException {
		WebElement elementToDoubleClick = rowText;
		Actions actions = new Actions(driver);
		// Perform a double click on the element
		actions.doubleClick(elementToDoubleClick).perform();
<<<<<<< HEAD
		actions.click(rowText).sendKeys(rowText, "\b").perform();
		Thread.sleep(2000);
		//WebElement input =driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
		input.sendKeys("Sample text");
		Thread.sleep(5000);

	}

	public void verifyTextIsEntered() throws InterruptedException {
		String actualText="Sample text";
		String expectedText=input.getAttribute("Sample text");

		System.out.print(expectedText);
		Thread.sleep(5000);

		Assert.assertEquals(actualText,expectedText);
=======
		actions.click(rowText) // Optionally, you can click the element first
				.sendKeys(rowText, "\b") // Send a backspace key to clear the text
				.perform();
		Thread.sleep(2000);
		WebElement input =driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
		input.sendKeys("Sample text");
		Thread.sleep(8000);
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
	}

	public void addBudget() throws InterruptedException {


		WebElement elementToDoubleClick = rowBudget;
		Actions actions = new Actions(driver);
		actions.doubleClick(elementToDoubleClick).perform();
		actions.click(rowBudget).sendKeys(rowBudget, "\b").perform();
		Thread.sleep(2000);
		//WebElement input = driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
		input.sendKeys("200");
		Thread.sleep(8000);

//
//
//		//		WebElement input = driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
//		input.sendKeys("888");
//		textBox.sendKeys("66666");
//		enterText(textBox,"5");

		//rowBudget.clear();
		//Thread.sleep(3000);
//	enterText(rowBudget,budget);

}

	public void monthSeptember() throws InterruptedException {
		WebElement elementToDoubleClick = monthSept;
<<<<<<< HEAD
		Actions actions = new Actions(driver);
		actions.doubleClick(elementToDoubleClick).perform();
		actions.click(monthSept).sendKeys(monthSept, "\b").perform();
		Thread.sleep(2000);
		//WebElement input = driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
=======

		Actions actions = new Actions(driver);
		// Perform a double click on the element
		actions.doubleClick(elementToDoubleClick).perform();
		actions.click(monthSept) // Optionally, you can click the element first
				.sendKeys(monthSept, "\b") // Send a backspace key to clear the text
				.perform();
		Thread.sleep(2000);
		WebElement input = driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
		input.sendKeys("10");
		Thread.sleep(8000);


	}
	public void monthOctober() throws InterruptedException {
		WebElement elementToDoubleClick = monthOct;

		Actions actions = new Actions(driver);
<<<<<<< HEAD
		actions.doubleClick(elementToDoubleClick).perform();
		actions.click(monthOct).sendKeys(monthOct, "\b").perform();
		Thread.sleep(2000);
		//WebElement input = driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
		input.sendKeys("20");
=======
		// Perform a double click on the element
		actions.doubleClick(elementToDoubleClick).perform();
		actions.click(monthOct) // Optionally, you can click the element first
				.sendKeys(monthOct, "\b") // Send a backspace key to clear the text
				.perform();
		Thread.sleep(2000);
		WebElement input = driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
		input.sendKeys("200");
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
		Thread.sleep(8000);


	}
	public void monthNovember() throws InterruptedException {
		WebElement elementToDoubleClick = monthNov;
<<<<<<< HEAD
		Actions actions = new Actions(driver);
		actions.doubleClick(elementToDoubleClick).perform();
		actions.click(monthNov).sendKeys(monthNov, "\b").perform();
		Thread.sleep(2000);
		//WebElement input = driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
		input.sendKeys("30");
		Thread.sleep(8000);

=======

		Actions actions = new Actions(driver);
		// Perform a double click on the element
		actions.doubleClick(elementToDoubleClick).perform();
		actions.click(monthNov) // Optionally, you can click the element first
				.sendKeys(monthNov, "\b") // Send a backspace key to clear the text
				.perform();
		Thread.sleep(2000);
		WebElement input = driver.findElement(By.xpath("//div[@class='_customEditorWrapper_lubsw_1']/input"));
		input.sendKeys("200");
		Thread.sleep(8000);

>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55

	}

	public void enterSearchText(){
	clickOn(textSearch);
	enterText(textSearch,"text");
	}
<<<<<<< HEAD

	public void verifySearchText(){
//		java.util.List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class,'row--rowheight')]"));
//		String filterResult=result.getT
//		int rowCount = row.size();
//		System.out.println("Number of rows in the table: " + rowCount);
//		if (rowCount <=2) {
//			System.out.println("Row  deleted");
//		} else {
//			System.out.println("Row not deleted. " );

	}

	public void selectContainsTextFilter() {
=======
	public void selectContainsTextFilter() throws InterruptedException {
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
	clickOn(filterIconText);
	//Thread.sleep(2000);
	clickOn(filterTextContains);
	}
	public void selectDoesNotContainTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextDoesNotContain);
	}
	public void selectEqualsTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextEquals);
	}

	public void selectDoesNotEqualTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextDoesNotEqual);
	}

	public void selectEmptyTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextEmpty);
	}

	public void selectNotEmptyTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextNotEmpty);
	}

	public void selectStartsWithTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextStartsWith);
	}

	public void selectEndsWithTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextEndsWith);
	}

	public void selectDisableTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextDisable);
	}


	public void selectEnableTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextEnable);
	}

	public void selectClearTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextClear);
	}

	public void selectClearAllTextFilter() throws InterruptedException {
		clickOn(filterIconText);
		//Thread.sleep(2000);
		clickOn(filterTextClearAll);
	}


<<<<<<< HEAD
=======




>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
	public void enterSearchVendorDetails() throws InterruptedException{
		clickOn(vendorSearch);
		enterText(vendorSearch,"Bosch");
	}

public void deleteRow() throws InterruptedException {
	iconDelete.click();
	Thread.sleep(2000);
	buttonDelete.click();
	Thread.sleep(2000);
}
public void verifyDeleteMessage(){
	String actualText="Row deleted!";
	String expectedText=messageDelete.getText();
	System.out.print(expectedText);
	Assert.assertEquals(actualText,expectedText);
}

public void deleteRowCancel(){
	clickOn(iconDelete);
	clickOn(buttonCancel);

}

public void verifyDeleteRowCancel(){
	java.util.List<WebElement> row = driver.findElements(By.xpath("//div[contains(@class,'row--rowheight')]"));
	int rowCount = row.size();
	System.out.println("Number of rows in the table: " + rowCount);
	if (rowCount <=2) {
		System.out.println("Row  deleted");
	} else {
		System.out.println("Row not deleted. " );
	}

}
public void Logout() {
	clickOn(profileLogo);
	clickOn(logoutIcon);
}

public void m1(){
	System.out.println("HEllo World");
}

}
