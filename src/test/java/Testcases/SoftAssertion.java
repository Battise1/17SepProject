package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.InventaryPage;
import Pages.LoginPage;

public class SoftAssertion extends TestBase{

	LoginPage login;
	InventaryPage invent;
	@BeforeMethod
	public void setup() throws Exception
	{
	intialization();
	login = new LoginPage();
	invent = new InventaryPage();
	login.userLogin();
	}
	@Test (enabled = true)
	public void swagLogoTest()
	{
	System.out.println("Execution started");
	SoftAssert soft = new SoftAssert();
	boolean result = invent.swagLogo();
	soft.assertEquals(result, false);
	// Assert.assertEquals(result, false);
	System.out.println("Execution ended");
	soft.assertAll();
	}
	@AfterMethod
	public void closeBrowser()
	{
	driver.close();
	}
}
