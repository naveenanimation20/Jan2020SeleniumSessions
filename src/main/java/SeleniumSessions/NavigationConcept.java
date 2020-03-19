package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch chrome

//		driver.get("http://www.amazon.com");//enter url
//		
//		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().back();
//		
//		driver.navigate().refresh();
		
		
	}

}
