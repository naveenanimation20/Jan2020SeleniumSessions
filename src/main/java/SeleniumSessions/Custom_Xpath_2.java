package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Custom_Xpath_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver_80");
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.get("https://app.hubspot.com/login");//enter url
		
		driver.findElement(By.id("username")).sendKeys("naveenanimation30@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://app.hubspot.com/contacts/6329229/contacts/list/view/all/?");
		
		Thread.sleep(5000);
		
		selectContact(driver, "Shalu LN3");
		selectContact(driver, "Irina LN4");

		
		
		//driver.findElement(By.xpath("//span[text()='Naveen LN2']//ancestor::td//preceding-sibling::td//input")).click();

		//text():
		//h1[text()='A fresh approach to customer engagement']
		//div[text()='GET STARTED']
		//a[text()='Sign Up']
		
		//contains():
		//input[contains(@id,'username')]
		//button[contains(@type,'submit')]
		//i18n-string[contains(text(),'Sign up')]
		//button[contains(@type,'submit') and @id='loginBtn']
		//*[contains(@type,'submit') and contains(@id,'loginBtn')]
		
		// <input "id=username_123"/>
		// <input "id=username_11222"/>
		// <input "id=username_1232323"/>
		
		//input[starts-with(@id,'username_')]
		
		//input[contains(@id,'username_')]
		//*[contains(@type,'submit') and @id='loginBtn']

		//i18n-string[text()='*[a-z A-Z 0-9]']
		//input[starts-with(@id,'user')]
		
		//xpath axes:
		//div[@class='input-group']//following::input[@type='text']
		// (//div[@class='input-group']//following::input)[1]
		//ul[@class='l-nav-list nav-main-menu']//following::li[contains(@class,'nav-main-item')]
		
		//input[@id='username']//preceding::div
		//div[@class='input-group']//ancestor::div[@class='container']
		
		
		//span[text()='Naveen LN2']//ancestor::td//preceding-sibling::td//input
		
		//a[text()='da ca']//parent::td//preceding-sibling::td/input[@type='checkbox']
		//a[text()='Shafali Verma']//parent::div//following-sibling::div[@class='cell runs']
		
	}
	
	public static void selectContact(WebDriver driver, String name){
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath("//span[text()='"+name+"']"
				+ "//ancestor::td//preceding-sibling::td//input/.."))).perform();
		
	}

}
