package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

		WebElement contentElement = driver.findElement(By.className("menulink"));

		doMoveToElement(driver, contentElement);

		driver.findElement(By.linkText("COURSES")).click();

	}

	public static void doMoveToElement(WebDriver driver, WebElement element) throws InterruptedException {
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		Thread.sleep(3000);

	}

}
