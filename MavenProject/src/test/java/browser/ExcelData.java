package browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
  @Test
  public void f() throws IOException {
	  System.out.println("hi");
	  
	  FileInputStream file1 = new FileInputStream("C:\\Users\\kk\\eclipse-workspace\\MavenProject\\src\\main\\resources\\testdata\\AppTest.xlsx");
	  Workbook workbook = new XSSFWorkbook(file1);
	int sheetcount=  workbook.getNumberOfSheets();
	System.out.println(sheetcount);
  }
}
