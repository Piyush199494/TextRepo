package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example6Test {
	 @BeforeMethod
	  public void openBrowser() {
		  System.out.println("before Method -chrome browser opened and app url is entered");
		  
	  }@Test(priority = 1)
	  public void verifylogin() {
		  System.out.println("Priority 1-login sucessfully.........");
		  
	  }@AfterMethod
	  public void closeBrowser() {
		  System.out.println("After Method-Browser instance is closed");
		  
	  } @Test(priority = 3)
		  public void createTask() {
			  System.out.println("Priority 3-Task created sucessfully");
	}@Test(priority = 2)
	  public void deleteTask() {
		  System.out.println("Priority 2-Task created sucessfully");
	}
}

/*
 * Before every individual test before and after method is executed 
 * than again before test executed normal test and after test
 * 
 * test is executed as per priority*/
