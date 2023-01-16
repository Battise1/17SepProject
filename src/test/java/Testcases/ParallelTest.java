package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	@Test
	public void Test1() 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.close();
	}
	@Test
	public void Test2() 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.close();
	}
	@Test
	public void Test3() 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.close();
	}
	@Test
	public void Test4() 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.close();
	}

}
