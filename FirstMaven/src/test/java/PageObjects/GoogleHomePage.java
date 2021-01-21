package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomePage {

	
	public void HomePage()
	{
		System.out.println("Hello success");
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
