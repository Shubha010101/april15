package april15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerttopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("// a[@href='#Textbox']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		String alertTxt = driver.switchTo().alert().getText();
		
		System.out.println(alertTxt);
		
		driver.switchTo().alert().sendKeys("Shubha");
		
		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		

	}

}
