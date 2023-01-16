package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class InformationPage extends TestBase{
	
	@FindBy(xpath = "//span[@class='title']") private WebElement infoPage;
	@FindBy(xpath = "//input[@id='first-name']") private WebElement firstName;
	@FindBy(xpath = "//input[@id='last-name']") private WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']") private WebElement zipCode;
	@FindBy(xpath = "//input[@id='continue']") private WebElement contineuButton;


	public InformationPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String YourInfoPage()
	{
		return infoPage.getText();
	}
	public void FillInfoPage() throws Exception
	{
		firstName.sendKeys(ReadData.testData(1, 0));
		Thread.sleep(3000);
		lastName.sendKeys(ReadData.testData(2, 0));
		Thread.sleep(3000);
		zipCode.sendKeys(ReadData.testData(0, 1));
		Thread.sleep(3000);
		contineuButton.click();

	}
	

}
