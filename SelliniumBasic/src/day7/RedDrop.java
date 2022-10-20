package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class RedDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		WebElement to = driver.findElement(By.cssSelector(".fl.search-box.clearfix>div>input#src"));
		to.sendKeys("Pune");

		driver.findElement(By.cssSelector("ul.autoFill.homeSearch>li[data-no='1']")).click();

		WebElement from = driver.findElement(By.cssSelector("div>input#dest"));
		from.sendKeys("Goa");
		driver.findElement(By.cssSelector("div>ul.autoFill.homeSearch>li[data-no='1']")).click();
		driver.findElement(By.cssSelector("div>table.rb-monthTable >tbody>tr>td.next")).click();
		driver.findElement(By.cssSelector("div#rb-calendar_onward_cal>table>tbody>tr:nth-of-type(5)>td:nth-of-type(4)"))
				.click();
		driver.findElement(By.id("search_btn")).click();
		driver.findElement(By.cssSelector("ul.dept-time>li:first-child>label[for='dtBefore 6 am'].custom-checkbox"))
				.click();
		driver.findElement(By.cssSelector("ul.list-chkbox>li:nth-of-type(3)>label.custom-checkbox")).click();
		List<WebElement> bus = driver.findElements(By.cssSelector("div.clearfix.row-one>div>div"));

//		for (int i = 0; i < bus.size(); i++) {
//			System.out.println(i + "-" + bus.get(i).getText());
//		}

		System.out.println("NAME OF BUS :-" + bus.get(0).getText());
		// System.out.println(bus.get(8).getText());

		WebElement price = driver
				.findElement(By.cssSelector("div.clearfix.row-one>div:nth-of-type(6)>div>div:last-child>span"));
		System.out.println("TICKET PRICE :- " + price.getText());
	}

}
