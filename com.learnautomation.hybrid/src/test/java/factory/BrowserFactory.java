package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory 
{

	
	static WebDriver driver=null;
	
	public static WebDriver startBrowser(String browsername,String appURL)
	{
	
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			
			DesiredCapabilities cap=new DesiredCapabilities();
			
			cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/Drivers/IEDriverServer32.exe");
			driver=new InternetExplorerDriver(cap);
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	
}
