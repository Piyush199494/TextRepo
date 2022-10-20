package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.constant.DefaultValue;

public class Pass3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement useridElement = driver.findElement(By.name("username"));
		System.out.println("user name input field is valid or no : Ans " + useridElement.isDisplayed());
		System.out.println("user name input field is editable or no : Ans " + useridElement.isDisplayed());
		String defaultValue = useridElement.getAttribute("placeholder");
		System.out.println("user name input field default value : " + defaultValue);
		WebElement buttonElement = driver.findElement(By.tagName("button"));
		System.out.println("login button visible or not : ans " + buttonElement.isDisplayed());
		System.out.println("login button funtinal or not : ans " + buttonElement.isEnabled());
		String buttonName = buttonElement.getText();
		System.out.println("button name is " + buttonName);
		

//	      driver.close();

	}// TODO Auto-generated method stub

}
