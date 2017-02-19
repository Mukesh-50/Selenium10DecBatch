package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageObjects.LoginPage;

public class LoginTestCase6 extends BaseClass
{
	ExtentTest logger;

	@BeforeMethod
	public void setup()
	{
		logger = report.startTest("Login to CRM Application");
	}
	
	@AfterMethod
	public void tearDown()
	{
		report.endTest(logger);
	}
	
	
	@Test
	public void login() {


		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		logger.log(LogStatus.INFO, "Application is loaded");

		boolean status=login.loginToApplication("admin1", "admin1");

		if(status)
		{
			logger.log(LogStatus.PASS, "User is able to login");	
		}
		else
		{
			logger.log(LogStatus.FAIL, "User is not able to login");	
		}
		


	}

}
