package day11;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import okio.Timeout;

public class ResuabelMethod {
	

	public static void main(String[] args) {

		setup("CHROME", "https://www.facebook.com/reg/");

	}

	public static void setup(String browser, String url) {
		WebDriver driver = null; 

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "executable\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", "executable\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("Title of site - > " + driver.getTitle());

	}

}
