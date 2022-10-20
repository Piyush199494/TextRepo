package day3;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step;

public class Actipratice3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		
		//Implicit wait syntax
		
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		cdriver.get("https://demo.actitime.com/login.do");
		
		// step1
		WebElement useridElement = cdriver.findElement(By.id("username"));
		useridElement.sendKeys("Admin");
		// step2
		WebElement userpassElement = cdriver.findElement(By.name("pwd"));
		userpassElement.sendKeys("manager");
		// step3
		WebElement logbutoonElement = cdriver.findElement(By.id("loginButton"));
		logbutoonElement.click();
		// step4 wait for 30 second
		
		//Thread.sleep(3000);
		//Step5
		WebElement outbuttonElement = cdriver.findElement(By.id("logoutLink"));
		outbuttonElement.click();
		
		//step6 validate homepage
		String expectedTitle ="actiTIME - Login";
		String actualTitle=cdriver.getTitle();
		System.out.println("Expected Title is :"+expectedTitle);
		System.out.println("actual Title is :"+actualTitle);
		
		//conditional wait
		WebDriverWait wait = new WebDriverWait(cdriver, 20);
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("login validation is pass");
		}else{
			System.out.println("login validation is fail");
			
		}
		
		//step7 login validation
		
		
		//cdriver.close();
	}

}

//open chromebrowser
//enter url
//enter user name as Admin
//enter password name as manager
//click on login button
//validate home page
//click on logout button validate login page



