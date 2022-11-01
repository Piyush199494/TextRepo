package browser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

import utilities.SeleniumUtility;

public class Frame {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SeleniumUtility sU = new SeleniumUtility();
		driver = sU.setUp("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text() ='Sortable']")).click();

		WebDriver d3 = driver.switchTo().frame(0);

		Actions act1 = new Actions(driver);

		WebElement d1 = driver.findElement(By.xpath("//ul[@id='sortable']/li"));

		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@id='sortable']/li"));

		for(int i = 0;i<list1.size();i++) {
			System.out.println(i+"  <--"+list1.get(i).getText());
			
			act1.click().clickAndHold().moveToElement(d1).build().perform();
            Thread.sleep(2000);
            
		}
		
		for (WebElement e : list1) {
			act1.click(e).clickAndHold(e).moveToElement(d1).build().perform();
			Thread.sleep(2000);
		}
		
//		

//   array[] l1 =list1
//   
//    act1.click(d).clickAndHold(d).moveToElement(d1).perform();

		// System.out.println(list1.size());

//	for(int i = 0;i<list1.size();i++) {
//		System.out.println(i+"  <--"+list1.get(i));
//	}

	}

//	driver.findElement(By.xpath("//label[@for=\"radio-1\"]")).click();
//	driver.switchTo().defaultContent();
//	driver.findElement(By.xpath("//h2[@class=\"logo\"]")).click();

}
