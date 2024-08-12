package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AlertPage extends TestBase
{
	//object repository
	@FindBy(xpath="//button[normalize-space()='Alerts, Frames & Windows']")  private WebElement alertPageSelect;
	@FindBy(xpath="//a[normalize-space()='Alerts']")  private WebElement alertPage;
	@FindBy(xpath="//button[normalize-space()='Alert']")  private WebElement helloWorldAlert;
	@FindBy(xpath="//button[@onclick='myMessage()']")  private WebElement delayedHelloAlert;
	@FindBy(xpath="//button[@onclick='myDesk()']")  private WebElement confirmationAlert;
	@FindBy(xpath="//button[@onclick='myPromp()']")  private WebElement inputAlert;
	
	
	//Constructor
	public AlertPage(){
		PageFactory.initElements(driver, this);
	}
	
	//actionMethods
	public String verifyHelloWorldAlert() {
		alertPageSelect.click();
		alertPage.click();
		helloWorldAlert.click();
	    Alert alrt = driver.switchTo().alert();
		String text = alrt.getText();
		alrt.accept();
		return text;
	}
	
	//failed alert test for demo
	public String failedHelloWorldAlert() {
		alertPageSelect.click();
		alertPage.click();
		helloWorldAlert.click();
	    Alert alrt = driver.switchTo().alert();
		String text = alrt.getText();
		alrt.accept();
		return text;
	}
	
	public String verifyDelayedAlert() throws InterruptedException {
		alertPageSelect.click();
		alertPage.click();
		delayedHelloAlert.click();
		Thread.sleep(5000);
		Alert alrt = driver.switchTo().alert();
		String text = alrt.getText();
		alrt.accept();
		return text;
	}
	
	public String verifyConfirmationAlert() {
		alertPageSelect.click();
		alertPage.click();
		confirmationAlert.click();
		Alert alrt = driver.switchTo().alert();
		String text = alrt.getText();
		alrt.accept();
		return text;
	}
	
	public String verifyInputAlert() {
		alertPageSelect.click();
		alertPage.click();
		inputAlert.click();
		Alert alrt = driver.switchTo().alert();
		alrt.sendKeys("Tejas");
		String text = alrt.getText();
		alrt.accept();
		return text;
	}
}
