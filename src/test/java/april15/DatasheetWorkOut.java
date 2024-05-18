package april15;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DatasheetWorkOut {

	public static void main(String[] args) throws Exception {	
		File src = new File ("./datasheet2.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		DataFormatter format = new DataFormatter();
		
		System.out.println(format.formatCellValue(sh.getRow(1).getCell(1)));
		System.out.println(format.formatCellValue(sh.getRow(2).getCell(1)));
		
		System.out.println(format.formatCellValue(sh.getRow(1).getCell(2)));
		System.out.println(format.formatCellValue(sh.getRow(2).getCell(2)));

	}

}
