package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "c:\\documents\\driver\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch chrome
		//ChromeDriver driver = new ChromeDriver();//launch chrome

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
		
		driver.quit();//close the browser
		
		
	}

}
