package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class UtilityMethod extends TestBase{
	
	public static  void selectClass(WebElement ele ,String Option)
	{
		Select a = new Select( ele);
		a.selectByVisibleText(Option);
	}
	public static  void screenShot(String name) throws Exception 
	{
		File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\Admin\\eclipse-workspace\\Project17Sep\\ScreenShot/"+ name +".jpeg");
		FileHandler.copy(sourse, desti);
	}
	
}
