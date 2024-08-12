package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.FormsPageLogIn;
import utility.Screenshot;

public class FormsPageLogIn_Test extends TestBase
{
	FormsPageLogIn login;
	@BeforeMethod(alwaysRun = true)	
	public void setUp() throws InterruptedException
	{
		initialization();
		login=new FormsPageLogIn();
	}
	@Test
	public void LogInToApplicationTest() throws InterruptedException
	{
		String expURL="https://www.tutorialspoint.com/selenium/practice/login.php#";
		String actURL=login.LogInToApplication();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("After LogIn Page should become = " + actURL);
	}
	@Test
	public void verifyNewUserBtnTest()
	{
		String expURL="https://www.tutorialspoint.com/selenium/practice/register.php";
		String actURL=login.verifyNewUserBtn();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("After LogIn Page should become = " + actURL);	
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
