package day6;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import sun.security.action.GetBooleanAction;

public class SuggChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		// get suggestion form google search page
		
		java.util.List<WebElement> suggList = driver
				.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>span"));
		// get suggestion count
		
		System.out.println("Suggestion Count is " + suggList.size());
		// specified element from suggestion list
		
		WebElement firstsuggestionElement = suggList.get(3);
		// printing first suggestion list
		
		System.out.println("first suggestion is : " + firstsuggestionElement.getText());
		// printing innertext of first suggestion
		
		System.out.println("first suggestion text is : " + firstsuggestionElement.getText());
		// getting all the suggestion one by one
		
		for (int i = 0; i < suggList.size(); i++) {
			System.out.println(suggList.get(i).getText());

	}
	   driver.quit();
      

	}

}
