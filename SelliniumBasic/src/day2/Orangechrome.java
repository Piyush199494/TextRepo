package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangechrome {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com");
		
		WebElement useridElement=driver.findElement(By.id("logoutLink"));
	}

}
