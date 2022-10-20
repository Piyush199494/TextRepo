package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.scene.paint.GradientUtils.Point;

public class Cssvalidation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement buttonElement = driver.findElement(By.cssSelector("button[type='submit']"));

		System.out.println(buttonElement.getCssValue("color"));
		System.out.println(buttonElement.getCssValue("font-size"));
		System.out.println(buttonElement.getCssValue("background-image"));

		WebElement button2eElement = driver.findElement(By.cssSelector(".forgotPasswordLink"));
		System.out.println(button2eElement.getCssValue("color"));
		System.out.println(button2eElement.getCssValue("font-family"));
		driver.findElement(By.id("loginButton")).click();

		WebElement errElement =driver.findElement(By.cssSelector(".errormsg"));
		System.out.println(errElement.getCssValue("color"));
		org.openqa.selenium.Point loactionoferrPoint = errElement.getLocation();
		int errx = loactionoferrPoint.getX();
		int erry = loactionoferrPoint.getY();
		System.out.println(errx);
		System.out.println(erry);
	}

}
