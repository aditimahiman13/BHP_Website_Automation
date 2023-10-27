package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

<<<<<<< HEAD
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//
//public class DatePicker {
//    WebDriver driver;
//
//    public DatePicker(WebDriver driver) {
//
//    }
//    public void(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//        // Identify the date picker element (change the locator as per your HTML)
//        WebElement datePicker = driver.findElement(By.id("datePickerId"));
//
//        // Get the current date
//        Date currentDate = new Date();
//
//        // Format the current date as per the expected date format
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // Modify the format as needed
//        String formattedDate = dateFormat.format(currentDate);
//
//        // Enter the formatted date into the date picker
//        datePicker.sendKeys(formattedDate);
//
//
//    }
//}
=======
public class DatePicker {
    public static void main(String[] args) {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Find the datepicker element using its locator (You need to replace this with the actual locator)
        WebElement datepicker = driver.findElement(By.id("datepicker"));

        // Calculate the current date
        java.util.Date today = new java.util.Date();
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("dd/MM/yyyy");
        String currentDate = dateFormat.format(today);

        // Click on the datepicker to open the date selection dialog
        datepicker.click();

        // Locate and select the date corresponding to the current date
        WebElement currentDateElement = driver.findElement(By.xpath("//td[@data-date='" + currentDate + "']"));
        currentDateElement.click();

        // Close the WebDriver
        driver.quit();
    }
}
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
