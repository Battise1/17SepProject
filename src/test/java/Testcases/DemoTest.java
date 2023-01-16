package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DemoTest extends TestBase{
	
	LoginPage login;// = new LoginPage();
	@BeforeMethod
	public void setup() throws Exception
	{
	intialization();
	login = new LoginPage();
	}
	@Test (invocationCount = 1, enabled = false)
	public void verifyTitleTest() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	Reporter.log("Title of web application :- " + actTitle);
	}
	@Test (timeOut = 2000)
	public void verifyTitleTest1() throws Exception
	{
	String expTitle = "1Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle,"Test case fail zali ka");
	System.out.println("This is test case of title");
	Reporter.log("Title of web application :- " + actTitle);
	Assert.assertTrue(true);
	}
	@AfterMethod
	public void closeBrowser()
	{
	driver.close();
	}

}
