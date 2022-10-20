package day11;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;



import java.io.IOException;



public class MandKauto1 {

	public static void main(String[] args) throws InterruptedException, IOException   {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 500));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement userElement = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement lastElement = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		userElement.sendKeys("Piyush");
		
		Actions act1 = new Actions(driver);
		//act1.moveToElement(userElement).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act1.moveToElement(userElement).doubleClick().keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
		
		//act1.moveToElement(lastElement).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    act1.moveToElement(lastElement).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    Thread.sleep(3000);
	    driver.navigate().to("https://www.google.com");
	    TakesScreenshot tS = (TakesScreenshot) driver;
	    
//	    tS.getScreenshotAs(OutputType.FILE);
//	   // FileUtils .copyFile(file, new Files(".\\screenshots\\google1.jpg"));
//	    FileUtils.copyFile(file,  new File(".\\screenshots\\google1.jpg"));
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;

		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\screenshots\\google1.jpg"));

	}


	}



