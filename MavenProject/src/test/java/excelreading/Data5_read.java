package excelreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Data5_read {
	@Test
	public void ExcelRead() throws IOException {
		FileInputStream file1 = new FileInputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
		Workbook workbook = new XSSFWorkbook(file1);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		           
		
	}
}
