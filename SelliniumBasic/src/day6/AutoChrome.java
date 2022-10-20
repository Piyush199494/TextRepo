package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class AutoChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		java.util.List<WebElement> suList = driver.findElements(By.cssSelector("ul>li.dropdown"));
		System.out.println("count of menu item : "+suList.size());
		for(int i = 0; i < suList.size();i++) {
			System.out.println(suList.get(i).getText());
		}
		
		WebElement suu1 = driver.findElement(By.cssSelector("ul>li>a[href*='Index']"));
		
		
		WebElement suu2 = driver.findElement(By.cssSelector("ul>li>a[href*='Register']"));
		WebElement suu3 = driver.findElement(By.cssSelector("ul>li>a[href*='http://practice.automationtesting.in']"));
		System.out.println(suu1.getText());
		System.out.println(suu2.getText());
		System.out.println(suu3.getText());
	}

}
