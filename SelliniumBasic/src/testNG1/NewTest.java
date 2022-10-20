package testNG1;

import java.util.concurrent.TimeUnit;

import javax.xml.bind.ValidationEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javafx.scene.layout.Priority;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public class NewTest {
	@Test(priority = 3)
	public void RedBus() {
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
	    WebElement tostation  =	driver.findElement(By.xpath("//input[@id ='src']"));
	    tostation.sendKeys("Pune");
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		driver.findElement(By.xpath("//td[@class='next']")).click();
		driver.findElement(By.xpath("//tr[5]/td[6]")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		System.out.println("Before login page title: " + driver.getTitle());
		
		
		// validation using TestNG
				//Assert.assertEquals(driver.getTitle(), "Google");
				//or
//		Assert.assertEquals(driver.getTitle(), "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India", "Either login page not opened or title got changed");
//	if(driver.getTitle().equals("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India")){
//		System.out.println("Title Validation pass");
//	}else {
//		System.out.println("Fail");
		
	//	Assert.assertTrue(tostation.isDisplayed());
		Assert.assertTrue(tostation.isDisplayed(),"yes it is displaying");
		driver.close();
//	}


	}
}
