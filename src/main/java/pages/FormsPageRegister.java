package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FormsPageRegister extends TestBase
{
	// Object Repository
	@FindBy(xpath = "//a[text()=' Register']") private WebElement registerTab; 
	@FindBy(xpath = "//input[@id='firstname']") private WebElement firstNameTxtBox; 
	@FindBy(xpath = "//input[@id='lastname']") private WebElement lastNameTxtBox;
	@FindBy(xpath = "//input[@id='username']") private WebElement userNameTxtBox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTxtBox; 
	@FindBy(xpath = "//input[@type='submit']") private WebElement registerBtn; 
	@FindBy(xpath = "//a[@type='submit']") private WebElement backToLogInBtn; 
	
	//Constructor
	public FormsPageRegister()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	public String Registration() throws InterruptedException
	{
		registerTab.click();
		Thread.sleep(4000);
		firstNameTxtBox.sendKeys("Pramod");
		lastNameTxtBox.sendKeys("Alande");
		userNameTxtBox.sendKeys("pramodalande@gmail.com");
		passwordTxtBox.sendKeys("Pramod@12");
		Thread.sleep(3000);
		registerBtn.click();		
		return driver.getCurrentUrl();
	}
	public String verifyBacktoLogInBtn() 
	{
		registerTab.click();
		backToLogInBtn.click();
		return driver.getCurrentUrl();
	}
}
