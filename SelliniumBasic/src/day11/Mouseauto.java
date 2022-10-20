package day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseauto {

	public static void main(String[] args) {
         
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Actions act = new Actions(driver);
		WebElement userElement = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		userElement.sendKeys("Piyush");
		
		act.moveToElement(userElement).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build()
				.perform();

		WebElement lastElement = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		act.moveToElement(lastElement).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    
	
	}

}
