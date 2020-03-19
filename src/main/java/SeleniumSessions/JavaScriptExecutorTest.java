package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		//Thread.sleep(5000);
		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		jsutil.checkPageIsReady();

		//jsutil.generateAlert("hi alert!!");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
//		jsutil.clickElementByJS(loginbutton);
//		
		//jsutil.drawBorder(loginbutton);
		//jsutil.refreshBrowserByJS();
		//System.out.println(jsutil.getBrowserInfo());
		
//		System.out.println(jsutil.getPageInnerText());
//		
//		if(jsutil.getPageInnerText().contains("Companies & Contacts")) System.out.println(true);
//		if(jsutil.getPageInnerText().contains("Deals & Sales Pipeline")) System.out.println(true);

	//	System.out.println(jsutil.getTitleByJS());
		
		//jsutil.sendKeysUsingJSWithId("username", "Naveen");
		//jsutil.scrollPageDown();
		
		WebElement forgotPwd = driver.findElement(By.linkText("Forgot Password?"));
		jsutil.scrollIntoView(forgotPwd);
		
		jsutil.flash(forgotPwd);
		
	}

}
