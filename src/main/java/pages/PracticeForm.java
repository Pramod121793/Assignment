package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.HandleDropdownList;

public class PracticeForm extends TestBase
{
	//creating object repository for practiceform
		@FindBy(xpath="//input[@id='name']") private WebElement firstName;
		@FindBy(xpath="//input[@id='email']") private WebElement emailID;
		@FindBy(xpath="//input[@id='gender']") private WebElement maleRadioBtt;
		@FindBy(xpath="//input[@id='mobile']") private WebElement mobileNumber;
		@FindBy(xpath="//input[@id='dob']") private WebElement dob;
		@FindBy(xpath="//input[@id='subjects']") private WebElement subjects;
		@FindBy(xpath="//input[@id='hobbies']") private WebElement hobbySport;
		@FindBy(xpath="//input[@id='picture']") private WebElement photoUploadBtn;
		@FindBy(xpath="//textarea[@id='picture']") private WebElement currentAddress;
		@FindBy(xpath="//select[@id='state']") private WebElement chooseStateDropdown;
		@FindBy(xpath="//select[@id='city']") private WebElement chooseCityDropdown;
		@FindBy(xpath="//input[@value='Login']") private WebElement loginBtn;
						
		  //constructor
			public PracticeForm()
			{
				PageFactory.initElements(driver, this);
			}
				
			//action methods
			public void studentRegistrationForm() throws InterruptedException 
			{
				firstName.sendKeys("Tejas Ghate");
				emailID.sendKeys("tejasghate@gmail.com");
				maleRadioBtt.click();
				mobileNumber.sendKeys("1234567890");
				dob.click(); 
				subjects.sendKeys("Mathmatics");
				hobbySport.click();
				photoUploadBtn.sendKeys("/Users/kalyanighate/eclipse-workspace/AutomationProject/testData/image.jpg");
				currentAddress.sendKeys("Ghandhi nagar");
				HandleDropdownList.handleSelectClass(chooseStateDropdown, "NCR");
				HandleDropdownList.handleSelectClass(chooseCityDropdown, "Agra");
			}
			public boolean verifyLoginBtn()
			{
				boolean btn = loginBtn.isEnabled();
				return btn;
			}
}
