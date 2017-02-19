package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageObjects.LoginPage;
import utility.Helper;

public class TestCase2 extends BaseClass {
	ExtentTest logger;

	@BeforeMethod
	public void setup() {
		logger = report.startTest("Login to CRM Application");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			logger.log(LogStatus.FAIL, logger.addScreenCapture(Helper.captureScreenshots(driver)));

		}

		report.endTest(logger);
	}

	@Test
	public void login() {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		logger.log(LogStatus.INFO, "Application is loaded");

		login.typeUsername();
		
		login.clickLoginButton();
		
		boolean status=login.verifyError();
		
		if (status) 
		{
			logger.log(LogStatus.PASS, "User is not able to login");

			logger.log(LogStatus.PASS, logger.addScreenCapture(Helper.captureScreenshots(driver)));
			
		} else
		{
			logger.log(LogStatus.FAIL, "Exception occured please check");

			Assert.assertTrue(status);
		}
		
		
		

	}

}
