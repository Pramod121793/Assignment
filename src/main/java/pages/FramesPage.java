package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FramesPage extends TestBase
{
	@FindBy(xpath="//button[normalize-space()='Alerts, Frames & Windows']") private WebElement alertFramesWindowsPage;
	@FindBy(xpath="//a[normalize-space()='Frames']")  private WebElement framesPage;
	
	//constructor
	public FramesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyIFrame1() {
		alertFramesWindowsPage.click();
		framesPage.click();
	    driver.switchTo().frame(0) ;
	    String iframe1Text = driver.findElement(By.tagName("h1")).getText();
		return iframe1Text;
	}
	
	public String verifyIFrame2() {
		alertFramesWindowsPage.click();
		framesPage.click();
		driver.switchTo().frame(1);
		String iframe1Text = driver.findElement(By.tagName("h1")).getText();
		return iframe1Text;
	}
}
