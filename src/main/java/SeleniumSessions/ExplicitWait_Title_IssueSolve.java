package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_Title_IssueSolve {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		//wait.until(ExpectedConditions.titleContains("Login"));
//		wait.until(ExpectedConditions.titleIs("HubSpot Login"));

		String title = getTitleExplicitly(driver, "Login");
		System.out.println(title);
	}
	
	public static String getTitleExplicitly(WebDriver driver, String title){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	

}
