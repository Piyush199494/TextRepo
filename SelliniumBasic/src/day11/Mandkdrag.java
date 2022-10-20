package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mandkdrag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions act1 = new Actions(driver);
		List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target = driver.findElement(By.className(".ui-widget-content ui-state-default"));
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		act1.dragAndDrop(sourceElements.get(0), target).build().perform();
		
		act1.dragAndDrop(sourceElements.get(0), target).build().perform();
		Thread.sleep(1000);
		act1.dragAndDrop(sourceElements.get(1), target).build().perform();
		Thread.sleep(1000);
		act1.dragAndDrop(sourceElements.get(2), target).build().perform();

	}

}
