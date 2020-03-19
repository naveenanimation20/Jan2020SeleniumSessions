package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();// launch chrome

		driver.get("http://www.google.com");// enter url

		String title = driver.getTitle();// get the title

		System.out.println("page title is: " + title);

		driver.quit();

		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

}
