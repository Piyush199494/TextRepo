package day7;

import java.util.concurrent.TimeUnit;

import org.omg.DynamicAny.NameDynAnyPair;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMt2 {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver","executable\\chromedriver.exe");
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("main.landingContainer>div:last-child>span.langCardClose")).click();
		// identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		// select any date from next month
		driver.findElement(By.cssSelector(
				"div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();
	         
		driver.findElement(By.cssSelector("div.appendBottom40>div.fsw>p>a.widgetSearchBtn")).click();
	
	}

}
