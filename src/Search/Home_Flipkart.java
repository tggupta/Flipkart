package Search;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home_Flipkart {

	WebDriver driver;
	WebElement element=null;
			
	public Home_Flipkart(WebDriver driver)
	{
		this.driver=driver;
	}
/*	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\chromedriver1.exe");
		driver=new ChromeDriver();
	}*/
	
	@Test
	public void navigate(WebDriver driver) throws IOException, AWTException
	{
		driver.get("http://www.flipkart.com");		
		driver.findElement(By.xpath("//*[contains(text(),'Login')]/ancestor::div[6]/button")).click();
		
/*		System.out.println("browser open-- taking screenshot");
		element=driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div[2]/div/div/a"));
		captureScreenShot();
		Actions action=new Actions(driver);
		action.moveToElement(element).contextClick().build().perform();
		*/
		/*Robot r=new Robot();

		Point point=element.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		int width=element.getSize().getWidth();
		int height=element.getSize().getHeight();
		
		r.mouseMove(point.getX(), point.getY());
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
*/		
	}
	
	public void captureScreenShot(WebDriver driver) throws IOException
	{
		System.out.println("Code from Capture Screenshot");
		File inputSrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
/*		BufferedImage Bimg=ImageIO.read(inputSrc);
		Point point=element.getLocation();
		int width=element.getSize().getWidth();
		int height=element.getSize().getHeight();
		
		BufferedImage eleScrnShot=Bimg.getSubimage(point.getX(), point.getY(), width, height);
		ImageIO.write(eleScrnShot, "png", inputSrc);*/
		FileUtils.copyFile(inputSrc, new File("C:\\Users\\Tarun\\Downloads\\Screenshot\\"+System.currentTimeMillis()+".png"));
		//FileUtils.copyFile(inputSrc, new File("D:\\screenshot.png"));
		System.out.println("screenshot taken successfully");
		
	}

	@AfterTest
	public void closeBrowser()
	{
		//driver.close();
	}
}
