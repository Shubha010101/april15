package april15;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseovering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		Actions action = new Actions(driver);
		
		WebElement x = driver.findElement(By.xpath("//a[@data-group='women']"));
		action.moveToElement(x).build().perform();
		

	}

}
