package Search;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Listeners.Testpract_page;

public class testAmazon{

	WebDriver driver;
	Home_Flipkart hf=new Home_Flipkart(driver);
//	Testpract_page tpp=new Testpract_page(driver);
	String text=null;
	
	@BeforeTest
	public void test_beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void test_01() throws InterruptedException
	{
		driver.get("https://strade.sharekhan.com/rmmweb/");
		
		Thread.sleep(5000);
		WebElement Button=driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/loginpage/div/div/div/div[2]/div[2]/div/div[4]/div[1]/form/div[1]/button"));
		text=driver.findElement(By.xpath("//*[text()='Enter Trading Login ID or Registered Email ID']")).getText();
		System.out.println("text is "+text);
		//Button.sendKeys(Keys.ENTER);
		while(!text.equals("Enter Trading Login ID or Registered Email ID"))
		{	
		text=driver.findElement(By.xpath("//*[text()='Enter Trading Login ID or Registered Email ID']")).getText();
		System.out.println("text is...inside while loop =="+text);	
		Button.sendKeys(Keys.ENTER);
		System.out.println("Clicking on elements");	
		}
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button' and @id='link']")).click();;
		String text_1=driver.findElement(By.xpath("//*[contains(text(),'Alert !!! Please enter login ID.')]")).getText();
		System.out.println(text_1);

	}
	
/*	@Test(priority=2)
	public void getText()
	{
	Pract_01 pt=PageFactory.initElements(driver, Pract_01.class);
	text1=pt.tryPrime(driver);
	System.out.println(text1);
	
	driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(text1);
	}*/
	
/*	@Test(priority=2)
	public void listAll(WebDriver driver) throws InterruptedException
	{
		Testpract_page tpp4=PageFactory.initElements(driver, Testpract_page.class);
		tpp4.getAll(driver);
	}
	*/
	
	/*	@Test(priority=2)
	public void categories()
	{
		Testpract_page tpp=PageFactory.initElements(driver, Testpract_page.class);
		try {
			tpp.getCategories(driver);
			Thread.sleep(4000);
			System.out.println("Scrolling into the element");
			tpp.scrollview(driver);
			
			System.out.println("In the web page - Child age - 18-24 months");
			tpp.clickmonths(driver);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void getPrices()
	{
		Testpract_page tpp1=PageFactory.initElements(driver, Testpract_page.class);
		tpp1.babyPage(driver);
	}	
	
	@Test(priority=4)
	public void getDressDetails() throws InterruptedException
	{
		Testpract_page tpp2=PageFactory.initElements(driver, Testpract_page.class);
		Thread.sleep(5000);
		tpp2.sortByCustomerReview(driver);
	}
*/	
/*	@Test(priority=10)
	public void test_02()
	{
		System.out.println("capturing screenshot");	
		try {
			hf.captureScreenShot(driver);
			System.out.println("Screenshot Captured successfully");
		} catch (IOException e) 
		{
			System.out.println("Screenshot captured failed");
			e.printStackTrace();
		}

	}*/

}