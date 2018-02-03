package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mmt {

	WebDriver driver=null;
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\chromedriver1.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.makemytrip.com");


	}
	@Test
	public void performAction() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		WebElement deals=driver.findElement(By.xpath("//*[@id='cardLi']/div[4]/div[1]/div[2]/p/a/span[2]"));
		WebElement ele=driver.findElement(By.xpath("//*[@id='cardLi']/div[4]/a/div"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		deals.click();
		System.out.println(deals.getText());
		String NoOfDeals=deals.getText();
		int totalDeals=Integer.parseInt(NoOfDeals.substring(0, 1));
		System.out.println(totalDeals);
		//	Thread.sleep(2000);
		ArrayList ar=new ArrayList();
		for(int i=1;i<=totalDeals;i++)
		{	
			WebElement dealprice=driver.findElement(By.xpath
					("//*[text()='New Delhi-Chandigarh']/parent::div/parent::div/following-sibling::div/div[2]/ul/li["+i+"]/span[1]/span[1]"));

			String flightprice=dealprice.getText();
			int price=Integer.parseInt(flightprice.substring(2, 6));
			System.out.println(price);
			ar.add(price);
		
		}
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
		

	}

}
