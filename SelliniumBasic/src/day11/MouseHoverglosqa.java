package day11;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class MouseHoverglosqa {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 500));
		driver.get("https://www.globalsqa.com/");
		List<WebElement> list1 = driver.findElements(By.xpath("//div[div[ul[li[a[text()='Home']]]]]/div/ul/li"));
		System.out.println("Menu list - -> " + list1.size());

		Actions act1 = new Actions(driver);

//		for (int i = 0; i < list1.size(); i++) {
//
//			System.out.println(i + "--" + list1.get(i).getText());
//			Thread.sleep(4000);
//			act1.moveToElement(list1.get(i)).perform();
//			WebElement option = list1.get(i);
//		}

		//MouseHover(act1, list1.get(3));
		rightclick(act1, list1.get(1));
		//MouseHoverList(act1, list1);

	}

//	static void MouseHover(Actions act1, WebElement element) {
//		act1.moveToElement(element).perform();
//
//	}

	static void rightclick(Actions act1, WebElement list1) {
		System.out.println("Option name " +list1.getText());
		act1.moveToElement(list1).contextClick().perform();
	}

//	static void MouseHoverList(Actions act1, List<WebElement> list1) throws InterruptedException {
//
//		for (int i = 0; i < list1.size(); i++) {
//			System.out.println(i + "--" + list1.get(i).getText());
//		//	WebElement option = list1.get(i);
//			act1.moveToElement(list1.get(i)).perform();
//			Thread.sleep(1000);
//		}
//	}

}
