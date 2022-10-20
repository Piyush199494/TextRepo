package day2;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swagchrome {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","executable\\chromedriver.exe" );
       WebDriver driver =new ChromeDriver();
       driver.get("https://www.saucedemo.com/");
     WebElement useridElement =  driver.findElement(By.id("user-name"));
     useridElement.sendKeys("standard_user");
     
   WebElement userpassElement=  driver.findElement(By.id("password"));
   userpassElement.sendKeys("secret_sauce");
   
   driver.findElement(By.id("login-button")).click();
   
       
	}

}
