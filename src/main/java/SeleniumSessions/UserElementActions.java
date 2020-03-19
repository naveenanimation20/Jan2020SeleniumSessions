package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserElementActions {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		
		Actions action = new Actions(driver);
		
		action.sendKeys(email, "test@gmail.com").build().perform();
		action.sendKeys(password, "test@123").build().perform();
		action.click(loginButton).build().perform();

		
	}
	
	
	public static void doActionsSendKeys(WebDriver driver, WebElement element,  String value){
		Actions action = new Actions(driver);
		action.sendKeys(element, value).build().perform();
	}
	
	

}
