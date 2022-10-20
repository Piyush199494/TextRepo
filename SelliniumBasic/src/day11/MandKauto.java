package day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MandKauto {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement userElement = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		userElement.sendKeys("Piyush",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		//userElement.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		
		WebElement lastElement = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastElement.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		lastElement.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Gadge Nagar Amravati");

	
	

	}

}