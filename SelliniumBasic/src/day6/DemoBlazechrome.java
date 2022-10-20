package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class DemoBlazechrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		java.util.List<WebElement> phonElement = driver.findElements(By.cssSelector("div>.card-title"));
		
		java.util.List<WebElement> phonpriElements = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		
		for (int i = 0; i < phonElement.size(); i++) {
			System.out.println(phonElement.get(i).getText() + "  -- " + phonpriElements.get(i).getText());
		}
	}

}
