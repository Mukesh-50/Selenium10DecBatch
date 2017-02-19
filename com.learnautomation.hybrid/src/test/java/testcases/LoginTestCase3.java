package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import pageObjects.LoginPage;

public class LoginTestCase3 {

	@Test
	public void login() {

		WebDriver driver = BrowserFactory.startBrowser("chrome",
				"https://enterprise-demo.orangehrmlive.com/auth/login");

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication("admin", "admin");

	}

}
