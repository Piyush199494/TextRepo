package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		SeleniumUtility sU = new SeleniumUtility();
//	    WebDriver driver=sU.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();

//		WebDriver driver = sU.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
//		driver.manage().window().setSize(new Dimension(1000, 500));
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		//driver.switchTo().alert().dismiss();
//		 driver.switchTo().alert().accept();

		WebDriver driver = sU.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
        driver.manage().window().setSize(new Dimension(1000, 500));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("pune");

		
		driver.switchTo().alert().dismiss();

		// driver.switchTo().alert().accept();

	}

}
