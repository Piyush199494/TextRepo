package browser;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataRead {
  @Test
  public void readSheetDetail() {
	  FileInputStream fis1 =new FileInputStream("C:\\Users\\kk\\eclipse-workspace\\MavenProject\\src\\main\\resources\\testdata\\AppTest.xlsx");
			  Workbook workbook = new XSSFWorkbook(fis1);
			 int sheetcout =  workbook.getNumberOfSheets();
			 System.out.println(sheetcout);
	  
  }
}
