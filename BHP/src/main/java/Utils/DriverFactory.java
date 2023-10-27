package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverFactory {

	public static WebDriver driver;
	
		private static ThreadLocal<WebDriver> tl_driver=new ThreadLocal<WebDriver>();

		public static WebDriver getDriver(){
//		    if(tl_driver.get()==null){
//		        tl_driver.set(initializeDriver());
//		    }
//		    return tl_driver.get();
			
			return driver;
		}

		/**
		 * Method used to launch browser specified in {$env}.properties file
		 * and to launch Url which is also specified in {$env}.properties file
		 * @return instance of browser
		 */
		public static  WebDriver initializeDriver() {
			
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    String browserName = "chrome";
			return driver;

		}
		public static void cleanup(){
		    tl_driver.get().quit();
		    tl_driver.remove();
		}

		public static WebDriver getDriver1() {
			// TODO Auto-generated method stub
			return null;
		}

		



}
