package excelreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Date2_create {
	@Test
	public void Excelupdate() throws IOException {
		FileInputStream file1 = new FileInputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
		Workbook workbook = new XSSFWorkbook(file1);
		Sheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.getRow(2);
		Cell cell = row.createCell(3);
		cell.setCellValue("Fail2");
		FileOutputStream fileOut = new FileOutputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		System.out.println("File Updated..........");

	}

	@Test
	public void Excelupdate1() throws IOException {
		FileInputStream file1 = new FileInputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
		Workbook workbook = new XSSFWorkbook(file1);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.createCell(2);
		cell.setCellValue("Passed2");
		FileOutputStream output1 = new FileOutputStream(".\\src\\main\\resources\\testdata\\AppTest.xlsx");
		workbook.write(output1);
		output1.close();
		System.out.println("File Updated........");
	}
}
