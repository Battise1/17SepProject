package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.UtilityMethod;


public class InventaryPage extends TestBase{
	
	@FindBy(xpath = "//div[@class='peek']") private WebElement inventaryLogo;
	@FindBy(xpath = "//img[@class='footer_robot']") private WebElement swagLogo;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement blackPack;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLight;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement boltTshirt;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement inventaryCart;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement productSortContainer;
	@FindBy(xpath = "//a[text()='Twitter']") private WebElement tweeterSymbol;
	@FindBy(xpath = "//a[text()='Facebook']") private WebElement facebookSymbol;
	@FindBy(xpath = "//a[text()='LinkedIn']") private WebElement linkedInSymbol;

	
	
	//a[text()='Twitter']
	public InventaryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean inventaryLogo()
	{
		return inventaryLogo.isDisplayed();
	}
	public boolean swagLogo()
	{
		return swagLogo.isDisplayed();
	}
	public String selectBages() throws Exception
	{
		UtilityMethod.selectClass(productSortContainer, "Name (Z to A)");
		Thread.sleep(1000);
		blackPack.click();
		Thread.sleep(1000);
		bikeLight.click();
		Thread.sleep(1000);
		boltTshirt.click();
		Thread.sleep(1000);
		inventaryCart.click();
		return inventaryCart.getText();	
	}
	public boolean tweeterSymbol()
	{
		return tweeterSymbol.isDisplayed();
	}
	public boolean facebookSymbol()
	{
		return facebookSymbol.isDisplayed();
	}
	public boolean linkedInSymbol()
	{
		 linkedInSymbol.isDisplayed();
		 return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
