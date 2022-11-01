package excelreading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Data4_celltype {
	@Test
	public void GetCellValue() throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		int sheetcount = workbook.getNumberOfSheets();

		System.out.println("sheetcount = " + sheetcount);
		for (int i = 0; i < sheetcount; i++) {
			System.out.println(workbook.getSheetName(i));
		}
		Sheet sheet = workbook.getSheet("Sheet1");

		int rowcount = sheet.getLastRowNum();

		System.out.println("rowcount = " + rowcount);

		Row row = sheet.getRow(2);
		int cellcount = row.getLastCellNum();
		System.out.println("CellCount = " + cellcount);

		for (int i = 0; i < cellcount; i++) {
			Cell cell = row.getCell(i);

			switch (cell.getCellType()) {
			case NUMERIC:
				System.out.println(i + " -cell data = " + cell.getNumericCellValue());
				break;
			case STRING:
				System.out.println(i + " -cell data = " + cell.getStringCellValue());
				break;
			case BOOLEAN:
				System.out.println(i + " - cell data = " + cell.getBooleanCellValue());
				break;

			default:
				System.out.println(i + " - Invalid cell data");
				break;
			}

		}

	}
}
