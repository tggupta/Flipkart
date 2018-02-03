package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Locators {
	
	WebDriver driver=null;
	
	public Locators(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*/a[@title='Electronics']/span")
	WebElement Firsttab;
	
	@FindBy(xpath="//*/a[@title='Appliances']/span")
	WebElement Secondtab;
	
	@FindBy(xpath="//*/input[@type='text' and @name='q']")
	WebElement Searchbox;
	
	@FindBy(xpath="//*/div[@class='_1vC4OE _2rQ-NK']")
	WebElement price;
	
	@FindBy(xpath="//*/div[@class='_3wU53n']")
	WebElement phonename;

}

