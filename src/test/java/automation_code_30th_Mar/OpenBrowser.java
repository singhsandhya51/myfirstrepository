package automation_code_30th_Mar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class OpenBrowser {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver(); //command+shift+o
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.quit();
		
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://walmart.com");
		driver.quit();
		
		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://costco.com");
		driver.quit();
		
	}

}
