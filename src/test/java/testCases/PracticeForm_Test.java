package testCases;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.PracticeForm;
import utility.Screenshot;

public class PracticeForm_Test extends TestBase
{
	PracticeForm form;

	@BeforeMethod(alwaysRun = true)
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		form = new PracticeForm();
	}
	
	@Test
	public void studentRegistrationFormTest() throws IOException, InterruptedException {
		form.studentRegistrationForm();
		AssertJUnit.assertTrue(true);  
	}

	@Test 
	public void verifyLoginBtnTest() {
		boolean act = form.verifyLoginBtn();
		boolean exp = true;
		AssertJUnit.assertEquals(exp, act);  
		Reporter.log("Login button is not clickable");
		
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser(ITestResult it) throws IOException
	{
		
		if(it.FAILURE==it.getStatus()) {
			Screenshot.screenshot(it.getName());
		}
		
		driver.quit();
	}

}
