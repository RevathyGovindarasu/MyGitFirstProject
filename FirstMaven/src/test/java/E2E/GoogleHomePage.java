package E2E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomePage {
	WebDriver driver = new ChromeDriver();
	
	
	public void HomePage()
	{
		System.out.println("Hello success");
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\Selenium\\chromedriver\\chromedriver.exe");
		
		driver.get("https://www.google.com");
	}
	public void clickandtype(String input)
	{
		driver.findElement(By.id("gLFyf gsfi")).sendKeys(input);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
