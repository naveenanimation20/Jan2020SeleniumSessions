package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println("total frames: "+ frameCount);
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		
		WebElement frameElement = driver.findElement(By.name("main"));
		// /html/frameset/frameset/frameset/frame[1]
		
		driver.switchTo().frame(frameElement);
		
		String text = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
