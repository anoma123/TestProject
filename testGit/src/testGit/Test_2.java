package testGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test_2 {
	
	@Test
	public void dropdown()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moon\\Downloads\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		 WebElement opt = (driver.findElement(By.id("dropdown-class-example")));
		
		// WebElement sel= opt.get
		
		
	}
	
	

}
