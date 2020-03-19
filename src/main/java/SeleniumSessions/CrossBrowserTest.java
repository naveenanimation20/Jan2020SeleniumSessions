package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {

	public static void main(String[] args) {

		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equals("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "/Users/NaveenKhunteta/Downloads/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			// System.setProperty("webdriver.gecko.driver",
			// "/Users/NaveenKhunteta/Downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		}

		else {
			System.out.println("please use the correct browser" + " " + browser + "....browser not found....");
		}

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

}
