import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import frameworkfunctions.SeleniumFunctions;

public class NewToursKeywords {

	 WebDriver driver;
	int iThinkTime = 1000;
	// Create an instance of the Selenium Functions class which manages all selenium activities for us
	SeleniumFunctions sfSelenium = new SeleniumFunctions();

	
//	// Reusable method to perform validations for us
//	public void doValidation (String sActualValue, String sExpectedValue) {
//		
//		
//		if (sActualValue.contentEquals(sExpectedValue)) {
//			// If condition is true, execute this code
//			
//			System.out.println("Test passed. Expected Value = " + sExpectedValue + " Actual Value = " + sActualValue);
//		}
//		else {
//			// If condition is false, execute this code
//			System.out.println("Test failed. Expected Value = " + sExpectedValue + " Actual Value = " + sActualValue);
//		}
//
//	}
	
	public void SetupSelenium() {
		sfSelenium.SetupSelenium();
		
		this.driver = sfSelenium.getDriver();
	}
	
	public void NavigateToURL(String sURL) throws IOException {
		sfSelenium.startReport("New Tours App", "Flights Booking");
		sfSelenium.createTest("NavigateToURL");
		// Navigate to demo.guru99.com
		driver.get(sURL);
	
		sfSelenium.logScreenShot();
		
	}
	
	public void ClickLink (String sLinkText) {
		// Click on the New Tours Link
		driver.findElement(By.linkText(sLinkText)).click();
		
	}
	
	public void Login (String sUsername, String sPassword) throws InterruptedException, IOException {
		sfSelenium.createTest("Login");	
		
	//		 Username and Password
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(sUsername);
		//Enter Password
		//driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sPassword);

		//Click Submit Button
		driver.findElement(By.name("submit")).click();
		
		sfSelenium.logScreenShot();
		//Pause/Wait for 3 seconds
		Thread.sleep(iThinkTime);

	}
	
	public void CaptureFlightsDetail(String sPasscount, String sFromPort, String sFromMonth, String sFromDay, String sToPort, String sToMonth, 
			String sToDay, String sFlightType, String sPrefAirline) throws InterruptedException, IOException {
	
		sfSelenium.createTest("Capture Flight Details");	

		//Step 4 - Enter Flight Details
		//Select Trip Type Radio button option
		driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();

		//Select Passengers drop down box option
		sfSelenium.populateDropdown("passCount", sPasscount);
	
		
		//		Select drpPassengers = new Select (driver.findElement(By.name("passCount")));
//		//drpPassengers.selectByIndex(2);
//		drpPassengers.selectByVisibleText(sPasscount);
//	
//		String sActualValue =  drpPassengers.getFirstSelectedOption().getAttribute("value");
//		String sExpectedValue = sPasscount;
//
//		sfSelenium.doValidation(sActualValue, sExpectedValue);
		
		
		//Select Departing From drop down box option
		sfSelenium.populateDropdown("fromPort", sFromPort);
		
		//		Select drpDepartingFrom = new Select (driver.findElement(By.name("fromPort")));
//		drpDepartingFrom.selectByVisibleText(sFromPort);
//
//		sActualValue =  drpDepartingFrom.getFirstSelectedOption().getAttribute("value");
//		sExpectedValue = sFromPort;
//		
//		sfSelenium.doValidation (sActualValue,sExpectedValue);
		
	
		
		//Select Departing Month drop down box option
		sfSelenium.populateDropdown("fromMonth", sFromMonth);
//		Select drpDepartingMonth = new Select (driver.findElement(By.name("fromMonth")));
//		drpDepartingMonth.selectByVisibleText(sFromMonth);
//
//		sActualValue =  drpDepartingMonth.getFirstSelectedOption().getText();
//		sExpectedValue = sFromMonth;
//
//		sfSelenium.doValidation (sActualValue, sExpectedValue);
		
		//Select Departing Day drop down box option
		sfSelenium.populateDropdown("fromDay", sFromDay);
		
		//		Select drpDepartingDay = new Select (driver.findElement(By.name("fromDay")));
//		drpDepartingDay.selectByVisibleText(sFromDay);
//		
//		sActualValue =  drpDepartingDay.getFirstSelectedOption().getAttribute("value");
//		sExpectedValue = sFromDay;
//		
//		sfSelenium.doValidation (sActualValue, sExpectedValue);
		

		//Select Arriving to drop down box option
		sfSelenium.populateDropdown("toPort", sToPort);
		
		//		Select drpArrivingTo = new Select (driver.findElement(By.name("toPort")));
//		drpArrivingTo.selectByVisibleText(sToPort);
//
//		sActualValue =  drpArrivingTo.getFirstSelectedOption().getAttribute("value");
//		sExpectedValue = sToPort;
//		
//		sfSelenium.doValidation(sActualValue, sExpectedValue);
		
		
		//Select Arriving Month drop down box option
		sfSelenium.populateDropdown("toMonth", sToMonth);
		//		Select drpArrivingMonth = new Select (driver.findElement(By.name("toMonth")));
//		drpArrivingMonth.selectByVisibleText(sToMonth);
//
//		sActualValue =  drpArrivingMonth.getFirstSelectedOption().getText();
//		sExpectedValue = sToMonth;
//		
//		sfSelenium.doValidation(sActualValue, sExpectedValue);
//	
		
		//Select Arriving Day drop down box option
		sfSelenium.populateDropdown("toDay", sToDay);
		
		//		Select drpArrivingDay = new Select (driver.findElement(By.name("toDay")));
//		drpArrivingDay.selectByVisibleText(sToDay);
//		
//		sActualValue =  drpArrivingDay.getFirstSelectedOption().getAttribute("value");
//		sExpectedValue = sToDay;
//		
//		sfSelenium.doValidation(sActualValue, sExpectedValue);
	

		//Select Service Class Radio button option
		driver.findElement(By.xpath("//input[@name='servClass' and @value=" + sFlightType + "]")).click();
	
		//Select Airline drop down box option
		sfSelenium.populateDropdown("airline", sPrefAirline);
		//		Select drpAirline = new Select (driver.findElement(By.name("airline")));
//		drpAirline.selectByVisibleText(sPrefAirline);
//
//		sActualValue =  drpAirline.getFirstSelectedOption().getAttribute("value");
//		sExpectedValue = sPrefAirline;
//		
//		sfSelenium.doValidation (sActualValue, sExpectedValue);
		sfSelenium.logScreenShot();
		//Pause/Wait for 5 seconds
		Thread.sleep(5000);

		//Click on Continue button
		driver.findElement(By.name("findFlights")).click();


	}
	
	public void CloseSelenium() {
		//Close Selenium
		
		sfSelenium.CloseSelenium();
		
	}
	
	
}
