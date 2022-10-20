package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actichrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kk\\eclipse-workspace\\SelliniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameinputElement = driver.findElement(By.id("username"));
		usernameinputElement.sendKeys("Admin");
		WebElement userpasswordElement = driver.findElement(By.name("pwd"));
		userpasswordElement.sendKeys("manager");
		
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle ="actiTIME -  Enter Time-Track";
		System.out.println("actualTitle -"+ actualTitle);
		System.out.println("expectedTitle-" +expectedTitle);
		
		//validation will be fail
		
		
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("login valid");
		}else {
			System.out.println("login validation is fail");
		}
		driver.findElement(By.id("logoutLink")).click();
			
	}

}
