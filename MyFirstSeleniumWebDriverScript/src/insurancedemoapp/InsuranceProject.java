package insurancedemoapp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frameworkfunctions.SeleniumFunctions;

public class InsuranceProject {
	// Selenium Web driver
	WebDriver driver;
	
	// Add SeleniumFunctions to this class
	SeleniumFunctions sfSelenium = new SeleniumFunctions();
	
	
	// Navigate to guru99
	public void navigateToURL(String sURL) throws IOException {
		sfSelenium.createTest("Navigate to guru99");
		driver.get(sURL);		
		
		// add a screenshot to the report
		sfSelenium.logScreenShot();
	}
	
	// Insurance Project Link
	public void clickInsuranceProjectLink() throws IOException {
	
		sfSelenium.createTest("Click Insurance Project Link");
		driver.findElement(By.linkText("Insurance Project")).click();

		sfSelenium.logScreenShot();
	}
	
	// Click Register Button
	public void clickRegister() {
		driver.findElement(By.linkText("Register")).click();
	}
	
	// Capture New User Details
	public void CaptureUserDetails(String sTitle, String sFirstname, String sSurname, String sPhone, 
			String sYear, String sMonth, String sDay, String sLicenseType, String sLicensePeriod,
			String sOccupation, String sStreet, String sCity, String sCounty, String sPostCode,
			String sEmail, String sPassword) throws IOException {
		
		// Give this test a name in the report
		sfSelenium.createTest("Capture User Details");
		
		// populate input data
		sfSelenium.populateDropdown("title", sTitle);
		sfSelenium.populateInputField(By.name("firstname"), sFirstname);
		sfSelenium.populateInputField(By.name("lastname"), sSurname);
		sfSelenium.populateInputField(By.name("phone"), sPhone);
		
		sfSelenium.populateDropdown("year", sYear);
		sfSelenium.populateDropdown("month", sMonth);
		sfSelenium.populateDropdown("date", sDay);
		sfSelenium.clickRadioButton("licencetype", sLicenseType);
		sfSelenium.populateDropdown("licenceperiod", sLicensePeriod);
		sfSelenium.populateDropdown("occupation", sOccupation);
		sfSelenium.populateInputField(By.name("street"), sStreet);
		sfSelenium.populateInputField(By.name("city"), sCity);
		sfSelenium.populateInputField(By.name("county"), sCounty);
		sfSelenium.populateInputField(By.name("post_code"), sPostCode);
		sfSelenium.populateInputField(By.name("email"), sEmail);
		sfSelenium.populateInputField(By.name("password"), sPassword);
		sfSelenium.populateInputField(By.name("c_password"), sPassword);
		
		// Capture a screenshot into the report
		sfSelenium.logScreenShot();
	}
	
	// Click Create Button
	public void clickCreate() {
		driver.findElement(By.name("submit")).click();
	}
	
	// Run Test
	public void runTest() throws IOException {
		
		sfSelenium.SetupSelenium();
		
		this.driver = sfSelenium.getDriver();
		
		// Setup report
		sfSelenium.startReport("Insurance Project", "Register a new user");
		
		// Input Data variables
		String sURL = "http://demo.guru99.com";
		String sTitle = "Captain";
		String sFirstname = "Sastri";
		String sSurname = "Munsamy";
		String sPhone = "0831231234";
		String sYear = "1992";
		String sMonth = "April";
		String sDay = "15";
		String sLicenseType = "Provisional";
		String sLicensePeriod = "6";
		String sOccupation = "Actor";
		String sStreet = "911 Hollywood";
		String sCity = "Los Angeles";
		String sCounty = "California";
		String sPostCode = "91111";
		String sEmail = "sas@test.com";
		String sPassword = "123456";
		
		navigateToURL(sURL);
		
		clickInsuranceProjectLink();
		
		clickRegister();
		
		CaptureUserDetails(sTitle, sFirstname, sSurname, sPhone, sYear, sMonth, sDay, sLicenseType, sLicensePeriod, sOccupation, sStreet, sCity, sCounty, sPostCode, sEmail, sPassword);
		
		sfSelenium.CloseSelenium();
	}
	
	
}
