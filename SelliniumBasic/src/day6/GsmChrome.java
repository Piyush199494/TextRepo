package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class GsmChrome {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(3000, 5000));

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		java.util.List<WebElement> suggmobileList = driver.findElements(By.cssSelector("ul>li>a[href*='phone']"));
		System.out.println("count of phone titles : " + suggmobileList.size());
		// System.out.println(suggmobileList.get(4).getText());
//		for (int i = 0; i < suggmobileList.size(); i++) {
//			System.out.println(suggmobileList.get(i).getText());
//
//		}
//		System.out.println("let's see samsung mobile phones ");
//		driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
//		java.util.List<WebElement> mobileList = driver.findElements(By.cssSelector("ul>li>a[href]>strong"));
//		System.out.println("NO of mobile phone avaliable on page 1 : " + mobileList.size());
//
//		for (int i = 0; i < mobileList.size(); i++) {
//			System.out.println(i + "-->" + mobileList.get(i).getText());
//		}
//		driver.quit();

	}

}
