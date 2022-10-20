package day11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MandKMyntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1300, 500));
		driver.get("https://www.myntra.com/");
		WebElement bodyElement = driver.findElement(By.xpath("//body[@oncontextmenu='return!1']"));
		List<WebElement> list = driver.findElements(By.xpath("//div[div[div[a[@data-group='women']]]]/div"));

		Actions act = new Actions(driver);

		System.out.println("Menu list --> " + list.size());

		for(int i = 0 ; i < list.size();i++) {
			System.out.println(i+"--"+list.get(i).getText());
			
			act.moveToElement(list.get(i)).perform();
			Thread.sleep(2000);
						
		}

//		driver.navigate().refresh();
//		Thread.sleep(1000);
//
//		for (int i = 0; i < 10; i++) {
//			bodyElement.sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(3000);
//		}

	}

}
