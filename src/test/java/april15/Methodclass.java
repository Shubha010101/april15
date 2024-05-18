package april15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Methodclass {
	
	static WebDriver driver;
	
	@BeforeTest
	
	public static void BrowserSetup()
	
	{
	
	driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	}
       @Test
	public static void Log_in() throws Exception {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("user-name")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		
	}

	@Test
	public static void additems()
	{
		
		driver.findElement(By.id("Sauce Labs Backpack")).click();
		driver.findElement(By.id("Sauce Labs Bike Light")).click();
		driver.findElement(By.id("Sauce Labs Bolt T-Shirt")).click();
		driver.findElement(By.id("Test.allTheThings() T-Shirt (Red)")).click();
		
	}
	
	@Test
      public static void removeitems()
      
      {
		
      }
}
