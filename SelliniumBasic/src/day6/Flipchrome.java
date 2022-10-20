package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Flipchrome {

	public static void main(String[] args) {
            
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		java.util.List<WebElement> list = driver.findElements(By.className("xtXmba"));
		System.out.println(list.size());
//		for(int i = 0 ; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//		}
	}

}
