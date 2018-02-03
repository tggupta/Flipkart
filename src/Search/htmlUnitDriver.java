package Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class htmlUnitDriver {

	WebDriver driver=null;
	
	@Test
	public void htmlUnitDr()
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\chromedriver1.exe");
		driver=new ChromeDriver();*/
		
		HtmlUnitDriver dr=new HtmlUnitDriver();
		dr.get("http://www.google.com");
		System.out.println("The Page Title is "+dr.getTitle());
		
	}
}
