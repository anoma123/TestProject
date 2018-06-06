package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionTest {
	
	
	@Test
	public void setup()
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moon\\Downloads\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move= driver.findElement(By.id("twotabsearchtextbox"));
		
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
	}
	
	
	
	
	
	
	
	

}
