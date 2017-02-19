package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncElement 
{

	
	public static WebElement waitForElement(WebDriver ldriver,WebElement ele)
	{
	
		WebDriverWait wait=new WebDriverWait(ldriver,30);
		
    	WebElement element=wait.until(ExpectedConditions.visibilityOf(ele));
		
    	return element;
		
	}
	
}
