package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");

		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--start-maximized");
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);//launch chrome
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		// driver = new FirefoxDriver(fo);//launch ff

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
		
		
		
		
		
	}

}
