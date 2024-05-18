package april15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	public static void main(String[]args) throws Exception
	{ 
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath(ReadXpath("FirstName"))).sendKeys(ReadData("FirstName"));
		
		driver.findElement(By.xpath(ReadXpath("LastName"))).sendKeys(ReadData("LastName"));
		
	    driver.findElement(By.xpath(ReadXpath("Phone"))).sendKeys(ReadData("Phone"));
	    
	    driver.findElement(By.xpath(ReadXpath("Email"))).sendKeys(ReadData("Email"));

	}

	public static String ReadXpath(String FieldName) throws Exception {

		File src = new File("./datasheet2.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("Sheet1");

		DataFormatter format = new DataFormatter();

		for (int i = 1; i < 6; i = i + 1) {

			if (format.formatCellValue(sh.getRow(i).getCell(0)).equals(FieldName))
			{
				return format.formatCellValue(sh.getRow(i).getCell(1));

			}
		}
		return "";

	}public static String ReadData(String FieldName) throws Exception {

		File src = new File("./datasheet2.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("Sheet1");

		DataFormatter format = new DataFormatter();

		for (int i = 1; i < 6; i = i + 1) {

			if (format.formatCellValue(sh.getRow(i).getCell(0)).equals(FieldName))
			{
				return format.formatCellValue(sh.getRow(i).getCell(2));

			}
		}
		return "";

	}
}