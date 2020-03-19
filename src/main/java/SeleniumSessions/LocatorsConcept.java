package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch chrome

		driver.get("https://app.hubspot.com/login");//enter url
		
		Thread.sleep(5000);
		driver.findElement(By.id("hs-login")).findElement(By.id("username")).sendKeys("naveen");


		//8 types of locators
		
		//1. id: -- I -- unique
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
//		driver.findElement(By.id("loginBtn")).click();
		
//		WebElement emailId = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
//		loginButton.click();
		
		
		//2. name: -- I, II
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		
		//3. className: -- IV
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test@gmail.com");

		//4. xpath: -- III : address of the element, but its  not a property of the element
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test");
		//*[@id="loginBtn"]
		
		//5. cssSelector:-- III:  its a locator but not an element property
		//driver.findElement(By.cssSelector("#username")).sendKeys("test");
		
		
		//6. linkText: only for links:
		//html tag should be <a>
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partialLinkText:only for links: you can pass partial text of the link
		//html tag should be <a>
		
		//driver.findElement(By.partialLinkText("Sign")).click();
		// sign up
		// sign in
		
		//8. tagName
	}

}
