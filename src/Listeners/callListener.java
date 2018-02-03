package Listeners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(SampleListeners.class)
public class callListener {

	WebDriver driver=null;
	@Test
	public void getTestCase() throws InterruptedException
	{
	System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\geckodriver.exe");
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("dom.webnotification.enables", false);
	driver=new FirefoxDriver(profile);
	
	driver.navigate().to("http://www.rediff.com");
	driver.manage().window().maximize();
	
	Set<String> windows=driver.getWindowHandles();
	//Iterator<String> itr=new Iterator(windows);
	//ArrayList<Integer> list=new ArrayList<Integer>;
	Thread.sleep(5000);
		
	}
	@AfterTest
	public void endTest()
	{
		driver.close();
	}
	
}
