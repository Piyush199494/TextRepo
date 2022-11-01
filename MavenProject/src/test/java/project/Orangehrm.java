package project;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.SeleniumUtility;

public class Orangehrm extends SeleniumUtility {

	static ExtentReports report;
	static ExtentTest test;

	@BeforeTest
	public void startReport() {
		report = new ExtentReports("./ExtentReport/OrangeReport.html", true);
		test = report.startTest("GooglePageReport");
		report.addSystemInfo("Host Name", "Piyush").addSystemInfo("Environment", "OA").addSystemInfo("User Name",
				"Pyush Shekar");
	}

	@Parameters({ "browser", "username", "password", "Firstname", "Lastname" })
	@Test
	public void OrangeHRM(String browser, String username, String password, String Firstname, String Lastname)
			throws Exception {

		System.out.println("Parameter for User Name passed as :- " + username);
		System.out.println("Parameter for Password passed as :- " + browser);
		System.out.println("Parameter for User Name passed as :- " + password);

		System.out.println("Parameter for User Name passed as :- " + Firstname);
		System.out.println("Parameter for Password passed as :- " + Lastname);

		setUp(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		if (getCurrentTitleOfApplication().equals("OrangeHRM")) {
			test.log(LogStatus.PASS, test.addScreenCapture(screenShot(driver)),
					"Navigate to specified URL Sucessfully");
		} else {
			test.log(LogStatus.FAIL, test.addScreenCapture(screenShot(driver)), "Title validation Failed");
			Assert.assertTrue(getCurrentTitleOfApplication().equals("OrangeHRM"));

		}

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password, Keys.ENTER);

		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();


		System.out.println("Parameter for User Name passed as :- " + Firstname);
		System.out.println("Parameter for Password passed as :- " + Lastname);

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Firstname);

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Lastname);

		WebElement id = driver.findElement(By.xpath("//div[div[2][input[@class='oxd-input oxd-input--active']]]"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		// --------------

		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input")).sendKeys(Firstname);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[6][a]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(
				"//div[2][div[div[div[div[@class='oxd-select-text oxd-select-text--active']/div[@class='oxd-select-text-input']]]]]")).click();
		Thread.sleep(3000);
		
		System.out.println("----list Of JOB Titles----");
		List<WebElement> joblist = driver.findElements(By.xpath("//div[@role='option']"));
		System.out.println("list of JOB avaliable- " + joblist.size());
		for (int i = 0; i < joblist.size(); i++) {
			System.out.println(i + " - " + joblist.get(i).getText());	
		}
		joblist.get(17).click();
		
		
		System.out.println("----List Of Catagorys----");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[4][div[div[div[div[@class='oxd-select-text oxd-select-text--active']]]]]"))
				.click();
		List<WebElement> catolist = driver.findElements(By.xpath("//div[@role='option']"));
		for (int i = 0; i < catolist.size(); i++) {
			System.out.println(i + " -catolist- " + catolist.get(i).getText());
		}
		catolist.get(6).click();
		System.out.println("--- SubJOB List-----");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[5][div[div[div[div[@class='oxd-select-text oxd-select-text--active']]]]]"))
				.click();
		List<WebElement> sublist = driver.findElements(By.xpath("//div[@role='option']"));
		for (int i = 0; i < sublist.size(); i++) {
			System.out.println(i + " - sublist -" + sublist.get(i).getText());
		}
		sublist.get(4).click();
		System.out.println("---aLocations Avaliable-----");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[6][div[div[div[div[@class='oxd-select-text oxd-select-text--active']]]]]"))
				.click();
		List<WebElement> localist = driver.findElements(By.xpath("//div[@role='option']"));
		for (int i = 0; i < localist.size(); i++) {
			System.out.println(i + " - localist -" + localist.get(i).getText());
		}
		localist.get(3).click();
		System.out.println("---JOB Statuses-----");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[7][div[div[div[div[@class='oxd-select-text oxd-select-text--active']]]]]"))
				.click();
		List<WebElement> statuslist = driver.findElements(By.xpath("//div[@role='option']"));
		for (int i = 0; i < statuslist.size(); i++) {
			System.out.println(i + " - status list -" + statuslist.get(i).getText());
		}
		statuslist.get(3).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Upload image
		driver.findElement(By.xpath("//img[@class='employee-image']")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();
		Robot robot = new Robot();
		robot.delay(2000);
		// put the file into clipboard
		StringSelection ss = new StringSelection("putin");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// crt+v
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();

	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			test.log(LogStatus.FAIL, "Test Case Failed due to " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, "Test Case Skipped due to " + result.getName());
		}
		report.endTest(test);
	}

	@AfterTest
	public void endReport() {

		report.flush();

		report.close();
	}

	public static String screenShot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/" + System.currentTimeMillis() + ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;

	}
}
//	  System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\kk\\eclipse-workspace\\SelliniumBasic\\executable\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
//		name.sendKeys("Admin");
//		name.click();

//		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
//		pass.sendKeys("admin123", Keys.ENTER);

//		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
//		
// driver.findElement(By.xpath("//input[@placeholder='First
// Name']")).sendKeys("PIYUSH");
//		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("SHEKAR");
//		WebElement id = driver.findElement(By.xpath("//div[div[2][input[@class='oxd-input oxd-input--active']]]"));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
//
////    List<WebElement>  namelist= driver.findElements(By.xpath("//div[div[@role='cell']]/div[3]"));
////    for(int i = 0 ;i< namelist.size();i++) {
////  	  System.out.println(i+" - "+namelist.get(i).getText() );
////    }
//		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input"))
//				.sendKeys("PIYUSH");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@role='listbox']/div/span[1]")).click();
////		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]//input"))
////				.sendKeys("0254");
//
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[6][a]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(
//				"//div[2][div[div[div[div[@class='oxd-select-text oxd-select-text--active']/div[@class='oxd-select-text-input']]]]]"))
//				.click();
//		Thread.sleep(3000);
//
//		List<WebElement> joblist = driver.findElements(By.xpath("//div[@role='option']"));
//		System.out.println("list of JOB avaliable- " + joblist.size());
//		for (int i = 0; i < joblist.size(); i++) {
//			System.out.println(i + " - " + joblist.get(i).getText());
//		}
//
//		joblist.get(17).click();
//
//		System.out.println("--------");
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//div[4][div[div[div[div[@class='oxd-select-text oxd-select-text--active']]]]]"))
//				.click();
//		List<WebElement> catolist = driver.findElements(By.xpath("//div[@role='option']"));
//		for (int i = 0; i < catolist.size(); i++) {
//			System.out.println(i + " -catolist- " + catolist.get(i).getText());
//		}
//
//		catolist.get(6).click();
//
//		Thread.sleep(3000);
//
//		System.out.println("--------");
//
//		driver.findElement(By.xpath("//div[5][div[div[div[div[@class='oxd-select-text oxd-select-text--active']]]]]"))
//				.click();
//		List<WebElement> sublist = driver.findElements(By.xpath("//div[@role='option']"));
//		for (int i = 0; i < sublist.size(); i++) {
//			System.out.println(i + " - sublist -" + sublist.get(i).getText());
//		}
//		sublist.get(4).click();
//
//		Thread.sleep(3000);
//		System.out.println("--------");
//
//		driver.findElement(By.xpath("//div[6][div[div[div[div[@class='oxd-select-text oxd-select-text--active']]]]]"))
//				.click();
//		List<WebElement> localist = driver.findElements(By.xpath("//div[@role='option']"));
//		for (int i = 0; i < localist.size(); i++) {
//			System.out.println(i + " - localist -" + localist.get(i).getText());
//		}
//		localist.get(3).click();
//
//		Thread.sleep(3000);
//		System.out.println("--------");
//		driver.findElement(By.xpath("//div[7][div[div[div[div[@class='oxd-select-text oxd-select-text--active']]]]]"))
//				.click();
//		List<WebElement> statuslist = driver.findElements(By.xpath("//div[@role='option']"));
//		for (int i = 0; i < statuslist.size(); i++) {
//			System.out.println(i + " - status list -" + statuslist.get(i).getText());
//		}
//		statuslist.get(3).click();
//
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//		driver.findElement(By.xpath("//img[@class='employee-image']")).click();
//		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();
//
//		Robot robot = new Robot();
//		robot.delay(2000);
//		// put the file into clipboard
//		StringSelection ss = new StringSelection("putin");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//		// crt+v
//		robot.delay(2000);
//
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.delay(2000);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.delay(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//	robot.keyRelease(KeyEvent.VK_ENTER);
//	
//	driver.findElement(By.xpath("//button[@type='submit']")).click();

// }
