package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginTestCase4 extends BaseClass {

	@Test
	public void login() 
	{

		
		
		
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication("admin", "admin");

	}

}
