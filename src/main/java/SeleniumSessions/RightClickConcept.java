package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickMeButton = driver.findElement(By.xpath("//span[text()='right click me']"));		
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightClickMeButton).perform();
		
		List<WebElement> optionsList = driver.findElements(
				By.xpath("//ul[@class='context-menu-list context-menu-root']"
						+ "/li[contains(@class,'context-menu-icon')]"));
		
		System.out.println(optionsList.size());
		
		for(int i=0; i<optionsList.size(); i++){
			String text = optionsList.get(i).getText();
			System.out.println(text);
//				if(text.equals("Copy")){
//					optionsList.get(i).click();
//					break;
//				}
		}
		
	}

}
