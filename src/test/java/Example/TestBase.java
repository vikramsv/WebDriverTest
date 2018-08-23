package Example;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;
	public static Actions action;
	public static File file;
    public static Properties prop;
	public static FileInputStream fileinput;
	public static JavascriptExecutor jse;
	public static String sheetname = "SheetName";
	public static int RowCount;
	public static String ToolTipText = "tooltipstring";
  @Test
  public void launchBrowser() {
	  String chromewebdriver = System.getenv("webdriver_chrome");
	  System.setProperty("webdriver.chrome.driver", chromewebdriver);
		driver = new ChromeDriver();
	    /*System.setProperty("webdriver.gecko.driver", "/home/fwm/eclipse-workspace/ESASizing-Test/resources/geckodriver");
		driver = new FirefoxDriver();*/
		 String webserver = System.getenv("webserver");
		driver.get(webserver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  }
  
//Handle Certificate Error
	public void HandleCertificate() {
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();       
		handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new ChromeDriver (handlSSLErr);
	}
	
	/*@AfterSuite
	public void teardown() {
		
		driver.close();
	}*/
}
