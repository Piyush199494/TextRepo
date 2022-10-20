package day9;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day4.Chrome;

public class X_path1mmt {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Nagpur");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class ='react-autosuggest__suggestions-list']/li[1]")).click();
		driver.findElement(By.xpath("//input[@data-cy='toCity']")).sendKeys("goa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		driver.findElement(By.xpath("//label[@for='departure']/span")).click();
		driver.findElement(By.xpath("//div[2]/div[3]/div[3]/div[3]")).click();
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		driver.findElement(By.xpath("//div[@class='commonOverlay ']/span")).click();
		driver.findElement(By.xpath("//div/label[2]")).click();
		driver.findElement(By.xpath("//div[@class='filterWrapper']/div[4]//label/div/span[2]")).click();
		String flightElement = driver.findElement(By.xpath("//p[@class='boldFont blackText airlineName']")).getText();
		String flightpriceEleString = driver.findElement(By.xpath("//p[@class='blackText fontSize18 blackFont white-space-no-wrap']")).getText();
       
		System.out.println("Flight Name :- "+flightElement);
		System.out.println("Flight Price :- "+flightpriceEleString);
		
		
	}

}
