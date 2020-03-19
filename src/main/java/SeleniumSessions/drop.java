package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop {

	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		By dropdown = By.xpath("//*[contains(@id,'DropDownContainer')][1]//input[@type='checkbox']/..");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		Thread.sleep(3000);
		selectvalues(driver, "choice 1", dropdown);
	}

	public static void selectvalues(WebDriver driver, String value, By locator) {
		List<WebElement> choice = externalWait(driver, locator, 20);
		System.out.println(choice.size());
		for (int i = 0; i < choice.size(); i++) {
			String text = choice.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("choice 1")) {
				choice.get(i).click();
				break;
			}
		}
	}

	public static List<WebElement> externalWait(WebDriver driver, By locator, int timeout) {
		wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return driver.findElements(locator);
	}

}
