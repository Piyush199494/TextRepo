package project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import googlepages.GoogleSearchPage;

public class code {
	GoogleSearchPage getGoogleSearchPage;
	@BeforeTest
	public void preconditon() {
		WebDriver driver = setUp("chrome", "https://www.google.com");
		getGoogleSearchPage = new GoogleSearchPage(driver);
	}
	@Test
	public void TestSearchPage() {
		
        getGoogleSearchPage.searchText("Selenium Interview Question");
        Assert.assertTrue(getCurrentUrlOfApplication().contains("Selenium Interview Question"),"Google search was not sucessful" );
	}
	@AfterTest
	public void cleanUP() {
	       cleanUp();
	}
	// Initialization current page using page factory
		public GoogleSearchPage(WebDriver driver) {
			PageFactory.initElements(driver, this);		
		}
		
		@FindBy(name = "q")
		private WebElement searchInputFieldElement;
		
		public void searchText(String Text) {
			typeInput(searchInputFieldElement, Text);
			getActiveElementFromUI().sendKeys(Keys.ENTER);
		}
}
