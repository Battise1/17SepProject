package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

import Base.TestBase;

public class OverViewPage extends TestBase{
	
	private static final String String = null;
	@FindBy(xpath = "//span[@class='title']") private WebElement overViewtitle;
	@FindBy(xpath = "//div[text()='SauceCard #31337']") private WebElement paymentInfo;
	@FindBy(xpath = "//div[text()='FREE PONY EXPRESS DELIVERY!']") private WebElement shippingInfo;
	@FindBy(xpath = "//button[text()='Finish']") private WebElement finishButton;
	
	public OverViewPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String titleofViewPage()
	{
		return overViewtitle.getText();
	}
	public String paymentInfo()
	{
		return paymentInfo.getText();
	}
	public String ShippingInfo() throws Exception
	{
		return shippingInfo.getText();
	}
	public void FinishButton()
	{
		finishButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
