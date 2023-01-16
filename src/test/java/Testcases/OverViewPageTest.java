package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InformationPage;
import Pages.InventaryPage;
import Pages.LoginPage;
import Pages.OverViewPage;
import io.netty.util.Timeout;

public class OverViewPageTest extends TestBase{
	InformationPage info;
	LoginPage login;
	InventaryPage invent;
	CartPage cart;
	OverViewPage over;
	
	@BeforeMethod (alwaysRun = true)
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
			over = new OverViewPage();
			info.FillInfoPage();
	}
	@Test (groups = "Smoke",priority = 1)
	public void titleofViewPageTest()
	{
		String actRes = over.titleofViewPage();
		String expRes = "CHECKOUT: OVERVIEW";
		Assert.assertEquals(actRes, expRes);
		Reporter.log("Title of OverView =" + expRes);
	}
	@Test (groups = "sanity",timeOut = 5000,priority = 2)
	public void paymentInfoTest()
	{
		String actRes = over.paymentInfo();
		String expRes = "SauceCard #31337";
		Assert.assertEquals(actRes, expRes);
		Reporter.log("Title of paymentInfo =" + expRes);
	}
	@Test (groups = "Smoke",enabled = true,priority = 3)
	public void ShippingInfoTest() throws Exception
	{
		String res1 = over.ShippingInfo();
		String res2 = "FREE PONY EXPRESS DELIVERY!";
		Assert.assertEquals(res1, res2);
		Reporter.log("Title of ShippingInfo =" + res2);
	}
	@Test (groups = "sanity",enabled = true,priority = 4)
	public void FinishButtonTest()
	{
		  over.FinishButton();
	}
	@AfterMethod (alwaysRun = true)
	public void BrowseClose()
	{
		driver.close();
	}

}
