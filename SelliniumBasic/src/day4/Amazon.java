package day4;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TCKind;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// tc-1
		driver.get("https://www.amazon.in");
		// tc-2
		driver.manage().window().maximize();
		// tc-3
		String title = driver.getTitle();
		// tc-4
		System.out.println("Title of site : " + title);
		// tc-5
		WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
		
		System.out.println("input field is valid or not "+searchElement.isDisplayed());
		System.out.println("input field is editable or not "+searchElement.isEnabled());
		
		
		searchElement.sendKeys("mobile");

		driver.findElement(By.id("nav-search-submit-button")).click();

		// tc-6
		String title1 = driver.getTitle();
		System.out.println("Title of current page 1 : " + title);
		
		
		// tc-7
		String title2 = driver.getTitle();
		System.out.println("Title  of current page 2 : " + title2);
		// tc-8

		if (title1.equals(title2)) {
			System.out.println("validation is true");
		} else {
			System.out.println("validation fail");
		}
		
		driver.navigate().back();
		//Thread.sleep(2000);
		driver.navigate().refresh();
		//Thread.sleep(2000); 
		
		// tc-9
	    driver.close();

	}

}
