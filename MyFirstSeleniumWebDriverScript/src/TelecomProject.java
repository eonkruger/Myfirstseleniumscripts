//    Exercise: Using the Telecom Project, Add the Selenium Functions class to manage Selenium 
// 	  and the ExtentReportsClass to log validations to the extent report. 
//    You will need to create a new method in SeleniumFunctions Class to 
//    populateInputField which will look similar to the populateDropdown method



// Add Libraries to the top
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frameworkfunctions.SeleniumFunctions;

public class TelecomProject {

	static WebDriver driver;
	// Create an instance of SeleniumFunctions
	static SeleniumFunctions sfSelenium = new SeleniumFunctions();
	
	public static void NavigateToURL(String sURL) throws IOException {
		
		sfSelenium.createTest("Navigate to URL : " + sURL);
		// Navigate to the URL
		driver.get(sURL);
		
		sfSelenium.logScreenShot();

		
	}
	
	public static void ClickTelecomProjectLink() throws IOException {
	
		sfSelenium.createTest("Clicking the Telecom Project Link");
		// Click the Telecom Project Link
		driver.findElement(By.linkText("Telecom Project")).click();

		
		sfSelenium.logScreenShot();
	}
	
	public static  void ClickAddCustomer() throws IOException {
		sfSelenium.createTest("Clicking Add Customer");
		// Click on Add Customer
		driver.findElement(By.linkText("Add Customer")).click();
		
		sfSelenium.logScreenShot();
		
	}
	
	public static  void CaptureCustomerDetails(String sbckCheck, String sFirstname, String sLastname, String sEmail, String sAddress, String sTelephone) throws InterruptedException, IOException {
		sfSelenium.createTest("Capture Customer Details");
		// Capture the Customer Details
		
				// Click Background Check
				driver.findElement(By.xpath("//label[@for=" + sbckCheck +  "]")).click();
				
//				String sFirstPart = "//label[@for=";
//				String sLastPart = "]"; 
//				
//				String sXpath = sFirstPart + sbckCheck + sLastPart; 

				
				
				// Capture Firstname
			//	driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(sFirstname);
				sfSelenium.populateInputField(By.xpath("//input[@name='fname']"), sFirstname);
				
				// Capture Lastname
//				driver.findElement(By.name("lname")).sendKeys(sLastname);
				sfSelenium.populateInputField(By.name("lname"), sLastname);
				
				// Capture Email
//				driver.findElement(By.id("email")).sendKeys(sEmail);
				sfSelenium.populateInputField(By.id("email"), sEmail);
				
				// Capture Address
										// Locator Method using multiple attributes. Using \ escape character in a string to send a double quote
				//driver.findElement(By.xpath("//textarea[@name='addr'][@id='message']")).sendKeys(sAddress);
				sfSelenium.populateInputField(By.xpath("//textarea[@name='addr'][@id='message']"), sAddress);
				
				// Capture Mobile Number
//				driver.findElement(By.name("telephoneno")).sendKeys(sTelephone);
				sfSelenium.populateInputField(By.name("telephoneno"), sTelephone);	
				
				sfSelenium.logScreenShot();
				// Add a Sleep here for 5 seconds
				Thread.sleep(5000);

	
	}
	
	public static void ClickSubmit() {
		// Click the Submit Button
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
	}
	
	public static  void SetupSelenium() {
		// For Mac
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		// Create an instance of ChromeDriver to execute our tests
		driver = new ChromeDriver();	
		
	}
	
	public  static void CloseSelenium() {
		// Close Selenium Driver
		driver.close();
	}
	
//	public static void main() throws InterruptedException {
//		// Input Test Data
//	    String sURL = "http://demo.guru99.com";
//		String sbckCheck = "'pending'";
//		String sFirstname = "Lance";
//		String sLastname = "Klusener";
//		String sEmail = "zulu@odi.com";
//		String sAddress = "6969 Zulu lane KZN";
//		String sTelephone = "555 6969";		
//		// End of - Input Test Data
//		
//		// Setup Selenium Chrome Driver
//		SetupSelenium();
//		
//		// Navigate to URL
//		NavigateToURL(sURL);
//		
//		// Click the Telecom Project Link
//		ClickTelecomProjectLink();
//		
//		// Click Add Customer Link
//		ClickAddCustomer();
//		
//		// Capture Customer details
//		CaptureCustomerDetails(sbckCheck, sFirstname, sLastname, sEmail, sAddress, sTelephone);
//		
//		// Click Submit Button
//		ClickSubmit();
//		
//		// Close Selenium Chrome Driver
//		CloseSelenium();
//	}

	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
		// Input Test Data
	    String sURL = "http://demo.guru99.com";
		String sbckCheck = "'pending'";
		String sFirstname = "Lance";
		String sLastname = "Klusener";
		String sEmail = "zulu@odi.com";
		String sAddress = "6969 Zulu lane KZN";
		String sTelephone = "555 6969";		
//		// End of - Input Test Data
		
	
		
		// Setup Selenium Chrome Driver
		//SetupSelenium();
		sfSelenium.SetupSelenium();
		driver = sfSelenium.getDriver();
		
		// Setup Extent Reports
		sfSelenium.startReport("Telecom Project", "Add Customer");
		
		
		// Navigate to URL
		NavigateToURL(sURL);
		
		// Click the Telecom Project Link
		ClickTelecomProjectLink();
		
		// Click Add Customer Link
		ClickAddCustomer();
		
		// Capture Customer details
		CaptureCustomerDetails(sbckCheck, sFirstname, sLastname, sEmail, sAddress, sTelephone);
		
		// Click Submit Button
		ClickSubmit();
		
		// Close Selenium Chrome Driver
		//CloseSelenium();	
		sfSelenium.CloseSelenium();
//		
		// For windows
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\selenium\\chromedriver.exe");
	
		
//		String sMyFirstname = "Sastri";
//		int iNumber1 = 10;
//		int iNumber2 = 20;
//		
//		int iNumber3 = iNumber1 + iNumber2; // the output here is 30
//		
//		String sNumber1 = "10";
//		String sNumber2 = "20";
//		
//		String sNumber3 = sNumber1 + sNumber2; // the output here is 1020
		
	
//		
//		// For Mac
//		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//
//		// Create an instance of ChromeDriver to execute our tests
//		driver = new ChromeDriver();	
////
////		// Navigate to the URL
//		driver.get(sURL);
////		
////		// Click the Telecom Project Link
//		driver.findElement(By.linkText("Telecom Project")).click();
////		
////		// Click on Add Customer
//		driver.findElement(By.linkText("Add Customer")).click();
////		
////		// Capture the Customer Details
////		
////		// Click Background Check
//		driver.findElement(By.xpath("//label[@for=" + sbckCheck +  "]")).click();
////		
//////		String sFirstPart = "//label[@for=";
//////		String sLastPart = "]"; 
//////		
//////		String sXpath = sFirstPart + sbckCheck + sLastPart; 
////
////		
////		
////		// Capture Firstname
//		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(sFirstname);
////		
////		// Capture Lastname
//		driver.findElement(By.name("lname")).sendKeys(sLastname);
////		
////		// Capture Email
//		driver.findElement(By.id("email")).sendKeys(sEmail);
////		
////		// Capture Address
////								// Locator Method using multiple attributes. Using \ escape character in a string to send a double quote
//		driver.findElement(By.xpath("//textarea[@name='addr'][@id='message']")).sendKeys(sAddress);
////		
////		// Capture Mobile Number
//		driver.findElement(By.name("telephoneno")).sendKeys(sTelephone);
////			
////		
////		// Add a Sleep here for 5 seconds
//		Thread.sleep(5000);
////		
////		// Click the Submit Button
//		driver.findElement(By.xpath("//input[@value='Submit']")).click();
////		
//		// Close Selenium
//		driver.close();
		
	}

}
