package browser;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.SeleniumUtility;

public class Erailperfect {

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

		System.out.println("Handle of ecatering-> " + s3);
		driver.switchTo().window(s3);
		driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']")).sendKeys("12627");
		driver.findElement(By.xpath("//div[@class='w-full']/button")).click();
		driver.findElement(By.xpath("//input[@placeholder='Boarding Date']")).click();
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.END).sendKeys(Keys.END).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		WebElement board1 = driver.findElement(By.xpath("//select[@placeholder='Boarding Station']"));
		//logic
		
		Select bo1 = new Select(board1);
		bo1.selectByValue("DMM");

		// act1.sendKeys("d", "Keys.ENTER").build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() ='FIND FOOD']")).click();
		List<WebElement> list1 = driver
				.findElements(By.xpath("//div[@class='flex flex-col']/div/div/div[1]/div[3]/span[2]"));
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='flex flex-col']/div/div/div[1]/div[1]"));
		System.out.println("Count of Restaurant on each station -- ");

		for (WebElement e : list1) {
			for (WebElement e3 : list2) {

				System.out.println(e3.getText() + " --->" + e.getText());
				System.out.println("-----------");
			}
		}

		driver.close();
		driver.switchTo().window(s1);
		WebElement w1 = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		w1.click();
		w1.sendKeys("pune", Keys.ENTER);
		WebElement w2 = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		w2.click();
		w2.sendKeys("Mumbai", Keys.ENTER);
		WebElement w3 = driver.findElement(By.xpath("//td[@id='tdDateFromTo']/input[@type='button']"));
		w3.click();
		WebElement w4 = driver.findElement(By.xpath("//tr/td[2]//tr[6]/td[4]"));
		w4.click();
		List<WebElement> li1 = driver.findElements(By.xpath("//tr[@onmouseout='HideCalendar()']/td[2]"));

		System.out.println("Count of train :- " + li1.size());

		for (WebElement trainname : li1) {
			System.out.println(trainname.getText());
		}

		driver.close();
	}
}