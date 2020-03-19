package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch chrome

		driver.get("https://amazon.com");
		
		//Thread.sleep(5000);
		
		//1. count total links on the page
		//2. get the text of each link without space
		//3. get the href url property for each link
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		int totalLinks = linksList.size();
		System.out.println("total links on the page : "+ totalLinks);
		
		for(int i = 0; i<totalLinks; i++){
			String text = linksList.get(i).getText();
			
			if(! text.isEmpty()){
				System.out.println(i+ "--->"+ text);
				//System.out.println(linksList.get(i).getAttribute("href"));
			}
		}
		
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("total images : "+ imagesList.size());
		
		
		
		
	}

}
