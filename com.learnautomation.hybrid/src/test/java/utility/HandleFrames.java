package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleFrames 
{

	public static void switchFrameUsingID(WebDriver driver, int id) {

		driver.switchTo().frame(id);

	}

	public static void switchFrameUsingName(WebDriver driver, String Fname) {

		driver.switchTo().frame(Fname);

	}

	public static void switchFrameUsingElement(WebDriver driver, WebElement felement) {

		driver.switchTo().frame(felement);

	}

	public static void switchToParentFrame(WebDriver driver) {

		driver.switchTo().defaultContent();

	}

}
