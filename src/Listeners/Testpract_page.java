package Listeners;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testpract_page {

	WebDriver driver;

	@FindBy(xpath="//*[@id='nav-link-shopall']")
	WebElement shopbycategory;
	
	@FindBy(xpath="//*[text()='Baby Fashion' and @class='nav_a']")
	WebElement babyFashion;
	
	@FindBy(xpath="//*[@alt='18-24 months']")
	WebElement months;
	
	@FindBy(xpath="//*[@class='s-layout-picker s-grid-layout-picker']")
	WebElement grid;

	@FindBy(xpath="//*[@class='a-color-state a-text-bold']")
	WebElement topElement;
	
	@FindBy(xpath="//*[@name='sort' and @id='sort']")
	WebElement sortDropdown;
	
	@FindBy(xpath="//*[@id='leftNav']//*[text()='Avg. Customer Review']")
	WebElement customerReview;
	
	@FindBy(xpath="//*[text()='4 Stars & Up']")
	WebElement fourStars;
	
	@FindBy(xpath="//*[text()='All']")
	WebElement All;
	
	public Testpract_page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void getTitle(WebDriver driver)
	{
		System.out.println(driver.getTitle());
	}
	
	public void getCategories(WebDriver driver) throws InterruptedException
	{
		System.out.println("Under shop by category");
		Actions act=new Actions(driver);
		act.moveToElement(shopbycategory).build().perform();
		Thread.sleep(5000);
		System.out.println("clicked on shop by categories");
		shopbycategory.click();
	}
	
	public void scrollview(WebDriver driver)
	{
		System.out.println("In the scroll method");
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",babyFashion);
		System.out.println("scroll bar scrolled");
		babyFashion.click();
	}
	
	public void clickmonths(WebDriver driver)
	{
		months.click();
		String value="18-24 Months";
		
		WebDriverWait wt= new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOf(grid));
		
		if(topElement.getText().equalsIgnoreCase(value))
		{
			grid.click();
		}
		else
		{
			System.out.println("page did not loaded successfully");
		}
	}
	
	public void babyPage(WebDriver driver)
	{
		System.out.println("Sorting via Newest Arrival");
		Select sel=new Select(sortDropdown);
		sel.selectByVisibleText("Newest Arrivals");

		WebDriverWait wt= new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOf(grid));
		System.out.println("Grid is visible");
		
	
	}
	
	public void sortByCustomerReview(WebDriver driver) throws InterruptedException
	{
		WebElement Last30days=driver.findElement(By.xpath("//*[text()='Last 30 days']"));
		try {
			
			System.out.println("Going to thread.sleep");
			Thread.sleep(4000);
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",fourStars);
			System.out.println("Scrolled to Customer Review screen");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
		System.out.println("click on 10% discount");		
		driver.findElement(By.xpath("//*[text()='10% Off or more']")).click();
		System.out.println("element clicked");
		
		/*WebDriverWait wsr = new WebDriverWait(driver, 10);		
		wsr.until(ExpectedConditions.visibilityOf(fourStars));
		System.out.println("Clicking on Four Stars");
		fourStars.click();*/	
	}
	
	public void getAll(WebDriver driver) throws InterruptedException
	{
		System.out.println("Clicking on All dropdown");
		driver.findElement(By.xpath("//*[text()='All']")).click();
		System.out.println("dropdown clicked");
		
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//*[@data-value='search-alias=aps']"));
		System.out.println(list.size());
		
		Iterator<WebElement> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}

