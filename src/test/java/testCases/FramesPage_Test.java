package testCases;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.FramesPage;
import utility.Screenshot;

public class FramesPage_Test extends TestBase
{
	FramesPage fp;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		fp = new FramesPage();
	}
	
	@Test
	public void verifyIFrame1Test() {
		String actText = fp.verifyIFrame1();
		String expText = "Selenium - Automation Practice Form";
		AssertJUnit.assertEquals(expText, actText);
	}
	
	@Test
	public void verifyIFrame2Test() {
		String actText = fp.verifyIFrame2();
		String expText = "Selenium - Automation Practice Form";
		AssertJUnit.assertEquals(expText, actText);
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
