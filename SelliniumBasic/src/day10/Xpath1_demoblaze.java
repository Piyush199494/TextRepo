package day10;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Xpath1_demoblaze {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 500));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		
		TakesScreenshot tS = (TakesScreenshot) driver;
		
	File f =	tS.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File(".\\screenshots\\google.png"));
	
		List<WebElement> phonElement = driver.findElements(By.xpath("//div[h4[a[text()='Sony xperia z5']]]/h5"));
		for (int i = 0; i < phonElement.size(); i++) {
			System.out.println(phonElement.get(i).getText());
		}
	}

}
