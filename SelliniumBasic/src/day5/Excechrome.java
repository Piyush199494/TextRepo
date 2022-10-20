package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excechrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demosite.executeautomation.com");
		WebElement useridElement = driver.findElement(By.name("UserName"));
		useridElement.sendKeys("execution");
		WebElement userpassElement = driver.findElement(By.name("Password"));
		userpassElement.sendKeys("admin");

		driver.findElement(By.cssSelector("input[name='Login']")).click();
		//Thread.sleep(2000);
		driver.close();
	}

}
