package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		//Javascript Alert - Pop up
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch chrome

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
				
		Alert alert = driver.switchTo().alert();
		
		String text  = alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct messg");
		}else{
			System.out.println("incorrect messg");
		}
		
		alert.accept();//click on OK
		//alert.dismiss(); //click on cancel/dismiss the alert
		
		
	}

}
