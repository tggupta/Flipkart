package Listeners;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class practHashMap {

	WebDriver driver=null;
	
	@BeforeClass
	public void getBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\chromedriver1.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void scrollAmazon() throws InterruptedException
	{
		driver.get("https://silviomoreto.github.io/bootstrap-select/examples/");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/select")).click();
		List<WebElement> list=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[1]/select/option"));
		/*WebElement info=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[12]/div[2]/div/button/span[1]"));
		WebElement sucess=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[12]/div[2]/div/button/span[1]"));
		WebElement warning=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[12]/div[4]/div/button/span[1]"));
		WebElement danger=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[12]/div[5]/div/button/span[1]"));*/
		
		Map<Integer,WebElement> map=new HashMap<>();
		for(int i=0;i<list.size();i++)
		{
			System.out.println("List at "+i+ "is "+list.get(i));
			map.put(i, list.get(i));
			System.out.println("***********above new row appear**************");
		}
		
		System.out.println(map.get(2).getText());
		
		WebElement button=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div"));
		button.click();
		Thread.sleep(3000);
		List<WebElement> listdd=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/ul/li/a/span"));
		System.out.println("listdd size is "+listdd.size());
		
		for(int i=0;i<listdd.size();i++)
		{
			System.out.println(listdd.get(i).getText());
			System.out.println("^^^^^^^^^^^^^^^^"+listdd.get(2).getText());
		}
		
		System.out.println("*********"+listdd.get(2).getText());
		if(listdd.get(2).getText().equalsIgnoreCase("Ketchup"))
		{
			
			System.out.println("Text matches");
		}
		else
		{
			System.out.println("Text did not match");
		}
		
		/*Set<Map.Entry<Integer, WebElement>> set=map.entrySet();
		for(Map.Entry<Integer, WebElement>e: set)
		{
			System.out.println(e.getKey() + " " +e.getValue().getText());
		}
		*/	
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", map.get(1));
		//map.get(2).click();
		/*Map<Integer, WebElement> map=new HashMap<>();
		map.put(1,primary);
		map.put(2,info );
		map.put(3,sucess );
		map.put(4,warning );
		map.put(5,danger );
		
		for(int i=0;i<map.size();i++)
		{
			System.out.println(i + " "+map.get(i));
		}
		*/
		/*Set<Map.Entry<Integer,WebElement >> items=map.entrySet();
		for(Map.Entry<Integer, WebElement> e: items)
		{
			System.out.println(e.getKey()+ " " +e.getValue());
		}*/	
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", map.get(4));
		
	}
}
