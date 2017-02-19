package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.SyncElement;

public class Logout
{
	WebDriver driver;
	
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(how=How.ID, using="welcome")WebElement welcomeLink;
	
	@FindBy(how=How.XPATH, using="//a[text()='Logout']") WebElement logoutLink;
	
	
	public void logoutApplication()
	{
		
		SyncElement.waitForElement(driver, welcomeLink).click();
		
		SyncElement.waitForElement(driver, logoutLink).click();
		
	}
	
	
}
