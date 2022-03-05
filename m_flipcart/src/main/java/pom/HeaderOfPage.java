package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderOfPage {
	
	@FindBy (xpath = "//input[@title='Search for products, brands and more']")
	private WebElement search;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement searchClick;
	
	@FindBy (xpath = "(//div[@class='_28p97w'])[1]")
	private WebElement profileHover;
	
	@FindBy (xpath = "(//div[@class='_28p97w'])[1]")
	private WebElement more;
	
	@FindBy (xpath = "//span[text()='Cart']")
	private WebElement Cart;

	@FindBy (xpath = "(//div[text()='Top Offers'])[1]")
	private WebElement topOffers;
	
	@FindBy (xpath = "(//div[text()='Grocery'])[1]")
	private WebElement Grocery;
	
	@FindBy (xpath = "(//div[text()='Mobiles'])[1]")
	private WebElement mobiles;
	
	@FindBy (xpath = "(//div[text()='Fashion'])[1]")
	private WebElement Fashion;
	
	@FindBy (xpath = "(//div[text()='Electronics'])[1]")
	private WebElement Electronics;
	
	@FindBy (xpath = "(//div[text()='Home'])[1]")
	private WebElement Home;
	
	@FindBy (xpath = "(//div[text()='Appliances'])[1]")
	private WebElement Appliances;
	
	@FindBy (xpath = "(//div[text()='Travel'])[1]")
	private WebElement Travel;
	
	@FindBy (xpath = "(//div[text()='Beauty, Toys & More'])[1]")
	private WebElement BeautyToysndMore;
	
	
	
	
	public HeaderOfPage(WebDriver drivers)
	{
		PageFactory.initElements(drivers, this);
	}
	
	public void search()
	{
		search.sendKeys("mobile");
	}
	
	public void searchClick()
	{
		searchClick.click();
	}
	
//	public void ram()
//	{
//		search.click();
//	}
	
	
	
}
