package automation_code_3rd_april;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Understanding_Automation {

	// You have to learn Java
			//Learn selenium library
			//learn TestNG
			//validation means - comapring expected to actual result
			//learn TestNG
			//GIT and Github
			//jenkins - every friday code should be executed
	
			//eclipse > github>jenkins
			// 25th sept github code pushed[login &register]>jenkins run
			//8th nov > code push[login test changes, register changes, added two more test cases]>jenkins
			
	//For inetrview: java knowledge should be very strong with programming and theory[string and arrays, collection framework very imp
	// java OOPS very imp> (class and object, method,polymorphism,encapsulation,inheritance, abstraction)
	
	//selenium automates browsers
	//webdriver is the interface in selenium library which helps justify the statement
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		
		driver.get("https://rediff.com");
		//selenium can only automate -title
		//currenturl
		//pagesource without TestNG

		
		String expectedTitle = "Rediff.com: News | Rediffmail | StockQoutes | Shopping";
		String actualTitle = driver.getTitle();
		String actualCurrentUrl = driver.getCurrentUrl();
		String expectedCurrentUrl = "https://www.redifff.com/";
		
		if (expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl))
		{
			System.out.println("The url is incorrect");
		}else
		{System.out.println("The url is correct");
		}
		
		//link is present on that page - isDisplayed()
		
		System.out.println(driver.findElement(By.linkText("SignIn")).isEnabled());
		System.out.println(driver.findElement(By.linkText("SignIn")).isDisplayed());
	}

}
