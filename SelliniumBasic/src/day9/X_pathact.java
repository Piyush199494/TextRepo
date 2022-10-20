package day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day4.Chrome;

public class X_pathact {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[@class='addNewButton']/div[3]")).click();
		driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();

		WebElement list = driver.findElement(By.xpath("//tr[@class='selectCustomerRow'][1]/td/div/div/div[1]"));
		Thread.sleep(5000);
		list.click();
		List<WebElement> list2 =driver.findElements(By.xpath("//div[@class='searchItemList']/div[text()='- New Customer -']"));
		
		for(int i = 0 ;i<list2.size();i++) {
			System.out.println(i+"-"+list2.get(i).getText());
		}
		list2.get(0).click();
		 WebElement prDriver = driver.findElement(By.xpath("//td/input[@placeholder='Enter Customer Name']"));
            prDriver.sendKeys("Testing");
            prDriver.click();
            driver.findElement(By.xpath("//td/input[@placeholder='Enter Project Name']")).sendKeys("Validation");
	driver.findElement(By.xpath("//td[1]/input[@placeholder='Enter task name']")).sendKeys("Piyush");
	driver.findElement(By.xpath("//label[@class='components_checkboxContainer checkboxContainer']/span[@class='checkmark checkMark'][1]")).click();
	driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
	driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td[1]/div[1]")).click();
	}
	

}
