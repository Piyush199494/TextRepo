package excelreading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Data1awithSeliniumUtility extends SeleniumUtility {
	String appurl;
	String name;
	String pass;

	@Test
	public void ReadandUse() {
		appurl = ExcelUtility.getCellValue(".\\src\\main\\resources\\testdata\\AppTest.xlsx", "Sheet1", 1, 0);
		name = ExcelUtility.getCellValue(".\\src\\main\\resources\\testdata\\AppTest.xlsx", "Sheet1", 1, 1);

		pass = ExcelUtility.getCellValue(".\\src\\main\\resources\\testdata\\AppTest.xlsx", "Sheet1", 1, 2);

		System.out.println("URL = " + appurl);
		System.out.println("UserName = " + name);
		System.out.println("UserPassword = " + pass);

		WebDriver driver = setUp("chrome", appurl);
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Title of current Url = " + getCurrentTitleOfApplication());

		if (getCurrentTitleOfApplication().equals("actiTIME - Login")) {

			ExcelUtility.updateExcelContent(".\\src\\main\\resources\\testdata\\AppTest.xlsx", "Sheet1", 1, 3,
					"LoginSuccesful");

		} else {
			ExcelUtility.updateExcelContent(".\\src\\main\\resources\\testdata\\AppTest.xlsx", "Sheet1", 1, 3,
					"Loginfail");
		}

		Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Login");

		ExcelUtility.updateExcelContent(".\\src\\main\\resources\\testdata\\AppTest.xlsx", "Sheet1", 1, 3,
				"LoginSuccesful");
		driver.close();

	}

}
