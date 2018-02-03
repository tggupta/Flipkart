package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Pract_01 {

	WebDriver driver;
	String text;
	
	
	@BeforeTest
	public void Pract_before()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\chromedriver1.exe");
		driver=new ChromeDriver();
	}
	
	@Test(priority=1)
	public void tryPrime() throws InterruptedException
	{
		//driver.get("https://album.alexflueras.ro/index.php");
		
		driver.get("https://silviomoreto.github.io/bootstrap-select/examples/");
		driver.manage().window().maximize();
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mustard");
		list.add("Ketchup");
		list.add("Relish");
		
		System.out.println(list);
		
		WebElement dropdown=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/select"));
		dropdown.click();
		
		List<WebElement> ls=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[1]/select/option"));
		System.out.println(ls.size());
		System.out.println(ls.get(1).getText());
		
/*		for(String lname:list)
		{
			System.out.println(lname);
		}
		*/
		for(int i=0;i<list.size();i++)
		{
			//for(int j=0;j<ls.size();j++)
			for(WebElement lname:ls)
			{
			if(lname.getText().contains(list.get(i)))
			{
				System.out.println("i = "+list.get(i));
				System.out.println("j = "+lname.getText());
				System.out.println("Match found");
			}
			else
			{
				System.out.println("In Else, No Match found "+"i ="+list.get(i)+" j= "+lname.getText()+"*****j++"+lname.getText());
			}
			}
		}
			
		
	}

}
