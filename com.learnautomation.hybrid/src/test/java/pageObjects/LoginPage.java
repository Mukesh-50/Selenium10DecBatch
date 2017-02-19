package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SyncElement;
import utility.Validations;

public class LoginPage 
{

	WebDriver driver;
	
	 public LoginPage(WebDriver ldriver) 
	 {
		
		 this.driver=ldriver;	 
	}
	 
	
	@FindBy(id="txtUsername") WebElement username;
	
	@FindBy(name="txtPassword") WebElement password;
	
	@FindBy(xpath=".//*[@id='btnLogin']") WebElement loginButton;
	
	@FindBy(xpath="//*[text()='Password cannot be empty']") WebElement passwordEmptyError;
	
	
	public boolean loginToApplication(String uname,String pass)
	{
		
		
		SyncElement.waitForElement(driver, username).sendKeys(uname);
		SyncElement.waitForElement(driver, password).sendKeys(pass);
		SyncElement.waitForElement(driver, loginButton).click();
		
		
		
		
		
		//username.sendKeys(uname);
		//password.sendKeys(pass);
		//loginButton.click();
		

	    boolean status=false;
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
	
	    
		try 
		{
			WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='menu_admin_viewAdminModule']")));
			
			status = ele.isDisplayed();
		}
		catch (Exception e) 
		{
			System.out.println("element not found");
		}
		
	    return status;
	}
	
	
	
	public void typeUsername()
	{
		username.sendKeys("admin");
	}
	
	public void typePassword()
	{
      	password.sendKeys("admin");	
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	
	public boolean verifyError()
	{
		
		String actualError=passwordEmptyError.getText();
		
		String expected="Password cannot be empty";
		
	    boolean status=Validations.verifyErrorMessage(actualError, expected);
	    
	    return status;
		
	}
	
	
	
}
