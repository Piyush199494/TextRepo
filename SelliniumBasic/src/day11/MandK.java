package day11;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MandK {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 500));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to enter required application URL use get() of WebDriver interface
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//identify first name input field
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//type first name as admin and use ctrl+a
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));//type admin and select all
		
		//in first name field use ctrl+c
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"c"));///copy the content
		//in last name field use ctrl+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
					.sendKeys(Keys.chord(Keys.CONTROL,"v"));//paste the first name in the last name field
  
	}

}
