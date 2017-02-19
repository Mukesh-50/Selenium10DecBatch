package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static String captureScreenshots(WebDriver ldriver) {

		File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "/Screenshots/CRM" + CustomDateFormat.getCurrentTime() + ".png";

		File destination = new File(path);

		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Not able to capture screenshot");
		}

		return path;

	}
	

}
