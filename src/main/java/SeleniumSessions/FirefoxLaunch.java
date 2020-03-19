package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {

		//geckodriver
		System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();//launch firefox
		
		//WebDriver driver = new SafariDriver();

		driver.get("http://www.google.com");//enter url
		
		String title = driver.getTitle();//get the title
		
		System.out.println("page title is: "+ title);
		
		//verification point : checkpoint:
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("in correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit();//close the browser
		
		
		
		
		
		
		
		
		
		
	}

}
