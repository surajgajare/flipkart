package pom;


import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {

	
		
	    @FindBy (xpath = "(//input[@type='text'])[2]")
	    private WebElement phone;
		
		@FindBy (xpath = "//input[@type='password']")
		private WebElement pass;
			
		@FindBy (xpath = "(//button[@type='submit'])[2]")
		private WebElement Login_2;
		
//		private WebDriver drivers;
//		private WebDriverWait wait;

		
		
		public Login_Page(WebDriver drivers)
		{
			PageFactory.initElements(drivers, this);
//			this.drivers=drivers;
//			wait=new WebDriverWait(drivers,10);
			
		}
		
		public void phoneNumber()
		{
		//	wait.until(ExpectedConditions.visibilityOf(phone));
			phone.sendKeys("9577600101");
		}

		public void pass() 
		{  // wait.until(ExpectedConditions.visibilityOf(pass));
			pass.sendKeys("Sknskn@143");
			
		}
		
		public void login() 
		{	
//			wait=new WebDriverWait(drivers,20);
//			wait.until(ExpectedConditions.visibilityOf(Login_2));
			Login_2.click();
			
		}
		
	}






