package m_flipcart;


import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pom.AddToCart;
import pom.Filter;
import pom.HeaderOfPage;
import pom.Login_Page;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE\\selenium\\chromedriver.exe");
		
		WebDriver drivers = new ChromeDriver();
	
		drivers.get("https://www.flipkart.com/account/login");
		
		drivers.manage().window().maximize();
		
		Login_Page l = new Login_Page(drivers);
		l.phoneNumber();
		Thread.sleep(3000);
		l.pass();
		Thread.sleep(3000);
		l.login();
		Thread.sleep(3000);
		
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
		
		AddToCart c = new AddToCart(drivers);
		c.addtocarts();
		Thread.sleep(2000);
		
		drivers.switchTo().window(adrs.get(0));
		c.cart();
		Thread.sleep(2000);
		
		c.remove();
		Thread.sleep(2000);
		    
		

		c.profile();
		Thread.sleep(2000);
		
		c.final_logout();
		
		String url = drivers.getCurrentUrl();
		System.out.println(url);
		
		drivers.quit();

	}

}
