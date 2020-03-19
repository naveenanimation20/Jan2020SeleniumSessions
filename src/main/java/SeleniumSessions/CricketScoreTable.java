package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScoreTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver_80");
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(
				"https://www.espncricinfo.com/series/8634/scorecard/1173053/bangladesh-women-vs-india-women-6th-match-group-a-icc-womens-t20-world-cup-2019-20");

		getScoreList(driver, "Shafali Verma");
		getWicketTakerName(driver, "Shafali Verma");
		getScoreList(driver, "RM Ghosh");
		getWicketTakerName(driver, "RM Ghosh");

	}

	public static void getScoreList(WebDriver driver, String playerName) {

		System.out.print(playerName + "\t");
		List<WebElement> scoreList = driver.findElements(By.xpath(
				"//a[text()='" + playerName + "']" + "//parent::div//following-sibling::div[@class='cell runs']"));

		// System.out.println(scoreList.size());

		for (int i = 0; i < scoreList.size(); i++) {
			System.out.print(scoreList.get(i).getText() + "\t");
		}

		System.out.println();
	}

	public static String getWicketTakerName(WebDriver driver, String playerName) {
		String text = driver.findElement(By.xpath("//a[text()='" + playerName + "']//"
				+ "parent::div//following-sibling::div[@class='cell commentary']/a")).getText();
		System.out.println("wicket taker : " + text);
		return text;

	}

}
