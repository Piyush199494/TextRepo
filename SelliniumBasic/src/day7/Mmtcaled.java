package day7;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day4.Chrome;

public class Mmtcaled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("main.landingContainer>div:last-child>span.langCardClose")).click();

		driver.findElement(By.id("fromCity")).click();

		List<WebElement> list = driver.findElements(By.cssSelector("li.react-autosuggest__suggestion"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "-" + list.get(i).getText());
		}
		list.get(4).click();
		System.out.println("--------------");

		List<WebElement> list2 = driver.findElements(By.cssSelector("ul.react-autosuggest__suggestions-list>li"));
		System.out.println(list2.size());

		for (int i = 0; i < list2.size(); i++) {
			System.out.println(i + " - " + list2.get(i).getText());

		}

		list2.get(5).click();

		driver.findElement(By.id("#departure")).click();
//		driver.findElement(By.cssSelector(
//		"div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();
//		driver.findElement(By.cssSelector("div.appendBottom40>div.fsw>p>a.widgetSearchBtn")).click();

	}

}
