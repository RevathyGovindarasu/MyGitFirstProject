package E2E;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;


public class Test1 {
	
	WebDriver driver = new FirefoxDriver();
	
  @Test(priority=1)
  public void first() {
	  System.out.println("Hello success");
	//	System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\Selenium\\chromedriver\\chromedriver.exe");
		
		driver.get("https://www.google.com");
  }
  
  @Test(priority=2)
  public void second()
  {
	  driver.findElement(By.id("gLFyf gsfi")).sendKeys("success");
	 
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
