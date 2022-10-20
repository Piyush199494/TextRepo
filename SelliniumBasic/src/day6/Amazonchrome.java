package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Amazonchrome {

	public static void main(String[] args) {
          
		System.setProperty("webdriver.chrome.driver","executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		java.util.List<WebElement> list =driver.findElements(By.cssSelector(".nav-fill>div>div>a.nav-a"));
		//System.out.println(list.size());
		for (int i = 0 ; i < list.size();i++) {
			System.out.println(i+" -- "+list.get(i).getText());
		}

		
		
		
		
		
	}
	
}
