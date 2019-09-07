

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void verify() {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("http://www.edureka.co");
	  driver.manage().window().maximize();
	  String x = driver.getTitle();
	  Assert.assertEquals(x, "edureka");
  }
}
