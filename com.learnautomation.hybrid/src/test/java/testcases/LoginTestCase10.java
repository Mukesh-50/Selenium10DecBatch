package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginTestCase10 
{

	
	@Test
	public void login()
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://enterprise-demo.orangehrmlive.com/auth/login");
		
	    LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		
	    login.typeUsername();
	    
	    login.typePassword();
	    
	    login.clickLoginButton();
	    
	    
		
	}
	
	
}
