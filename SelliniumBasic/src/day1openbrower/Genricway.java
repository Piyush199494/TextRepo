package day1openbrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genricway {

	public static void main(String[] args) {
         //step1 set path for driver executable
		
		//step2 -create and instance of require browser class
		//enter the application url
		//driver.get("https://www.youtube.com/");
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kk\\eclipse-workspace\\SelliniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         
		driver . get("https://demo.actitime.com/login.do");
		
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle(); 
		
		
		
		String expectedUrl = "https://demo.actitime.com/login.do";
		String expectedTitle = "actiTIME - Login";
		
		System.out.println("actual Url===== "+actualUrl);
		System.out.println("expected Title ==="+actualTitle);
		
		System.out.println("_____________________");
		
		System.out.println("Url VALIDATION : "+actualUrl.equals(expectedUrl));
		System.out.println("TITLE VALIDATION :"+actualTitle.equals(expectedTitle));
		String pageSource=driver.getPageSource();
		System.out.println("Page source length "+ pageSource.length());
		System.out.println("Page source content"+ pageSource);
		
		//driver.close();
		
		
		
	    
		  
		
	}  

}
