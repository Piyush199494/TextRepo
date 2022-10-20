package day1openbrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class generic11 {

	public static void main(String[] args) {
		//generic way to open browser
//step 1- System.setProperty(key,value0
		//step 2 -object creation
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kk\\eclipse-workspace\\SelliniumBasic\\executable\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     System.setProperty("webdriver.ie.driver",
	    		 "C:\\Users\\kk\\eclipse-workspace\\SelliniumBasic\\executable\\IEDriverServer.exe");
	  //  WebDriver iedriver = new InternetExplorerDriver();
	}

}
