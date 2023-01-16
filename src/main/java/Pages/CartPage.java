package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase{
	
	
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']") private WebElement boltTshirt;
	@FindBy(xpath = "//span[@class='title']") private WebElement CartTitle;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement cartCaunt;
	@FindBy(xpath = "//button[@id='checkout']") private WebElement checkOut;
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String cartTitle() throws Exception
	{
		boltTshirt.click();
		Thread.sleep(5000);
		return CartTitle.getText();
	}
	public String verifyCartCount() throws Exception
	{
		boltTshirt.click();
		Thread.sleep(3000);
		checkOut.click();
		return cartCaunt.getText();
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
