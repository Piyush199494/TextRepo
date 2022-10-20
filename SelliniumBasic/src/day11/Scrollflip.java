package day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollflip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		// driver.findElement(By.)
		WebElement page = driver.findElement(By.xpath("//body"));
		page.sendKeys(Keys.ESCAPE);

		// for scrolling
		for (int i = 0; i < 10; i++) {
			page.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1500);
            }
		page.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		Thread.sleep(1500);
		page.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		driver.navigate().refresh();
		
		
	}

}
