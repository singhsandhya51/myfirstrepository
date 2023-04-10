package automation_code_2nd_apr_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SelectBrowser {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	String browserName = "chrome";
	
	if(browserName.equals("chrome"))
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
	}
	else if (browserName.equals("firefox"))
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://walmart.com");	
	}
	//else
	//{
		//driver = new safariDriver();
		//driver.manage().window().maximize();
		//driver.get("https://rediff.com");
	//}
	driver.quit();
	}
	}


