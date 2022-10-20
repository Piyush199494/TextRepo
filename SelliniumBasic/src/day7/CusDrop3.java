package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

import java.util.List;
public class CusDrop3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		driver.findElement(By.id("bsd1-button")).click();
		List<WebElement> countryList = driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a.dropdown-item"));
		
		System.out.println("no of countrys in list :-"+countryList.size());
		
		for(int  i = 0 ; i <countryList.size();i++ ) {
			System.out.println(i +"-"+ countryList.get(i).getText());
		}
		
		countryList.get(252).click();
		driver.findElement(By.id("bsd3-button")).click();
	List<WebElement> list2=	driver.findElements(By.cssSelector("div#bsd3-container>div.dropdown-menu.show>div>a.dropdown-item"));
		System.out.println("Count of fruits in list :- "+list2.size());
		
		for(int i = 0; i< list2.size() ; i++) {
			System.out.println(i+"  <--- "+list2.get(i).getText());
		}
           list2.get(4).click();
	}

}
