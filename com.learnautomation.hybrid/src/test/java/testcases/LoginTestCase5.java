package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageObjects.LoginPage;

public class LoginTestCase5 extends BaseClass {

	@Test
	public void login() 
	{

		ExtentReports report=new ExtentReports(System.getProperty("user.dir")+"/Reports/Report2.html");
		
		ExtentTest logger=report.startTest("Login to CRM Application");
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		logger.log(LogStatus.INFO,"Application is loaded");
		
		login.loginToApplication("admin", "admin");
		
		logger.log(LogStatus.FAIL,"User is able to login");
		
		report.endTest(logger);
		
		report.flush();

	}

}
