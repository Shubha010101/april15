package april15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata {

	public static void main(String[] args) throws Exception {
		
		readXpath();
		
		

	}
	
	public static void readXpath() throws Exception
	{
		File src = new File("./datasheet.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		DataFormatter format = new DataFormatter();
		
		System.out.println(format.formatCellValue(sh.getRow(1).getCell(1)));
		System.out.println(format.formatCellValue(sh.getRow(2).getCell(1)));
		
		System.out.println(format.formatCellValue(sh.getRow(1).getCell(2)));
		System.out.println(format.formatCellValue(sh.getRow(2).getCell(2)));
		
		System.out.println(format.formatCellValue(sh.getRow(3).getCell(1)));
		System.out.println(format.formatCellValue(sh.getRow(4).getCell(1)));
		
		System.out.println(format.formatCellValue(sh.getRow(3).getCell(2)));
		System.out.println(format.formatCellValue(sh.getRow(4).getCell(2)));
		
		
	}

}
