package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day4.Chrome;

public class Actichrome {

	public static void main(String[] args) throws InterruptedException {
          
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(500, 300));
		//driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	  	driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    
	    driver.findElement(By.cssSelector("a[href='/tasks/tasklist.do']")).click();
	    driver.findElement(By.className("downIcon")).click();
	   driver.findElement(By.className("createNewTasks")).click();
	   
	   Thread.sleep(2000);
	  // driver.findElement(By.cssSelector("div.emptySelection")).click();
	   driver.findElement(By.cssSelector("div.comboboxButton>div.selectedItem")).click();
	   
	    Thread.sleep(2000);

	  driver.findElement(By.cssSelector(".scrollableContainer>div.contentWrapper>div.searchItemList>.itemRow ")).click();
	  
	  driver.findElement(By.cssSelector("input.newCustomer")).sendKeys("Android Tester");
      driver.findElement(By.cssSelector("input.newProject")).sendKeys("TESTER");
      Thread.sleep(3000);
      driver.findElement(By.cssSelector("td.nameCell>.inputFieldWithPlaceholder")).sendKeys("testing");
      Thread.sleep(3000);
      driver.findElement(By.cssSelector("td.addToTTCell>label>span.checkmark")).click();
      
	  // driver.close();
	}
	
}
