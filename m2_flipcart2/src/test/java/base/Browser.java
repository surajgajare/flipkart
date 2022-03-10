package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser {

	public static WebDriver launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE\\selenium\\chromedriver.exe");
		WebDriver drivers = new ChromeDriver();
		return drivers;
	}
	
	public static WebDriver launchFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SOFTWARE\\selenium\\geckodriver.exe");
		WebDriver drivers = new FirefoxDriver();
		return drivers;
	}
	
	public static WebDriver launchOperaBrowser()
	{
		System.setProperty("webdriver.opera.driver","D:\\SOFTWARE\\selenium\\operadriver.exe");
		WebDriver drivers = new OperaDriver();
		return drivers;
	}
	
	
}
