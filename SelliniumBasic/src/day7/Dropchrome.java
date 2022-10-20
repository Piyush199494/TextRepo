package day7;

import java.util.concurrent.TimeUnit;
import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.bind.v2.runtime.Name;





public class Dropchrome {

	public static void main(String[] args) {
    
		

	System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Register.html");
	
	WebElement selectElement = driver.findElement(By.id("Skills"));
	
	//create object if drop down has tagname "select"
	Select skill =new Select(selectElement);
	
	System.out.println(" Is drop multiselect :- "+skill.isMultiple());
	System.out.println("Already selected option name :- "+ skill.getFirstSelectedOption().getText());
	
//	List<WebElement> optionList = skill.getOptions();
//	
//	System.out.println("NO of skills avaliable :- "+optionList.size());
//	
//	//logic to get name and count
//	for (int i = 0; i<optionList.size();i++) {
//		
//		System.out.println(i+"--"+optionList.get(i).getText());
//	}
//	
//	selectskill.selectByIndex(4);
//	System.out.println("updated selected option name by index no 4 :- "+ selectskill.getFirstSelectedOption().getText());
//	
//	selectskill.selectByValue("Backup Management");
//	System.out.println("updated selected option name by value :- "+ selectskill.getFirstSelectedOption().getText());
//	
//	selectskill.selectByVisibleText("Analytics");
//	System.out.println("updated selected option name by visible text  :- "+ selectskill.getFirstSelectedOption().getText());
//	
//	String expectedskill = "Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
//	
//	// new logic
//	
//	String skillname = "";
//	
//	for (int i = 1; i < optionList.size(); i++) {
//		
//		if((optionList.size()-1)!=i) {
//			
//			skillname=skillname+optionList.get(i).getText()+", ";
//		}else {
//		skillname=skillname+optionList.get(i).getText();
//		}
//	}
//	System.out.println(skillname.equals(expectedskill));
	
	
	}

}