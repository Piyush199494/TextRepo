package day1openbrower;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	public static void main(String[] args) {
          //step 1-using system .setproperty(key,value) set to path for chromeDriver.exe
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kk\\eclipse-workspace\\SelliniumBasic\\executable\\chromedriver.exe");
		//step 2 - create an instance of chrome driver class
		ChromeDriver cdriver = new ChromeDriver();
	  //cdriver.close();
	}

}
