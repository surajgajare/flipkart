package pom;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToCart {
	
	@FindBy (xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;
	
	public void addtocarts() 
	{
		addtocart.click();
	}
	
	@FindBy (xpath = "//span[text()='Cart']")
	private WebElement cart;
		
	@FindBy (xpath = "(//div[@ class='_3dsJAO'])[2]")
	private WebElement remove;
	
	@FindBy (xpath = "//div[@class='_28p97w']")
	private WebElement profile;
	
	@FindBy (xpath = "//div[text()='Logout']")
	private WebElement final_logout;
	
	private WebDriver drivers;

	
	public AddToCart(WebDriver drivers)
	{
		PageFactory.initElements(drivers, this);
		this.drivers=drivers;
		
		
	}
	
	
	
	
	
	public void cart()
	{
		cart.click();
	}
	

	public void remove()
	{	
		 JavascriptExecutor jse =(JavascriptExecutor)drivers;
		 jse.executeScript("arguments[0].scrollIntoView();",remove);
		 remove.click();
		    
		Actions act = new Actions(drivers);
			   
		WebElement remove2 = drivers.findElement(By.xpath("//div[text()='Remove']"));
		 act.moveToElement(remove2).click().build().perform();

	}
	
	public void profile()
	{
		 Actions act2 = new Actions(drivers);
		act2.moveToElement(profile).perform();
		
	}
	
	public void final_logout()
	{
		 Actions acts = new Actions(drivers);
		 acts.moveToElement(final_logout).click().build().perform();
		
		 
	}

	
	
}


