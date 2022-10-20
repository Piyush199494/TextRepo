package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mandkfb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		WebElement username = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Actions act1 = new Actions(driver);
		
		username.sendKeys("Piyush");
		act1.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act1.moveToElement(lastname).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		

	}

	
}
