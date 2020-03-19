package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		List<WebElement> optionsListDay = driver.findElements(By.xpath("//select[@id='day']/option"));
		List<WebElement> optionsListMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		List<WebElement> optionsListYear = driver.findElements(By.xpath("//select[@id='year']/option"));

		getAllDropDownOptions(optionsListDay);
		getAllDropDownOptions(optionsListMonth);
		getAllDropDownOptions(optionsListYear);

	}

	public static void getAllDropDownOptions(List<WebElement> optionsList) {

		int totalOptions = optionsList.size();

		System.out.println("total options: " + totalOptions);

		for (int i = 0; i < totalOptions; i++) {
			System.out.println(optionsList.get(i).getText());
		}

	}

}
