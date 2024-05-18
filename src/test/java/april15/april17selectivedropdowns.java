package april15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class april17selectivedropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver =new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Select skillDropDown = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
	
        //skillDropDown.selectByIndex(6);
		
		//skillDropDown.selectByValue("AutoCAD");
		
		skillDropDown.selectByVisibleText("Documentation");
		
		
	}

}
