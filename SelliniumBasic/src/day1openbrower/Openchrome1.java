package day1openbrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome1 {

	public static void main(String[] args) {
		//step 1.set path for driver executable
		//step 2. create an instance of required browser class
		//step 3. verify url
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kk\\eclipse-workspace\\SelliniumBasic\\executable\\chromedriver.exe ");
		
	WebDriver chromedriver = new ChromeDriver();
    chromedriver.get("https://www.youtube.com/");
//   String actualUrl  =chromedriver.getCurrentUrl();
//    String Title =chromedriver.getTitle();
//   System.out.println("actual Url "+actualUrl);
//    System.out.println("actual Title "+Title);
////    
//	String expectedUrl ="https://www.youtube.com/";
//	String expectedTitle = "YouTube";
////	
//	System.out.println("URL validation :"+actualUrl.equals(expectedUrl));
//	System.out.println("TITLE validation :"+Title.equals(expectedTitle));
//	
//     String pagesource=chromedriver.getPageSource();
//     
//     System.out.println("get page source leng :"+pagesource.length());
//     chromedriver.close();
//     System.out.println("page source content "+pagesource);
//	
//	
           
	}

}
