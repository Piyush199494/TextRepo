package browser;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.omg.IOP.TaggedComponentHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility sU = new SeleniumUtility();
		WebDriver driver = sU.setUp("chrome", "https://erail.in/");
		String s1 = driver.getWindowHandle();

		System.out.println("Handle of erail -> " + s1);
		WebElement k1 = driver.findElement(By.xpath("//a[text()='eCatering']"));
		k1.click();
		Set<String> s2 = driver.getWindowHandles();
		System.out.println("All handels -> " + s2);

		s2.remove(s1);
		System.out.println(s2);
		Iterator<String> itr = s2.iterator();
		String s3 = itr.next();

		// driver.switchTo().window(s2.iterator().next());

//		
		System.out.println("Handle of ecatering-> " + s3);
		driver.switchTo().window(s3);
		driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']")).sendKeys("12627");
		driver.findElement(By.xpath("//div[@class='w-full']/button")).click();
		driver.findElement(By.xpath("//input[@placeholder='Boarding Date']")).click();
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.END).sendKeys(Keys.END).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@placeholder='Boarding Station']")).click();
		act1.sendKeys("d", "Keys.ENTER").build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() ='FIND FOOD']")).click();

		List<WebElement> list1 = driver
				.findElements(By.xpath("//div[@class='flex flex-col']/div/div/div[1]/div[3]/span[2]"));
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='flex flex-col']/div/div/div[1]/div[1]"));

//		Iterator<WebElement> itr1 = list2.iterator();
//		WebElement e2 = itr1.next();
//		e2.getText();

		for (WebElement e : list1) {
			for(WebElement e3 : list2) {
				
				System.out.println(e3.getText() + " --->" + e.getText());
			//System.out.println(e2.getText() + " --->" + e.getText());
//	    WebElement l1= driver.findElement(By.xpath("//small[@class='text-gray-60 text-base tracking-wide']"));
//	      System.out.println();   l1.getText();
			// List<WebElement> list2= driver.findElements(By.xpath("//div[@class='flex
			// flex-col']/div/div/div[1]/div[3]/span[2]"));

		

	  }
				
			}

	}
}


