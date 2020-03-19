package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.remote.RemoteWebElement;

public class Rating {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.tripadvisor.in/UserReviewEdit-g641714-d1156207-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");
		
		String cssSelector = "span#bubble_rating";
		WebElement ele = driver.findElement(By.cssSelector(cssSelector));
//        Coordinates c = ((RemoteWebElement) ele).getCoordinates();
//        int x = c.inViewPort().x;
//        int y = c.inViewPort().y;
//        
        int x = ele.getLocation().x;
        int y = ele.getLocation().x;

        
		Actions action = new Actions(driver);
		action.moveToElement(ele, x , y-60 ).click().perform();
		
		
	
	}

}
