package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.edureka.co");
		driver.manage().window().maximize();
		driver.navigate().forward();
		Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().back();
		//driver.findElement(By.id("email")).sendKeys("edureka@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("edureka123");
		//driver.findElement(By.id("loginbutton")).click()
	}

}
