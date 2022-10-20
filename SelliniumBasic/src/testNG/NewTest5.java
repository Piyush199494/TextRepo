package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import day11.SeleniumUtility;

public class NewTest5 {
	@Test
	public void f() {

		SeleniumUtility sU = new SeleniumUtility();
		WebDriver driver = sU.setUp("chrome", "https://erail.in/");

//			SeleniumUtility utility = new SeleniumUtility();
//			WebDriver driver = utility.setUp("chrome", "https://demo.actitime.com/login.do");
//			System.out.println("Before login page title: " + driver.getTitle());
//			// validation using TestNG
//			// Assert.assertEquals(driver.getTitle(), "actiTIME - Login"); //or
//			Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either login page not opened or title got changed");
//
//			// identify the required element from the UI and perform required action 0-30
//			WebElement usernameInputField = driver.findElement(By.id("username"));
//			Assert.assertTrue(usernameInputField.isDisplayed());
//			Assert.assertTrue(usernameInputField.isEnabled(),"User name input field is not functional");
//			Assert.assertEquals(usernameInputField.getAttribute("placeholder"),"Username","Username input field placeholder name is changed");
//
//			// identify remember check box
//			WebElement checkBox = driver.findElement(By.name("remember"));
//			Assert.assertTrue(checkBox.isDisplayed());
//			Assert.assertTrue(checkBox.isEnabled(),"Checkbox is not functional");
//			Assert.assertFalse(checkBox.isSelected(),"Checkbox is by defualt selected");
//			
//			checkBox.click();
//			Assert.assertTrue(checkBox.isSelected(),"Checkbox is not functional");
//			driver.close();

	}
}
