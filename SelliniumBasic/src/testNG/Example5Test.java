package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example5Test {
  @BeforeTest
  public void openBrowser() {
	  System.out.println("chrome browser opened and app url is entered");
	  
  }@Test(priority = 1)
  public void verifylogin() {
	  System.out.println("login sucessfully.........");
	  
  }@AfterTest
  public void closeBrowser() {
	  System.out.println("Browser instance is closed");
	  
  } @Test(priority = 2)
	  public void createTask() {
		  System.out.println("Task created sucessfully");
}
  }
