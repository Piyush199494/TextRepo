package googlepagescripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestGoogleSearch extends SeleniumUtility {

	googlepages.GoogleSearchPage getGoogleSearchPage;

	@BeforeTest
	public void preCondition() {
		WebDriver driver = setUp("chrome", "https://demo.actitime.com/login.do");
		getGoogleSearchPage = new googlepages.GoogleSearchPage(driver);
	}
	@Test
	public void testSearchPage() {
		getGoogleSearchPage.searchText("trainee");
		getGoogleSearchPage.searchText("trainee");
		
		Assert.assertFalse(getCurrentTitleOfApplication("actiTIME -Enter Time-Track").equals("actiTIME -Enter Time-Track"),
				"Google search was not sucessfull");
	}
	@AfterTest
	public void cleanUUP() {
		cleanUp();
	}
}
