package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("loginButton")).click();
		WebElement errmssElement = driver.findElement(By.cssSelector(".errormsg"));
		Point locatPoint = errmssElement.getLocation();
 
		int errmasx = locatPoint.getX();
		int errmasy = locatPoint.getY();
		System.out.println("location of error message in x direction :-"+errmasx);
		System.out.println("location of error message in y direction :-"+errmasy);
		
		System.out.println("---------------------");
		
		WebElement userElement = driver.findElement(By.id("username"));
		Point locatuserPoint = userElement.getLocation();
		int userx = locatuserPoint.getX();
		int usery = locatuserPoint.getY();
		System.out.println("location of usernamefield in x direction :-"+userx);
		System.out.println("location of usernamefield in y direction :-"+usery);
		int passy =driver.findElement(By.name("pwd")).getLocation().getY();
		System.out.println("validate usernamefield is above passwordfield  :-"+(usery < passy));
        System.out.println("validate error message is displaying username  :-" +(errmasy < usery));
	}

}
