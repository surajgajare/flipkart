package m_flipcart;

import java.io.IOException;



import java.util.ArrayList;
import org.openqa.selenium.WebDriver;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Browser;

import org.testng.annotations.Parameters;

import pom.AddToCart;
import pom.Filter;
import pom.HeaderOfPage;
import pom.Login_Page;
import utils.Utility;




public class tests extends Browser{

	private WebDriver drivers;
	String testID;

	private AddToCart c;
	private	Login_Page l;
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			drivers = launchChromeBrowser();
		}
		
		if(browserName.equals("Firefox"))
		{
			drivers = launchFirefoxBrowser();
		}
		
		if(browserName.equals("Opera"))
		{
			drivers = launchOperaBrowser();
		}
	}
	@BeforeClass //launchBrowser
	public void launchBrowser()
	{
//		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE\\selenium\\chromedriver.exe");
//		
//		 drivers = new ChromeDriver();
//	
//		drivers.get("https://www.flipkart.com/account/login");
//		
//		drivers.manage().window().maximize();
		System.out.println("");
		
	}
	
	@BeforeMethod //logInToApplication	
	public void logInApplication() throws InterruptedException, IOException
	{
		drivers.get("https://www.flipkart.com/account/login");
		
		Thread.sleep(2000);
		drivers.manage().window().maximize();
		Thread.sleep(2000);
		l = new Login_Page(drivers);
		l.phoneNumber();
		Thread.sleep(3000);
		l.pass();
		Thread.sleep(3000);
		l.login();
		Thread.sleep(3000);
		
		
	}
	
	@Test //verifyFunctinality
	public void addDelete() throws InterruptedException, IOException
	{
		testID = "1102"; 
				
		HeaderOfPage header = new HeaderOfPage(drivers);
		header.search();
		Thread.sleep(3000);
		header.searchClick();
		Thread.sleep(3000);
		
		Filter filter = new Filter(drivers);
		filter.rams();
		Thread.sleep(2000);
		filter.brand();
		Thread.sleep(2000);
		filter.availability();
		Thread.sleep(2000);
		filter.excludeoutofstock();
		Thread.sleep(2000);
		filter.addfirst();
		Thread.sleep(2000);
		
		ArrayList<String> adrs= new ArrayList<String>(drivers.getWindowHandles());
		drivers.switchTo().window(adrs.get(1));
		
		c = new AddToCart(drivers);
		c.addtocarts();
		Thread.sleep(2000);
		
		Utility.captureScreenshot(drivers, testID);
		Thread.sleep(2000);
		
//		drivers.switchTo().window(adrs.get(0));
//		c.cart();
//		Thread.sleep(2000);
//		
//		c.remove();
//		Thread.sleep(2000);	
	}
	
	@Test
	public void remove() throws InterruptedException
	{
	//ArrayList<String> adrs= new ArrayList<String>(drivers.getWindowHandles());
//		drivers.switchTo().window(adrs.get(0));
		Thread.sleep(2000);
		c.cart();
		Thread.sleep(2000);
		
		c.remove();
		Thread.sleep(2000);
	}
	
	
	@AfterMethod //logOutFromApplication
	public void logout() throws InterruptedException
	{


        c = new AddToCart(drivers);
		Thread.sleep(2000);
		c.profile();
		Thread.sleep(2000);
		
		c.final_logout();
		Thread.sleep(2000);
	
	}
	
	@AfterClass  //closeBrowser
	public void closeBrowser()
	{
		drivers.quit();
	}
	
}
