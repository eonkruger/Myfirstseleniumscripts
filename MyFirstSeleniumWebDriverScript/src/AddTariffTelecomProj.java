// Add Libraries to the top
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddTariffTelecomProj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Input Test Data
		String sURL = "http://demo.guru99.com";
		String sRental = "500";
		String sFreeLocalMins = "300";
		String sFreeIntMins = "200";
		String sFreeSMS = "200";
		String sLocalMinCharges = "3";
		String sIntMinCharges = "4";
		String sSMSCharges = "2";
		// End of - Input Test Data 
		
		// For Mac
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		// Create an instance of ChromeDriver to execute our tests
		WebDriver driver = new ChromeDriver();	

		
		// Navigate to URL
		driver.get("http://demo.guru99.com");
		
		// Click on Telecoms Project
		driver.findElement(By.linkText("Telecom Project")).click();
		
		// Click on Add Tariff link
		driver.findElement(By.linkText("Add Tariff Plan")).click();
		
		// Capture the Details
		// Captured Rental
		driver.findElement(By.name("rental")).sendKeys(sRental);
		System.out.println("The value for Rental is: " + sRental);
		
		// Read values
		String sActualValue =  driver.findElement(By.name("rental")).getAttribute("value");

		// Check to see if the value matches the value in the variable
		if (sRental.contentEquals(sActualValue)) {
			
			System.out.println ("Test Passed. Expected Value is: " + sRental + " Actual Value is: " + sActualValue);			
		}
		else {

			System.out.println ("Test Failed. Expected Value is: " + sRental + " Actual Value is: " + sActualValue);			
		}
		
		// Capture Free Local Minutes
		driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(sFreeLocalMins);
		System.out.println ("The value for Free Local Minutes is: " + sFreeLocalMins);
		
		sActualValue = driver.findElement(By.xpath("//input[@name='local_minutes']")).getAttribute("value");
		
		if (sFreeLocalMins.contentEquals(sActualValue)) {
			System.out.println("Test Passed. Expected Value is: " + sFreeLocalMins + " Actual Value is: " + sActualValue);
			
		}
		else {
			System.out.println("Test Failed. Expected Value is: " + sFreeLocalMins + " Actual Value is: " + sActualValue);	
			
		}
		
		// Capture International Minutes
		driver.findElement(By.id("inter_minutes")).sendKeys(sFreeIntMins);
		System.out.println("The calue for Free International Minutes is: " + sFreeIntMins);
		
		sActualValue = driver.findElement(By.id("inter_minutes")).getAttribute("value");
		
		if (sFreeIntMins.contentEquals(sActualValue)) {
			System.out.println("Test Passed. Expected Value is: " + sFreeIntMins + " Actual Value is: " + sActualValue);
			
		}
		else {
			System.out.println("Test Failed. Expected Value is: " + sFreeIntMins + " Actual Value is: " + sActualValue);	
			
		}

		
		// Capture Free SMS Pack
		driver.findElement(By.xpath("//input[@type='text'][@id='sms_pack']")).sendKeys(sFreeSMS);
		System.out.println("The value for Free SMS Pack is: " + sFreeSMS);
		
		sActualValue = driver.findElement(By.xpath("//input[@type='text'][@id='sms_pack']")).getAttribute("value");
		
		if (sFreeSMS.contentEquals(sActualValue)) {
			System.out.println("Test Passed. Expected Value is: " + sFreeSMS + " Actual Value is: " + sActualValue);
			
		}
		else {
			System.out.println("Test Failed. Expected Value is: " + sFreeSMS + " Actual Value is: " + sActualValue);	
			
		}

		
		
		// Local per minute charges
		driver.findElement(By.name("minutes_charges")).sendKeys(sLocalMinCharges);
		System.out.println("The value for Local minute charges: " + sLocalMinCharges);
		
		sActualValue = driver.findElement(By.name("minutes_charges")).getAttribute("value");
		
		if (sLocalMinCharges.contentEquals(sActualValue)) {
			System.out.println("Test Passed. Expected Value is: " + sLocalMinCharges + " Actual Value is: " + sActualValue);
			
		}
		else {
			System.out.println("Test Failed. Expected Value is: " + sLocalMinCharges + " Actual Value is: " + sActualValue);	
			
		}

		
		// International per minute charges
		driver.findElement(By.id("inter_charges")).sendKeys(sIntMinCharges);
		System.out.println("The value for International minute charges: " + sIntMinCharges);
		
		sActualValue = driver.findElement(By.id("inter_charges")).getAttribute("value");
		
		if (sIntMinCharges.contentEquals(sActualValue)) {
			System.out.println("Test Passed. Expected Value is: " + sIntMinCharges + " Actual Value is: " + sActualValue);
			
		}
		else {
			System.out.println("Test Failed. Expected Value is: " + sIntMinCharges + " Actual Value is: " + sActualValue);	
			
		}


		
		// SMS per charges
		driver.findElement(By.xpath("//input[@name='sms_charges']")).sendKeys(sSMSCharges);
		System.out.println ("The value for SMS charges: " + sSMSCharges);
		
		sActualValue = driver.findElement(By.xpath("//input[@name='sms_charges']")).getAttribute("value");
		
		if (sSMSCharges.contentEquals(sActualValue)) {
			System.out.println("Test Passed. Expected Value is: " + sSMSCharges + " Actual Value is: " + sActualValue);
			
		}
		else {
			System.out.println("Test Failed. Expected Value is: " + sSMSCharges + " Actual Value is: " + sActualValue);	
			
		}

		
		// Add sleep for 5 seconds
		Thread.sleep(5000);
		
		// Click Submit
		driver.findElement(By.name("submit")).click();
		
		// Close Selenium
		driver.close();
		
	}

}
