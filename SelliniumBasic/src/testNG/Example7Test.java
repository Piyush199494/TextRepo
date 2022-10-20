package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example7Test {
	
	@BeforeMethod
	public void enterAppUrl() {
		System.out.println("Before Method inset app url");
	}

	@BeforeTest
	public void openBrowser() {
		System.out.println("Before Test -chrome browser opened and app url is entered");

	}

	@AfterMethod
	public void logout() {
		System.out.println("After Method -logout from Url");
	}

	@Test(priority = 1)
	public void verifylogin() {
		System.out.println("Priority 1-login sucessfully.........");

	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("After Test-Browser instance is closed");

	}

	@Test(priority = 2)
	public void createTask() {
		System.out.println("Priority 2- Task created sucessfully");
	}

	@Test(priority = 3)
	public void deleteTask() {
		System.out.println("Priority 3 -Task created sucessfully");
	}

}
