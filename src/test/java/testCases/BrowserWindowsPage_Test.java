package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BrowserWindowsPage;
import utility.Screenshot;

public class BrowserWindowsPage_Test extends TestBase
{
	BrowserWindowsPage windows;
	@BeforeMethod(alwaysRun = true)	
	public void setUp() throws InterruptedException
	{
		initialization();
		windows=new BrowserWindowsPage();
	}
	@Test
	public void verifynewTabBtnTest() throws InterruptedException 
	{
		String expTxt="New Tab";
		String actTxt=windows.verifynewTabBtn();
		AssertJUnit.assertEquals(expTxt, actTxt);
		Reporter.log("After Click on New Tab Button getting Text = " + actTxt);
	}
	@Test
	public void verifynewWindowBtn() throws InterruptedException
	{
		String expTxt="New Window";
		String actTxt=windows.verifynewWindowBtn();
		AssertJUnit.assertEquals(expTxt, actTxt);
		Reporter.log("After Click on New Window Button getting Text = " + actTxt);
	}
	@Test
	public void verifynewWindowMsgBtn() throws InterruptedException
	{
		String expTxt="New Window Message";
		String actTxt=windows.verifynewWindowMsgBtn();
		AssertJUnit.assertEquals(expTxt, actTxt);
		Reporter.log("After Click on New Window Message Button getting Text = " + actTxt);
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(ITestResult it) throws IOException
	{
		if(it.FAILURE==it.getStatus())  
		{
			Screenshot.screenshot(it.getName());
		}
		driver.close();
	}
}
