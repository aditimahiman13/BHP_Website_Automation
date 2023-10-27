import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestReport {

	static ExtentTest logger;
	static ExtentReports report;
@BeforeClass	
public void startTest() {
	//report=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReportsResult.html",true);
	
}

	
}
