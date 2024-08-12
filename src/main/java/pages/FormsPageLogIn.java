package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FormsPageLogIn extends TestBase
{
	// Object Repository
	@FindBy(xpath = "//input[@id='email']") private WebElement emailTxtBx; 
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTxtBx; 
	@FindBy(xpath = "//input[@type='submit']") private WebElement logInBtn; 
	@FindBy(xpath = "//a[text()=' Login']") private WebElement logInTab;
	@FindBy(xpath="//a[@type='submit']") private WebElement newUserBtn;
	
	//Constructor
	public FormsPageLogIn() 
	{
		PageFactory.initElements(driver, this);
	}
	public String LogInToApplication() throws InterruptedException
	{
		logInTab.click();
		Thread.sleep(4000);
		emailTxtBx.sendKeys("pramodalande@gmail.com");
		passwordTxtBx.sendKeys("Pramod@12");
		logInBtn.click();
		return driver.getCurrentUrl();
	}
	public String verifyNewUserBtn()
	{
		logInTab.click();
		newUserBtn.click();
		return driver.getCurrentUrl();
	}
}
