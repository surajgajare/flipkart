package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filter {
	
	
	@FindBy (xpath = "//div[text()='6 GB  Above']")
	private WebElement ram;
	
	@FindBy (xpath = "//div[text()='SAMSUNG']")
	private WebElement brand;
		
	@FindBy (xpath = "//div[text()='Availability']")
	private WebElement availability;
	
	@FindBy (xpath = "//div[text()='Exclude Out of Stock']")
	private WebElement excludeoutofstock;
	
	@FindBy (xpath = "(//a[@class='_1fQZEK'])[1]")
	private WebElement addfirst;
	
	
	public Filter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void rams()
	{
		ram.click();
	}
	
	public void brand()
	{
		brand.click();
	}
	
	public void availability()
	{
		availability.click();
	}
	
	public void excludeoutofstock()
	{
		excludeoutofstock.click();
	}
	
	public void addfirst()
	{
		addfirst.click();
	}

	

}
