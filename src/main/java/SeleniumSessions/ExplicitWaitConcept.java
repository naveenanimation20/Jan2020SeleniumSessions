package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		
		By username = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(username));
		//wait.until((ExpectedConditions.visibilityOf(driver.findElement(username))));
		
		waitForElementPresent(driver, username, 20).sendKeys("test@gmail.com");
		
		//driver.findElement(username).sendKeys("test@gmail.com");
		
		driver.findElement(password).sendKeys("test@123");
		
		waitForElementPresent(driver, loginButton, 5).click();

	}
	
	
	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
	}

}
