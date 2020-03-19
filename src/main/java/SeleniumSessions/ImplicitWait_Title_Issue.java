package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait_Title_Issue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// imp wait - will be applied for all the web elements by default
		// global wait - only for web elements

		driver.get("https://app.hubspot.com/login");
		
		System.out.println(driver.getTitle());
		
		
	}

}
