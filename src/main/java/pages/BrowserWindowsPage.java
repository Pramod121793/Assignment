package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class BrowserWindowsPage extends TestBase
{
	//Object Repository
	@FindBy(xpath = "//button[normalize-space()='Alerts, Frames & Windows']") private WebElement alertFrameWindowsTab; 
	@FindBy(xpath = "//a[text()=' Browser Windows']") private WebElement browserWindowsTab;
	@FindBy(xpath = "//button[text()='New Tab']") private WebElement newTabBtn; 
	@FindBy(xpath = "//button[text()='New Window']") private WebElement newWindowBtn;
	@FindBy(xpath = "//button[text()='New Window Message']") private WebElement newWindowMsgBtn;
	 
	//Constructor
	public BrowserWindowsPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	public String verifynewTabBtn() throws InterruptedException
	{
		alertFrameWindowsTab.click();
		Thread.sleep(2000);
		browserWindowsTab.click();
		String win = driver.getWindowHandle();
		newTabBtn.click();
		Thread.sleep(2000);
		Set<String> window = driver.getWindowHandles();
		for(String w: window)
		{
			if(win.equalsIgnoreCase(w))
			{
				driver.switchTo().window(w);
			}
		}
		String windowText = driver.findElement(By.xpath("//h1[@class='mb-3 fw-normal border-bottom text-left pb-2 mb-4']")).getText();
		return windowText;
	}	
	public String verifynewWindowBtn() throws InterruptedException
	{
		alertFrameWindowsTab.click();
		Thread.sleep(2000);
		browserWindowsTab.click();
		String win = driver.getWindowHandle();
		newWindowBtn.click();
		Thread.sleep(2000);
		Set<String> window = driver.getWindowHandles();
		for(String w: window)
		{
			if(win.equalsIgnoreCase(w))
			{
				driver.switchTo().window(w);
			}
		}
		String windowText = driver.findElement(By.xpath("//h1[@class='mb-3 fw-normal border-bottom text-left pb-2 mb-4']")).getText();
		return windowText;
	}
	public String verifynewWindowMsgBtn() throws InterruptedException
	{
		alertFrameWindowsTab.click();
		Thread.sleep(2000);
		browserWindowsTab.click();
		String win = driver.getWindowHandle();
		newWindowMsgBtn.click();
		Thread.sleep(2000);
		Set<String> window = driver.getWindowHandles();
		for(String w: window)
		{
			if(win.equalsIgnoreCase(w))
			{
				driver.switchTo().window(w);
			}
		}
		String windowText = driver.findElement(By.xpath("//h1[@class='mb-3 fw-normal border-bottom text-left pb-2 mb-4']")).getText();
		return windowText;
	}	
}
