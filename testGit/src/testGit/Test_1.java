package testGit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_1 {

	@Test
	public void testjava()
	{
	
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\moon\\Downloads\\Chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//driver.get("https://www.amazon.com/");
		
		System.out.println("Test.java runs");
		//Assert.assertEquals(driver.getTitle(), "Amazone");
		//Actions a = new Actions(driver);
		//WebElement move= driver.findElement(By.id("twotabsearchtextbox"));
	    //move.sendKeys("Hello");
		
		
		
	}
		
	@Test
	public void test2java()
	{
		System.out.println("Testjava 2 runs");
	}
	

}
