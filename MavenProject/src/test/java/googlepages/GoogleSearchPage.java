package googlepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class GoogleSearchPage extends SeleniumUtility {

	// Initialize current page using page factory

	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement searchInputField;
	@FindBy(name = "pwd")
	private WebElement searchInputField1;
	@FindBy(id = "loginButton")
	private WebElement searchInputField2;

	public void searchText(String text) {
		typeInput(searchInputField, text);
		typeInput(searchInputField1, text);
	//	searchInputField2.click();
		clickOnElement(searchInputField2);

	}

}