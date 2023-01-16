package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase{
	
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement logInLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;

	@FindBy(xpath = "//input[@id='user-name']") private WebElement userNametextBox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwardtextBox;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement logInButton;
	@FindBy(xpath = "//span[@class='title']") private WebElement productlable;
	@FindBy(xpath = "//a[text()='LinkedIn']") private WebElement signinLink;

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public  boolean verifylogLogo()
	{
		 return logInLogo.isDisplayed();
	}
	
	public boolean verifyBotLogo()
	{
		return botLogo.isDisplayed();
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	public String userLogin() throws Exception
	{
//		userNametextBox.sendKeys(ReadData.ReadDataPropertyFile("UserName"));
		userNametextBox.sendKeys(ReadData.testData(0, 0));
		passwardtextBox.sendKeys(ReadData.ReadDataPropertyFile("Passward"));
		logInButton.click();
		return driver.getCurrentUrl();	
	}
	public String verifyProductLable() throws Exception
	{
		userLogin();
		return productlable.getText();
	}
	public void scrollPage() throws Exception 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("window.scrollBy(0,1000)");
//		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", signinLink);
	}

}
