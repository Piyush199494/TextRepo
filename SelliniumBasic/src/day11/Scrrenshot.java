package day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrrenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot ts = (TakesScreenshot) driver;

		File file = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File(".\\screenshots\\google.jpg"));
		
		TakesScreenshot tScreenshot = (TakesScreenshot)driver;
		File file2 =tScreenshot .getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\screenshots\\google.jpg"));
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		
		 ts1.getScreenshotAs(OutputType.FILE);
				
		
		 		

	}
}