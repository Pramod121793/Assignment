package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.FormsPageRegister;
import utility.Screenshot;

public class FormsPageRegister_Test extends TestBase
{
	FormsPageRegister register;
	@BeforeMethod (alwaysRun = true)
	public void setUp() throws InterruptedException
	{
		initialization();
		register=new FormsPageRegister();
	}
	@Test
	public void RegisterTest() throws InterruptedException
	{
		String expURL="https://www.tutorialspoint.com/selenium/practice/register.php#";
		String actURL=register.Registration();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("After Registration Page should become = " + actURL);
	}
	@Test
	public void verifyBacktoLogInBtnTest()
	{
		String expURL="https://www.tutorialspoint.com/selenium/practice/login.php";
		String actURL=register.verifyBacktoLogInBtn();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("After Registration Page should become = " + actURL);
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
