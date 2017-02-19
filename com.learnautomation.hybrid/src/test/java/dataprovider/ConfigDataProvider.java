package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{

	Properties pro;
	
	public ConfigDataProvider()
	{
		
		File src=new File(System.getProperty("user.dir")+"/Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			
			pro=new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			
			System.out.println("Unable to load Configuration File");
		}
		
	}
	
	public String getBrowser()
	{
		String browser=pro.getProperty("browser");
		return browser;
	}
	
	public String getURL()
	{
		String url=pro.getProperty("appURL");
		
		return url;
	}
	
	
}
