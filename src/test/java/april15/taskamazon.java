package april15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class taskamazon {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		WebElement AllDropDwon =(driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")));
           
	
          
          Actions action = new Actions(driver);
  		action.contextClick(AllDropDwon).build().perform();
	}

}
