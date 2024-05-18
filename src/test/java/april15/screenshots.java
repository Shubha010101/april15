package april15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
      WebDriver driver;
      
      driver = new ChromeDriver();
      
      driver.get("https://www.flipkart.com/");
      
      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
      File Destination = new File("./Screenshot/application.png");
      
      FileUtils.copyFile(src, Destination);
    		  
      

	}

}
