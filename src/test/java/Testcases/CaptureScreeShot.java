package Testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class CaptureScreeShot extends TestBase{

	 LoginPage login;
		
		@BeforeMethod 
		public void setup() throws Exception
		{
			intialization();
			login = new LoginPage();
		}
		
		@Test (enabled = true)   // (enabled = false means these mehtod will not run 
		public void verifyTitleTest()   //(enable = true means method is runing
		{
			String actTile =login.verifyTitle();
			String expTitle = "Swag, Labs";
			Assert.assertEquals(actTile, expTitle);
			Reporter.log("Title of LoginPage = " + expTitle);

		}
		@Test (enabled = true)
		public void verifyUrlTest()
		{
			String actTile =login.verifyUrl();
			String expTitle = "1https://www.saucedemo.com/";	
			Assert.assertEquals(actTile, expTitle);
			Reporter.log("URL  = " + expTitle);

		}
		
		@Test (enabled = true)
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
		@Test (enabled = false)
		public void userloginTest() throws Exception
		{
			String expRes = "https://www.saucedemo.com/inventory.html";
			String actRes = login.userLogin();
			Assert.assertEquals(expRes, actRes);
			Reporter.log("USER Login = " + actRes);

		}
		@Test (enabled = false)//(dependsOnMethods = "verifyUrlTest")   // thise methode is depend on the verifyUrlTest method
		public void verifyProductLable() throws Exception    //when verifyUrltest method fail then rest of the method will skip
		{
			String actRes = login.verifyProductLable();
			String expRes = "PRODUCTS";
			Assert.assertEquals(actRes, expRes);
			Reporter.log("Product Logo is = " + expRes);
		}
		@AfterMethod 
		public void browseClose(ITestResult a) throws Exception
		{
			if(ITestResult.FAILURE == a.getStatus())
			{
				UtilityMethod.screenShot(a.getName());
			}
			driver.close();
		}
		
}
