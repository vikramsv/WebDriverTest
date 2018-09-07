package Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenLoginPage {
  @Test
  public void To_test_login_page_opening() throws InterruptedException {
//	  TestBase.driver.get("https://10.20.220.137:8443/docker-ansible-demo/");
	  TestBase.driver.get(TestBase.webserver);
	  TestBase.driver.manage().window().maximize();
	  TestBase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Thread.sleep(2000);
	  TestBase.driver.findElement(By.linkText("Login")).click();
	  TestBase.driver.navigate().refresh();
	  
  }
}
