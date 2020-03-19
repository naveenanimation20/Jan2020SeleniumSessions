package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivermanagerConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().version("78.0").setup();
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriverManager.getInstance(SafariDriver.class).setup();
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();		

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
