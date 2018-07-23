package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		System.getProperty("webdriver.gecko.driver","/home/fwm/browsers/firefox/geckodriver");
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 
		
		/*String server = System.getProperty("sechqserver");
		driver.get(server);  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Docker Demo")); 	*/
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.gecko.driver","/home/fwm/browsers/firefox/geckodriver");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	     capabilities.setCapability("marionette", false);
	     String firefox_binary_path = "/home/fwm/browsers/firefox/firefox";
	     capabilities.setCapability("firefox_binary", firefox_binary_path);
	    driver = new FirefoxDriver(capabilities);  
	    
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}	
}
