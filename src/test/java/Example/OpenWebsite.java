package Example;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenWebsite {
  @Test
  public void to_test_url_is_opening_or_not() {
	  TestBase.driver.get("https://10.20.151.59:8443/docker-ansible-demo/");
	  TestBase.driver.manage().window().maximize();
	  TestBase.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Assert.assertTrue(TestBase.driver.getTitle().equals("Docker-Demo"));
	  System.out.println("Copy docker-demo on ubuntu home");
	  TestBase.driver.navigate().refresh();
  }
}
