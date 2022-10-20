package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Vtichrome {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
   WebDriver cDriver =new ChromeDriver();
   cDriver.get("https://demo.vtiger.com/vtigercrm/index.php");
   //step1
  WebElement useridElement = cDriver.findElement(By.id("username"));
  useridElement.clear();
  //step2
 WebElement userpassElement= cDriver.findElement(By.id("password"));
 userpassElement.clear();
 Thread.sleep(2000);
 //step3
 useridElement.sendKeys("admin");
 userpassElement.sendKeys("Test@123");
 //step4
 WebElement buttonElement=cDriver.findElement(By.tagName("button"));
 buttonElement.click();
 cDriver.close();
	}

}
