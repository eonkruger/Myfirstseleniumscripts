// Add Libraries to the top
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldNewTours {
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		// Input test data
		String sURL = "http://demo.guru99.com";
		String sUsername = "mercury";
		String sPassword = "mercury";
		String sPasscount = "2";
		String sFromPort = "Sydney";
		String sFromMonth = "June";
		String sFromDay = "15";
		String sToPort = "Frankfurt";
		String sToMonth = "July";
		String sToDay = "25";
		String sPrefAirline = "Unified Airlines";
		String sFlightType = "'Business'";
		String sActualValue = "";
		String sExpectedValue = "";
		String sLinkText = "New Tours";
		// End of - Input test data

		
		// Create a new instance of the new tours keywords class
		NewToursKeywords newtours = new NewToursKeywords();
		
		// Call Setup Selenium
		newtours.SetupSelenium();

		
		// Start extentreports
//		newtours.sfSelenium.startReport("New Tours Application", "Flights Booking");
	
		
		
		// Navigate to demo.guru99.com
		newtours.NavigateToURL(sURL);
		
		// Click on the New Tours Link
		newtours.ClickLink(sLinkText);
		
		//	 Username and Password
		newtours.Login (sUsername, sPassword);
		
		
		newtours.ClickLink("Flights");
		
		//Pause/Wait for 3 seconds
		Thread.sleep(newtours.iThinkTime);

	//Step 4 - Enter Flight Details
		newtours.CaptureFlightsDetail(sPasscount, sFromPort, sFromMonth, sFromDay, sToPort, sToMonth, sToDay, sFlightType, sPrefAirline);
		
	
	 //Pause/Wait for 3 seconds
		Thread.sleep(newtours.iThinkTime);
	
		newtours.CloseSelenium();
						
	}

}
