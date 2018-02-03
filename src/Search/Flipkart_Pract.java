package Search;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Flipkart_Pract {
	
	WebDriver driver=null;
	//Logger logger = Logger.getLogger("Flipkart_Pract");
	//Logger logger = LogManager.getLogger(Flipkart_Pract.class.getName());
	//PropertyConfigurator.configure("Log4j.properties");
			
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Tarun\\workspace\\Flipkart\\lib\\geckodriver.exe");
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("dom.webnotification.enabled", false);
		
		driver=new FirefoxDriver(profile);
		driver.get("http://www.flipkart.com");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement diwalisale=driver.findElement(By.xpath("//*/a[@href='/diwalisale-hf-store']"));
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
								.withTimeout(30, TimeUnit.SECONDS)
								.pollingEvery(5, TimeUnit.SECONDS)
								.ignoring(NoSuchElementException.class);
		
		
		WebElement diwalisale1=wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				
				return driver.findElement(By.xpath("//*/a[@href='/diwalisale-hf-store']"));
			}
			
		});
		
		driver.findElement(By.xpath("//*/input[@name='q']")).sendKeys("Blackberry trouser grey");
		driver.findElement(By.xpath("//*/input[@name='q']")).sendKeys(Keys.ENTER);
		
		//Log.info("Coming from Log.info ***Logging - Test Execution started");
		WebElement checkbox=driver.findElement(By.xpath("//*[text()='0-Degree']/preceding-sibling::div[1]"));
		if(checkbox.isEnabled())
		{
			System.out.println("Check is enabled and can be selected");
		}
		driver.manage().window().maximize();
		String Brand=driver.findElement(By.xpath("//*[text()='Blackberrys']")).getText();
		if(Brand.equals("Blackberrys"))
		{
			System.out.println("pass");
			
			//List min=driver.findElements(By.xpath("//*/select[@class='a_eCSK' and @data-reactid='121']"));
			Select sel=new Select(driver.findElement(By.xpath("//*/select[@class='a_eCSK']")));
			sel.selectByValue("1000");
			
			Thread.sleep(15000);
			Actions action=new Actions(driver);
			WebElement Blackberrys=driver.findElement(By.xpath("//*[text()='Blackberrys']"));
			action.moveToElement(Blackberrys);
			action.build().perform();
			//driver.findElement(By.xpath("//*[text()='Blackberrys']/preceding-sibling::input")).click();
			//Log.info("Coming from Log.info ***Test Execution complete");
		}
	}

}
