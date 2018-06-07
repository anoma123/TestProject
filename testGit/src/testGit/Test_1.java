package testGit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\moon\\Downloads\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000L);
		
		driver.get("https://www.amazon.com/");
		
		System.out.println("Test.java runs");
		Assert.assertEquals(driver.getTitle(), "amazone");
		//Actions a = new Actions(driver);
		//WebElement move= driver.findElement(By.id("twotabsearchtextbox"));
	    //move.sendKeys("Hello");
		
	}

}
