package april15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class weighclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); (implicit)
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until (ExpectedConditions.invisibilityOfElementLocated(By.xpath("//[text]class='Solutions'")));
		
		driver.findElement(By.xpath("//[text]class='Solutions'));
		
		driver.findElement(By.xpath("abc")).click();

	}

}
