package Example;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestConnectionCheck {
  @Test
  public void To_test_connection() throws InterruptedException {
	  TestBase.driver.get("https://10.20.220.137:8443/docker-ansible-demo/");
	  TestBase.driver.manage().window().maximize();
	  TestBase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Thread.sleep(2000);
	  TestBase.driver.findElement(By.linkText("Test Connection")).click();
	  Thread.sleep(5000);
	  Assert.assertTrue(TestBase.driver.findElement(By.id("success")).getText().equals("Test Success .............."));
	  System.out.println("Test Success ..............");
	  TestBase.driver.navigate().refresh();
	  
  }
}
