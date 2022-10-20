package day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MandK1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 500));
		Thread.sleep(2000);
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstName.sendKeys("Piyush", Keys.chord(Keys.CONTROL, "a"));
//		firstName.sendKeys("Kailas",Keys.chord(Keys.CONTROL,"a"));
//		firstName.sendKeys(Keys.CONTROL, "c");
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"x"));
		Thread.sleep(3000);
		WebElement lastname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		//lastname.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}

}
