package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventaryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase{
	
	LoginPage login;
	InventaryPage invent;
	CartPage cart ;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		login = new LoginPage();
		invent = new InventaryPage();
		cart = new CartPage();
		login.userLogin();
		invent.selectBages();
	}
	@Test (enabled = true)
	public void cartTitleTest() throws Exception
	{
		String resAct = cart.cartTitle();
		String resExp = "YOUR CART";
		Assert.assertEquals(resAct, resExp);
		Reporter.log("Title of Page = " + resExp);
	}
	@Test
	public void verifyCartCountTest() throws Exception
	{
		Object resAct = cart.verifyCartCount();
		String resExp = "2";
		Assert.assertEquals(resAct, resExp);
		Reporter.log("Count After Removed Product = " + resExp);
	}
	
	@AfterMethod
	public void BrowseClose()
	{
		driver.close();
	}
	
	
	
	
	

}
