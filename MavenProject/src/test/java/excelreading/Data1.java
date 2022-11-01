package excelreading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Data1 {
	@Test
	public void Excel_Data() throws IOException {
		FileInputStream file1 = new FileInputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
		Workbook work1 = new XSSFWorkbook(file1);
		int sheetcout = work1.getNumberOfSheets();
		System.out.println("count of sheets = " + sheetcout);

		for (int i = 0; i < sheetcout; i++) {
			System.out.println(i + "<--" + work1.getSheetName(i));
		}
		Sheet sheet1 = work1.getSheet("Sheet1");
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Row count = " + rowcount);
		Row row0 = sheet1.getRow(0);
		int cellcount = row0.getLastCellNum();
		System.out.println("Cell Count = " + cellcount);
		Cell cell1 = row0.getCell(2);
		System.out.println("Cell Value = " + cell1.getStringCellValue());

		for (int i = 0; i < cellcount; i++) {
			System.out.println(i + " <-- " + row0.getCell(i).getStringCellValue());
		}

		
		}
	}

