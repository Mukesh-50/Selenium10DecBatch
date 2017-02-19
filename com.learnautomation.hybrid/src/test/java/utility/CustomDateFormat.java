package utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateFormat
{

	
	public static String getCurrentTime()
	{
		
	     DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss");
		
		Date date=new Date();
		
		return dateFormat.format(date);

	}
	
	
}
