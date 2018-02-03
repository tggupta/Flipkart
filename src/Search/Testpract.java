package Search;

import org.testng.annotations.Test;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testpract {
	
	WebDriver driver=null;
	File Inputfile=new File("C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\Util.properties");
	File Outputfile=new File("C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\Util1.properties");
	
	@BeforeTest
	public void getbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\chromedriver1.exe");
		
		
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("chrome.switches","--disable-extensions");
		
		driver=new ChromeDriver(cp);
	}
	@Test()
	public void getportal() throws IOException, InterruptedException
	{
	FileInputStream fis=new FileInputStream(Inputfile);
	Properties prop=new Properties();
	prop.load(fis);
	driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement entertainment=driver.findElement(By.xpath("//*[text()='Entertainment' and @href='/videos/entertainment' and @pg='#Entertainment-View~RHS-Video_Section']"));
	Actions act=new Actions(driver);
	act.moveToElement(entertainment).click().build().perform();
	
	}

	@Test(dependsOnMethods={"getportal"})
	public void setStatus()  throws IOException 
	{
		FileOutputStream fos=new FileOutputStream(Outputfile);
		Properties prop1=new Properties();
		if(1==2)
		{
		System.out.println("this should be pass");
		prop1.setProperty("status", "PASS");
		prop1.store(fos, null);		
		}
		else
		{
			System.out.println("this should be fail");
			prop1.setProperty("status", "FAIL");
			prop1.store(fos, null);			
		}	
		
	}
	
}