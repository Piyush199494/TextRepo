package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.IREM;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import sun.nio.cs.ext.ISCII91;

public class CriChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.cricbuzz.com");
		
		String titleDriver = driver.getTitle();
		
		System.out.println("actual title --> "+titleDriver);
		String expectedtitle = "Live Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com";
		
		
		System.out.println("-----------");
		if(expectedtitle.equals(titleDriver)) {
			System.out.println("expected title is same as actual title");
		}else {
			System.out.println("expected title is not same as actul title");
		}
		
		System.out.println("----------");
		
		
		java.util.List<WebElement> list = driver.findElements(By.className("cb-hm-mnu-itm"));
		java.util.List<WebElement> list1 = driver.findElements(By.cssSelector("nav>a.cb-mat-mnu-itm"));

		System.out.println("Matches lineup for near future : " + list1.size());
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + "--->" + list1.get(i).getText());
		}
		System.out.println("----------------------------------------");
		
		System.out.println("Count of web item " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "--->" + list.get(i).getText());
		}
		driver.quit();

	}

}
