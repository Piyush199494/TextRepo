package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actiprt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://demo.actitime.com/login.do");
		
		//a maximize browser window
		cdriver.manage().window().maximize();
		//b minimize
		cdriver.manage().window().setSize(new Dimension(500, 800));
		//c maximize
		cdriver.manage().window().maximize();
		// step1
		WebElement useridElement = cdriver.findElement(By.id("username"));
		useridElement.sendKeys("Admin");
		// step2
		WebElement userpassElement = cdriver.findElement(By.name("pwd"));
		userpassElement.sendKeys("manager");
		// step3
		WebElement logbutoonElement = cdriver.findElement(By.id("loginButton"));
		logbutoonElement.click();
		// step4
		// wait for 30 second
		
		Thread.sleep(3000);
		//Step5
		WebElement outbuttonElement = cdriver.findElement(By.id("logoutLink"));
		outbuttonElement.click();
		
		//step6 validate homepage
		String expectedTitle ="actiTIME - Login";
		
		String actualTitle=cdriver.getTitle();
		System.out.println("Expected Title is :"+expectedTitle);
		System.out.println("actual Title is :"+actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("login validation is pass");
		}else{
			System.out.println("login validation is fail");
			

		}
		
	}
	}


