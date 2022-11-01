package excelreading;

import java.io.FileInputStream;
import java.io.IOException;

import javax.sql.rowset.RowSetWarning;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Data3 {
	@Test
	public void ReadandUse() throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		int sheetcout = workbook.getNumberOfSheets();
		// to find out the number of sheets in excel file;
		System.out.println("Sheet count = " + sheetcout);
		for (int i = 0; i < sheetcout; i++) {
			System.out.println(i + " <--- " + workbook.getSheetName(i));
		}
		Sheet sheet = workbook.getSheet("Sheet1");
		// to find out the number of rows;
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row Count = " + rowcount);
		// to get the particular row
		Row row = sheet.getRow(0);
		int cellcount = row.getLastCellNum();
		// to get the number of column in particular row
		System.out.println("cell count = " + cellcount);
		Cell cell = row.getCell(2);
		
		System.out.println("Get Cell value >" + cell.getStringCellValue());
		for (int i = 0; i < cellcount; i++) {
			System.out.println(i + " <--- " + row.getCell(i).getStringCellValue());
		}

	}
}
