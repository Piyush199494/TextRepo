package jsscript;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript extends SeleniumUtility {
	@Test
	public void testCase1() {
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement element=driver.findElement(By.cssSelector(".buttonBlue"));
		//convert WebDriver instance into javascriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//write a code to perform click operation
		js.executeScript("arguments[0].click();", element);	
	}
	
	@Test
	public void testCase2() {
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		//convert WebDriver instance into javascriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//write a code to identify and perform click operation
		//finding the elemet by javascript and performing the action on it using javascript
		js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
	}
}
