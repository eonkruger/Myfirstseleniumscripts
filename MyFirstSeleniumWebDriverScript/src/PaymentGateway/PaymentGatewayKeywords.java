package PaymentGateway;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import frameworkfunctions.SeleniumFunctions;

public class PaymentGatewayKeywords {
	
	//Add the Selenium Functions
	SeleniumFunctions sfSelenium = new SeleniumFunctions();
	
	//Declare the webdriver variable
	WebDriver driver;
	
	// navigate to url
	public void navigateToURL(String pURL ) throws IOException {
		sfSelenium.createTest("Navigate to guru999");
		driver.get(pURL);
		//driver.manage().window().maximize();
		sfSelenium.logScreenShot();
	}
	
	// click payment gateway
	public void clickPaymentGateway() throws IOException {
		//start the test
		sfSelenium.createTest("Click Payment Gateway");
		//click the link
		driver.findElement(By.linkText("Payment Gateway Project")).click();
		//take a screenshot
		sfSelenium.logScreenShot();	
	}
	
	// select quantity 
	public void selectQuantity(String pQuantity) throws IOException {
		// start the test
		sfSelenium.createTest("Select Quantity");
		// Select quantity from drop down
		sfSelenium.populateDropdown("quantity", pQuantity);
		// take a screenshot
		sfSelenium.logScreenShot();
		
	}
	// buy now
	public void clickByNow(String expectedAmount) throws IOException {
		// start the test
		sfSelenium.createTest("Click buy now");
		// Click buy now
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		// take a screen shot
		sfSelenium.logScreenShot();
		// sfSelenium.doValidation(SfSelenium, SfSelenium);
		String sPrice = driver.findElement(By.cssSelector(".\\36 u > font:nth-child(2)")).getText();
		
		// DO VALIDATIONS
		sfSelenium.doValidation(sPrice, expectedAmount);
	}
	
	// go to card generator
	public void generateCardNumber() throws IOException {
		sfSelenium.createTest("Click Generate Card Number");
		driver.findElement(By.linkText("Generate Card Number")).click();
		sfSelenium.logScreenShot();
	}
	
	// get card details
	public void getCardNumber() throws IOException, InterruptedException {
		//start the test
		sfSelenium.createTest("Get Card Number");
		
		//switch to the new card
		//hold all the window handles in an array list
		
		//CARD NUMBER
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());		//newTb equals new tab
		driver.switchTo().window(newTb.get(1));
		String sCreditCardNumber = driver.findElement(By.cssSelector("body.subpage:nth-child(2) section.wrapper:nth-child(3) div.inner > h4:nth-child(3)")).getText();
	    System.out.println(sCreditCardNumber +" " + driver.getTitle());
	    String sLast16digits = sCreditCardNumber.substring(sCreditCardNumber.length() - 16);
	    System.out.println(sLast16digits);
	    sfSelenium.logScreenShot();
	    //driver.switchTo().window(newTb.get(0));	//uncomment out if you do not need the CVV number also
	    
	    //CVV NUMBER
	    sfSelenium.createTest("Get CVV Number");
	    String sCVVNumber = driver.findElement(By.cssSelector("body.subpage:nth-child(2) section.wrapper:nth-child(3) div.inner > h4:nth-child(4)")).getText();
	    System.out.println(sCVVNumber +" " + driver.getTitle());
	    String sLast3digits = sCVVNumber.substring(sCVVNumber.length() - 3);
	    System.out.println(sLast3digits);
	    sfSelenium.logScreenShot();
	    
	    //EXPIRY DATE
	    sfSelenium.createTest("Get Expiry Date");
	    String sExpiryDate = driver.findElement(By.cssSelector("body.subpage:nth-child(2) section.wrapper:nth-child(3) div.inner > h4:nth-child(5)")).getText();
	    System.out.println(sExpiryDate +" " + driver.getTitle());
	    String sLast7digits = sExpiryDate.substring(sExpiryDate.length() - 7);
	    //String sExtractMonth = sExpiryDate.substring(5, 2);	//EXTRACT MONTH FROM DATE
	    System.out.println(sLast7digits);
	    //System.out.println(sExtractMonth); 		//DISPLAY MONTH
	    sfSelenium.logScreenShot();
	    
	    //CREDIT LIMIT
	    sfSelenium.createTest("Get Credit Limit");
	    String sCreditLimit = driver.findElement(By.cssSelector("body.subpage:nth-child(2) section.wrapper:nth-child(3) div.inner h4:nth-child(6) > span:nth-child(1)")).getText();
	    System.out.println(sCreditLimit +" " + driver.getTitle());
	    String sLast7digitsCredit = sCreditLimit.substring(sCreditLimit.length() - 7);
	    System.out.println(sLast7digitsCredit);
	    sfSelenium.logScreenShot();
	    
	    Thread.sleep(5000);
	    
	    //switch back
	    driver.switchTo().window(newTb.get(0));
	    
	    //populate fields
	    sfSelenium.populateInputField(By.name("card_nmuber"), sLast16digits);
	    sfSelenium.populateInputField(By.name("cvv_code"), sLast3digits);	
	    //add month
	    //add year
	    //add credit limit
	    
	    //take screenshot
	    sfSelenium.logScreenShot();
	    Thread.sleep(5000);
		
	}
	
	public void runTest() throws IOException, InterruptedException {
		//set up the driver 
		sfSelenium.SetupSelenium();
		this.driver = sfSelenium.getDriver();
		
		//set up the report
		sfSelenium.startReport("Payment Gateway Project", "Buy a Teddy");
		
		//give some input data
		String pURL = "http://demo.guru99.com";
		
		// Execute the tests
		navigateToURL(pURL);
		clickPaymentGateway();
		selectQuantity("2");
		clickByNow("$40.00");
		generateCardNumber();
		getCardNumber();
		//start another test
		sfSelenium.navigateBack();
		selectQuantity("6");
		clickByNow("$120.00");
		//Thread.sleep(50000);
		sfSelenium.CloseSelenium();
	}

}
