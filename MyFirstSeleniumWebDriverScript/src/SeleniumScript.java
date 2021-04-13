// Add Libraries to the top
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Add Selenium Script code here
		
		// Tell Java where to find the chromedriver file
		// For windows
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\selenium\\chromedriver.exe");
	
	
		// For Mac
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		// Create an instance of ChromeDriver to execute our tests
		WebDriver driver = new ChromeDriver();	
		
		//Navigate to URL
		driver.get("http://www.google.co.za");
		
		// Pause - the value is in milliseconds. 5000  milliseconds = 5 seconds
		Thread.sleep(5000);
		
		// Close Selenium
		driver.close();
	}

}
