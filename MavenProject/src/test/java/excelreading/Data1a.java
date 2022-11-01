package excelreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Data1a {


	@Test
	public void readsheetfile() throws IOException {

		FileInputStream file = new FileInputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		int sheetcount = workbook.getNumberOfSheets();
		System.out.println("sheetcount = " + sheetcount);

		Sheet sheet = workbook.getSheet("Sheet1");

		int rowcount = sheet.getLastRowNum();
		System.out.println("rowcount = " + rowcount);

		Row row = sheet.getRow(2);

		int cellcount = row.getLastCellNum();
		System.out.println("cellcount = " + cellcount);

		for (int i = 0; i < cellcount; i++) {
			Cell cell1 = row.getCell(i);

			switch (cell1.getCellType()) {
			case NUMERIC:
				System.out.println("cell data : " + row.getCell(i).getNumericCellValue());
				break;
			case STRING:
				System.out.println("cell data : " + row.getCell(i).getStringCellValue());
				break;
			case BOOLEAN:
				System.out.println("cell data : " + row.getCell(i).getBooleanCellValue());
				break;

			default:
				System.out.println("invalid cell data");
				break;
			}

			Cell cell = row.createCell(3);
			cell.setCellValue("Passed");

			// for saving the cellvalue we save the file and close the sheet

			FileOutputStream out = new FileOutputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
			workbook.write(out);

			out.close();
			Cell cell2 = row.createCell(3);
			cell.setCellValue("fail after passed");
			
			// logic for saving the file data;

			FileOutputStream out1 = new FileOutputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
			workbook.write(out1);
			out1.close();

		}

	}
}
