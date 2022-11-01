package browser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bsh.commands.dir;
import utilities.SeleniumUtility;

public class Etrainwindow {

	public static void main(String[] args) {
		SeleniumUtility sU = new SeleniumUtility();
		WebDriver driver = sU.setUp("chrome", "https://etrain.info/in");
		String homepage = driver.getWindowHandle();
		System.out.println("parent web handle -> "+homepage);
		driver.findElement(By.xpath("//i[@class='icon-linkedin']")).click();

		Set<String> allhandes = driver.getWindowHandles();
		System.out.println("Parent and Child window hangle -> "+allhandes);
		allhandes.remove(homepage);
		System.out.println(allhandes);
		
		//logic
		
		Iterator<String> itr = allhandes.iterator();
		String childString = itr.next();
		driver.switchTo().window(childString);
//               or..........
//		driver.switchTo().window(allhandes.iterator().next());
	    
		System.out.println("Title of child site -> "+driver.getTitle());
		System.out.println("Url od child site -> "+driver.getCurrentUrl());
//		
		driver.close();
		driver.switchTo().window(homepage);
		System.err.println("Title of Parent site -> "+driver.getTitle());
		System.out.println("Url  of Parent site ->  "+driver.getCurrentUrl());
		driver.close();
		

	}

}
