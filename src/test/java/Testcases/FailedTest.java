package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventaryPage;
import Pages.LoginPage;

public class FailedTest extends TestBase{
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
		public void Test1()
		{
		boolean result = invent.swagLogo();
		Assert.assertEquals(result, true);
		}
		@Test (enabled = true)
		public void Test2()
		{
		boolean result = invent.swagLogo();
		Assert.assertEquals(result, true);
		}

		@Test (enabled = true)
		public void Test3()
		{
		boolean result = invent.swagLogo();
		Assert.assertEquals(result, true);
		}
		@Test (enabled = true)
		public void Test4()
		{
		boolean result = invent.swagLogo();
		Assert.assertEquals(result, true);
		}
		@Test (enabled = true)
		public void Test5()
		{
		boolean result = invent.swagLogo();
		Assert.assertEquals(result, true);
		}
		@AfterMethod
		public void closeBrowser()
		{
		driver.close();
		}

}
