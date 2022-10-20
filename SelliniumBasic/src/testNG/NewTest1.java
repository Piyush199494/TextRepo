package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import day11.SeleniumUtility;

public class NewTest1 {
	
  public void testcase1() {
		System.err.println("hello testNG 1");
	  
  }   
	 public void testcase6() {
			System.err.println("hello testNG 6");
		  
	  }@Test
	 public void testcase2() {
			System.err.println("hello testNG 2");
			testcase1();
		  
	  }@Test
	 public void testcase3() {
		  
		  SeleniumUtility sU = new SeleniumUtility();
			WebDriver driver = sU.setUp("chrome", "https://erail.in/");
		  testcase6();
			System.err.println("hello testNG 3");
			
		  
	  }
	 
  
}
