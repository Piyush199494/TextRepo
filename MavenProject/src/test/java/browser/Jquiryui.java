package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Jquiryui {
        static WebDriver driver;
	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		
		
	 driver =s1.setUp("chrome", "https://jqueryui.com/");
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//li[a[text()='Checkboxradio']]")).click();
	 driver.switchTo().frame(0);
	 // WebElement frame1 =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	// driver.switchTo().frame(frame1);
	 driver.findElement(By.xpath("//label[@for='radio-1']")).click();
	 driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("//h2[@class='logo']")).click();
		

	}

}
