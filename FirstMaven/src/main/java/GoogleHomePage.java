import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomePage {

	
	public void HomePage()
	{
		WebDriver driver = new ChromeDriver();
		System. setProperty("webdriver.chrome.driver", "H:\\Softwares\\Selenium\\chromedriver\\chromedriver.exe");
		driver.get("https://www.google.com");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
