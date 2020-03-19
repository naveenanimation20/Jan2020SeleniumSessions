package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://shop.polymer-project.org/");
		
		WebElement ele = driver.findElement(By.tagName("shop-app"));
		System.out.println(ele);
		WebElement ele1 = openShadowRootElement(driver, ele).findElement(By.xpath("//shop-analytics"));
		System.out.println(ele1);
		 
		WebElement ele2 = openShadowRootElement(driver, ele1).findElement(By.tagName("app-location"));
		System.out.println(ele2);

		
//		String attr = openShadowRootElement(driver, ele).getAttribute("page");
//		System.out.println(attr);
		
	}

	public static WebElement openShadowRootElement(WebDriver driver, WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",
				element);
		return ele;
	}

}
