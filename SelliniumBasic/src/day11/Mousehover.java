package day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	static void rightclick(Actions act, WebElement option) {

	}

	static void MouseHover(Actions act, WebElement element) {
		act.moveToElement(element).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1000, 500));
		driver.get("https://www.globalsqa.com/");
		java.util.List<WebElement> menulist = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main menu list : - " + menulist.size());

//		for (int i = 0; i < menulist.size(); i++) {
//			System.out.println(i + "--" + menulist.get(i).getText());
//		}

		Actions act = new Actions(driver);
		// act.moveToElement(menulist.get(2)).perform();

		for (int i = 0; i < menulist.size(); i++) {
			
			System.out.println(i + "--" + menulist.get(i).getText());
			act.moveToElement(menulist.get(i)).perform();
			Thread.sleep(2000);
		}

		rightclick(act, menulist.get(1));
		// MouseHover(act, menulist.get(2));
	}

}
