package E2E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	
	public void HomePage()
	{
		System.out.println("successssss....");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

	}

}
