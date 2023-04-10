package learning_java_9thApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Tutorilas_Ninja {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("input-firstname")).click();
		
		
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

}
