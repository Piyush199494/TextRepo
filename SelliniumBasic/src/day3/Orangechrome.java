package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangechrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      
	     // Thread.sleep(3000);
	    //  driver.manage().window().maximize();
	     WebElement useridElement= driver.findElement(By.name("username"));
	     useridElement.sendKeys("piyush");
//	      Thread.sleep(2000);
//	      driver.close();
	
	
	}
	}