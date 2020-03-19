package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		driver.findElement(By.id("justAnInputBox")).click();

		selectChoiceValues(driver, "choice 2", "choice 2 3", "choice 6", "choice 6 2 1", "choice 6 2");
		// selectChoiceValues(driver, "choice 1");

		// selectChoiceValues(driver, "All");

	}

	/**
	 * this method is used to select the drop down values: 1. select a single
	 * value - "choice 1" 2. select multi values = "choice 1", "choice 2",
	 * "choice 6 2" 3. select all the values - "all" or "All" or "ALL"
	 * 
	 * @param driver
	 * @param value
	 */
	public static void selectChoiceValues(WebDriver driver, String... value) {

		List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		// span[@class='comboTreeItemTitle']
		System.out.println(choiceList.size());

		if (!value[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int k = 0; k < value.length; k++) {
					if (text.equals(value[k])) {
						choiceList.get(i).click();
						break;
					}
				}
			}
		}

		// select all the values
		else {
			try {
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
				}
			} catch (Exception e) {

			}
		}

	}

}
