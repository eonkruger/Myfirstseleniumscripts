package frameworkfunctions;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFunctions {
	// private variable to store the Selenium Webdriver object
	private WebDriver driver;
	ExtentReportClass extReports = new ExtentReportClass();
	
	// Getter for the driver variable
	public WebDriver getDriver() {
		return this.driver;
	}
	
	
	// Reusable method to perform validations for us
		public void doValidation (String sActualValue, String sExpectedValue) {
			
			// Output to Console and Extent Report
			if (sActualValue.contentEquals(sExpectedValue)) {
				// If condition is true, execute this code
				// output to console
				System.out.println("Test passed. Expected Value = " + sExpectedValue + " Actual Value = " + sActualValue);
				
				// output to extent Reports
				extReports.logPass(sActualValue, sExpectedValue);
				
			}
			else {
				// If condition is false, execute this code
				System.out.println("Test failed. Expected Value = " + sExpectedValue + " Actual Value = " + sActualValue);
				
				// output to extent Reports
				extReports.logFail(sActualValue, sExpectedValue);
			}

		}
		
		public void SetupSelenium() {
			// For Mac
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			
			// For Window
			//System.setProperty("webdriver.chrome.driver", "c:\\chromedriver_win32\\chromedriver.exe"); 

			// Create an instance of ChromeDriver to execute our tests
			 this.driver = new ChromeDriver();	
			 
			 // Also setup the report for me
//			 extReports.startReport("New Tours Application", "Book a Flight");

		}
		
		public void startReport(String sReportName, String sTitle) {
			extReports.startReport(sReportName, sTitle);
		}
		
		public void createTest(String sName) {
			extReports.createTest(sName);
		}
		
		public void CloseSelenium() {
			//Close Selenium
			this.driver.quit();
			
			
			// Also finalise and close the test report for us
			extReports.closeReport();

			
		}
		
		public void navigateBack() {
			//Navigate back to the previous page
			this.driver.navigate().back();		
		}
		
		public void logScreenShot() throws IOException {
			this.extReports.logScreenshot(this.driver);
		}
		
		// This function/method will populate a dropdown on a webpage and it will perform a validation on whether the selected value matches the test input value
		public void populateDropdown(String pName, String pValue) {
			
			Select selDropDown = new Select (driver.findElement(By.name(pName)));
			//drpPassengers.selectByIndex(2);
			selDropDown.selectByVisibleText(pValue);
		
			String sActualValue =  selDropDown.getFirstSelectedOption().getText();
			String sExpectedValue = pValue;

			this.doValidation(sActualValue, sExpectedValue);
		}

		// This method will populate input fields and validation that the value matches what was typed
		public void populateInputField(By byClause, String pInputValue) {
			driver.findElement(byClause).sendKeys(pInputValue);
			
			// Read the value from the field
			String sActualValue = driver.findElement(byClause).getAttribute("value").toString();
			
			doValidation(sActualValue, pInputValue);
	
		}
		
		// This function will click on a radio button 
		public void clickRadioButton(String sName, String sValue) {
			driver.findElement(By.xpath("//input[@name='"+ sName + "'][@value='" + sValue + "']")).click();
			
		}
}
