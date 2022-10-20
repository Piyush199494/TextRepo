package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerchrome {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kk\\eclipse-workspace\\SelliniumBasic\\executable\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	 
	 
	WebElement userid= driver.findElement(By.name("username"));
	userid.clear();
	userid.sendKeys("piyush");
	userid.clear();
	userid.sendKeys("admin");
	
	WebElement userpass =driver.findElement(By.id("password"));
	userpass.clear();
	userpass.sendKeys("Test@123");
	
	WebElement button =driver.findElement(By.tagName("button"));
	button.click();
	
	  
	}

}
