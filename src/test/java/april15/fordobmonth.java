package april15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fordobmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver =new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Select DateOfBirthDropDown = new Select (driver.findElement (By.xpath("//select[@placeholder='Month']")));

		DateOfBirthDropDown.selectByIndex(6);
				DateOfBirthDropDown.selectByValue("April");
				DateOfBirthDropDown.selectByVisibleText("July");
				

	}

}
