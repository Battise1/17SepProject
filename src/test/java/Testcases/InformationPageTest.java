package Testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InformationPage;
import Pages.InventaryPage;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class InformationPageTest extends TestBase {
	
	InformationPage info;
	LoginPage login;
	InventaryPage invent;
	CartPage cart;
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		 info = new InformationPage();
		 login = new LoginPage();
			invent = new InventaryPage();
			cart = new CartPage();
			login.userLogin();
			invent.selectBages();
			cart.verifyCartCount();
	}
	@Test //(enabled = true,invocationCount = 2,timeOut = 5000)//invocationCount is used to run 
	public void YourInfoPageTest()			//	run the method multiple times
	{
		String resAct = info.YourInfoPage();
		String resExp = "CHECKOUT: YOUR INFORMATION";
		Assert.assertEquals(resAct, resExp);
		Reporter.log("Title of Info Page =" + resExp);
	}
	@Test //(enabled = true,timeOut = 2000) // timeOut is used to fail the test case
	public void FillInfoPageTest() throws Exception
	{
		info.FillInfoPage();
		
	}

	@AfterMethod
	public void CloseBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE == a.getStatus())
		{
			UtilityMethod.screenShot(a.getName());
		}
		driver.close();
	}
}
