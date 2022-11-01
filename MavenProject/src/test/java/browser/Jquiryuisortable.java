package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Jquiryuisortable {

	static WebDriver driver;

	public static void main(String[] args) {
		
	

		SeleniumUtility s1 = new SeleniumUtility();
	    s1.setUp("chrome", "https://jqueryui.com/");
	    driver.manage().window().setSize(new Dimension(1000, 500));
		driver.findElement(By.xpath("//a[text() ='Sortable']")).click();

		driver.switchTo().frame(0);
	List<WebElement>list1=driver.findElements(By.xpath("//ul[@id='sortable']/li"));
	System.out.println(list1.size());

	for(int i = 0;i<list1.size();i++) {
		System.out.println(i+"  <--"+list1.get(i).getText());
	}
	}

}
