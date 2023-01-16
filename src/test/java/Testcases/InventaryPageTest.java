package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventaryPage;
import Pages.LoginPage;

public class InventaryPageTest extends TestBase{
	
	LoginPage login;
	InventaryPage invent;
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
		intialization();
		 login = new LoginPage();
		 invent = new InventaryPage();
		 login.userLogin();
		
	}
	@Test (priority = 1)
	public void inventaryLogoTest() throws Exception
	{
		Thread.sleep(1000);
		boolean result = invent.inventaryLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Inventary Logo = " + result);

	}
	// we can give (-1) negative priority also 
	@Test (priority = -2, dependsOnMethods = "inventaryLogoTest")
	public void swagLogoTest()
	{
		boolean result = invent.swagLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Swag Logo = " + result);

	}
	@Test (priority = -13)
	public void selectBagesTest() throws Exception
	{
		String result = invent.selectBages();
		Assert.assertEquals(result, "3");
		Reporter.log("No of bage Selected = " + result);

	}
	@Test (priority = 4, groups = {"sanity","Smoke"})
	public void tweeterSymbolTest()
	{
		 boolean result = invent.tweeterSymbol();
		 Assert.assertEquals(result, true);
			Reporter.log("tweeter symbol =" + result);

	}
	@Test (priority = 5)
	public void facebookSymbolTest()
	{
		boolean result = invent.facebookSymbol();
		Assert.assertEquals(result, true);
		Reporter.log("Facebook symbol =" + result);

	}
	@Test (priority = 6, groups = "sanity")
	public void linkedInSymbolTest()
	{
		boolean result = invent.linkedInSymbol();
		Assert.assertEquals(result, true);
		Reporter.log("Linked symbol =" + result);
	}
	
	
	
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowse()
	{
		driver.close();
	}
	
	

	
	
	
		
	
	
	
	
}

