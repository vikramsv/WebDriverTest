package Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithInvalidCredentials {
  @Test
  public void to_test_login_with_invalid_credentials() throws InterruptedException {
//	  TestBase.driver.get("https://10.20.220.137:8443/docker-ansible-demo/");
	  TestBase.driver.get(TestBase.webserver);
	  TestBase.driver.manage().window().maximize();
	  TestBase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Thread.sleep(2000);
	  TestBase.driver.findElement(By.linkText("Login")).click();
	  TestBase.driver.findElement(By.name("email")).click();
	  TestBase.driver.findElement(By.name("email")).sendKeys("123");
	  TestBase.driver.findElement(By.name("password")).click();
	  TestBase.driver.findElement(By.name("password")).sendKeys("fwm");
	  TestBase.driver.findElement(By.xpath("//*[@value='login']")).click();
	  Thread.sleep(2000);
	  System.out.println("Invallid User name and Password.");
	  Assert.assertTrue(TestBase.driver.findElement(By.id("msg")).getText().equals("Invallid User name and Password."));
	  TestBase.driver.navigate().refresh();
  }
}
