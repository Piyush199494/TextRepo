package day9;

import java.awt.Button;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import day4.Chrome;

public class X_pathred {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id ='src']")).sendKeys("Pune");
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		driver.findElement(By.xpath("//td[@class='next']")).click();
		driver.findElement(By.xpath("//tr[5]/td[6]")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		WebElement popElement = driver.findElement(By.xpath("//i[@class='icon icon-close']"));
		Thread.sleep(3000);
		popElement.click();
		driver.findElement(By.xpath("//label[@for='dtBefore 6 am']")).click();
		
		WebElement acElement = driver.findElement(By.xpath("//label[@for='bt_AC']"));
		Thread.sleep(3000);
		acElement.click();
		String busElement =driver.findElement(By.xpath("//div[@class='clearfix row-one']/div[1]")).getText();
		String pricElement=driver.findElement(By.xpath("//div[@class='fare d-block']")).getText();
		System.out.println(busElement);
		System.out.println(pricElement);
		driver.close();

	}

}
