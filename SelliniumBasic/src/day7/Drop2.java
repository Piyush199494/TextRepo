package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");

		WebElement listElement = driver.findElement(By.id("multiselect1"));
		// select tag is written in dom
		Select countrySelect = new Select(listElement);

		System.out.println("is dropdown multi select :- " + countrySelect.isMultiple());
		
		List<WebElement> getname = countrySelect.getOptions();

		for (int i = 0; i < getname.size(); i++) {
			System.out.println(i + "-count of country  :- " + getname.get(i).getText());
		}
            countrySelect.selectByIndex(0);
            countrySelect .selectByIndex(3);
            countrySelect.selectByIndex(1);
            
          List<WebElement> selectall = countrySelect.getAllSelectedOptions();
          System.out.println("selected car optio :-"+selectall.size());
          
         
          for(int i = 0;i<selectall.size();i++) {
        	  System.out.println(i+"-"+selectall.get(i).getText());
          }
		
	}

}
