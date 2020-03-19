package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch chrome

		driver.get("https://app.hubspot.com/login");//enter url
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.className("signup-link")).getText();
		System.out.println(text);
		
		
		//click - links, buttons, images, checkbox, radiobuttons
		//sendkeys -- text fields
		//get text -- getting the text from a label, text, error mesg
		
		
		
	}

}
