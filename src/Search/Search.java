package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search {

	WebDriver driver=null;

	@Test
	public void search() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");

		Locators loc=PageFactory.initElements(driver, Locators.class);
		String Firsttabname=loc.Firsttab.getText();
		System.out.println(Firsttabname);

		String Secondtabname=loc.Secondtab.getText();
		System.out.println(Secondtabname);

		Assert.assertEquals(Firsttabname, "ELECTRONICS");
		System.out.println("Pass -First name is correct");

		Assert.assertEquals(Secondtabname, "APPLIANCES");
		System.out.println("Pass -Second name is correct");

		loc.Searchbox.sendKeys("iPhone8");
		loc.Searchbox.sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		int totallinks=driver.findElements(By.xpath("//*/div[@class='_1vC4OE _2rQ-NK']")).size();
		System.out.println(totallinks);

		List<WebElement> totaliphones=driver.findElements(By.xpath("//*/div[@class='_1vC4OE _2rQ-NK']"));
		ArrayList<String> list=new ArrayList<String>();
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			System.out.println("**--**");
			itr1.next();
		}

		
/*		for(int i=0;i<totaliphones.size();i++)
		{	
			String price=totaliphones.get(i).getText();
			String price1=price.substring(1, 7);
			//System.out.println(price1);
			list.add(price1);
			//	System.out.println(list);
		}
*/
		Collections.sort(list);
		System.out.println(list);

		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.next();
		}

	}


}


