package Testcases;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{
	 LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		login = new LoginPage();
	}
	
	@Test (enabled = false)   // (enabled = false means these mehtod will not run 
	public void verifyTitleTest()   //(enable = true means method is runing
	{
		String actTile =login.verifyTitle();
		String expTitle = "Swag Labs";
		Assert.assertEquals(actTile, expTitle);
		Reporter.log("Title of LoginPage = " + expTitle);

	}
	@Test (enabled = false)
	public void verifyUrlTest()
	{
		String actTile =login.verifyUrl();
		String expTitle = "https://www.saucedemo.com/";	
		Assert.assertEquals(actTile, expTitle);
		Reporter.log("URL  = " + expTitle);

	}
	
	@Test (enabled = false)
	public void verifylogLogoTest()
	{
		 boolean result = login.verifylogLogo();
		Assert.assertEquals(result, true);
		Reporter.log("LogLogo = " + result);

	}
	
	@Test (enabled = false)
	public void verifyBotLogoTest() 
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result, true);
		Reporter.log("BotLogo = " + result);

	}
	@Test(enabled = false)
	public void userloginTest() throws Exception
	{
		String expRes = "https://www.saucedemo.com/inventory.html";
		String actRes = login.userLogin();
		Assert.assertEquals(expRes, actRes);
		Reporter.log("USER Login = " + actRes);

	}
	@Test //(dependsOnMethods = "verifyUrlTest")
	// thise methode is depend on the verifyUrlTest method
	(enabled = false)
	public void verifyProductLable() throws Exception    //when verifyUrltest method fail then rest of the method will skip
	{
		String actRes = login.verifyProductLable();
		String expRes = "PRODUCTS";
		Assert.assertEquals(actRes, expRes);
		Reporter.log("Product Logo is = " + expRes);

	}@Test
	public void scrollPageTest() throws Exception
	{
		login.userLogin();
		Thread.sleep(5000);
		login.scrollPage();
	}
	@AfterMethod
	public void browseClose()
	{
		driver.close();
	}
	

}
