package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static ChromeDriver driver;
	public void initialization() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().deleteAllCookies();
		Thread.sleep(4000);
	}
}
