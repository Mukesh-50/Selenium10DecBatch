package utility;

import org.testng.Assert;

public class Validations 
{

	
	public static boolean verifyErrorMessage(String actual,String expected)
	{
	
		boolean status=false;
		
		try 
		{
			Assert.assertEquals(actual, expected);
			status=true;
		} 
		catch (Error e) 
		{
			
		}
		
		return status;
		
	}
	
	
}
