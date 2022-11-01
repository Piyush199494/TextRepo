package advTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class DaProviderNewTest extends SeleniumUtility {

//	@Test(dataProvider = "getData")
//	public void Provider(String username, String password) {
//
//		System.out.println(username);
//		System.out.println(password);
//	}
	@Test(dataProvider = "getData")
	public void p2(String browser,String username, String password) {
		setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password, Keys.ENTER);
	
		driver.close();
	}
         @DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];

		data[0][0] = "chrome";

		data[0][1] = "admin";

		data[0][2] = "manager";

		data[1][0] = "Test@123";
		data[1][1] = "Piyush";

		data[1][2] = "Shekar";
		
		

		return data;

	}

}
