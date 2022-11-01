package excelreading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class OpenActitime extends SeleniumUtility {
	String url;
	String name;
	String pass;
  @Test
  public void getData() {
	  System.out.println("hi");
	 url= ExcelUtility.getCellValue("C:\\Users\\kk\\eclipse-workspace\\MavenProject\\src\\main\\resources\\testdata\\AppTest.xlsx","Sheet1", 1, 0);
	name = ExcelUtility.getCellValue("C:\\Users\\kk\\eclipse-workspace\\MavenProject\\src\\main\\resources\\testdata\\AppTest.xlsx","Sheet1", 1, 1);
	pass = ExcelUtility.getCellValue("C:\\Users\\kk\\eclipse-workspace\\MavenProject\\src\\main\\resources\\testdata\\AppTest.xlsx","Sheet1", 1, 2);
	  
	  
  }
  @Test
  public void login() {
	WebDriver driver =  setUp("chrome", url);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	  if(getCurrentTitleOfApplication("actiTime - Enter Time-Track").equals("actiTime - Enter Time-Track")) {
		  ExcelUtility.updateExcelContent("C:\\Users\\kk\\eclipse-workspace\\MavenProject\\src\\main\\resources\\testdata\\AppTest.xlsx", "Sheet1", 1, 3,"Passed");
		  
	  }else {
		  ExcelUtility.updateExcelContent("C:\\Users\\kk\\eclipse-workspace\\MavenProject\\src\\main\\resources\\testdata\\AppTest.xlsx", "Sheet1", 1, 3,"Failed");
		  

	  }

	  Assert.assertEquals(getCurrentTitleOfApplication(), "actiTime - Enter Time-Track");
    //  ExcelUtility.updateExcelContent(".\\src\\test\\resources\\resources\\AppTest.xlsx", "Sheet1", 2, 3, "Fail");
	
  
  
  }
}
