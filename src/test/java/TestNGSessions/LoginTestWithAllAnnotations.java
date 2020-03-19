package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithAllAnnotations {

	// Before -- BS BT BC BM
	// Test -- @Test
	// After -- AM AC AT AS
	
	/*
	 * BS
	 * BT
	 * BC
	 * 
	 * BM
	 * T1
	 * AM
	 * 
	 * BM
	 * T2
	 * AM
	 * 
	 * AC
	 * AT
	 * AS
	 * 
	 */

	WebDriver driver;

	By username = By.id("username");
	By password = By.id("password");
	By login = By.id("loginBtn");
	By signup = By.linkText("Sign up");
	By homePageHeader = By.className("private-page__title");

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite -- prepare test data");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test---DB connection");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class -- get the value from DB");
	}

	@BeforeMethod
	public void setup() {
		System.out.println("before method -- setup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void signUpLinkTest() {
		System.out.println("test method 1");
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
	}

	@Test(priority = 2, enabled=false)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "HubSpot Login");
	}

	@Test(priority = 3, enabled=false)
	public void loginTest() {
		driver.findElement(username).sendKeys("naveenanimation30@gmail.com");
		driver.findElement(password).sendKeys("Test@1234");
		driver.findElement(username).click();
		String homePageHeaderVal = driver.findElement(homePageHeader).getText();
		Assert.assertTrue(homePageHeaderVal.contains("Sales Dashboard"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class -- delete the user");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test -- disconnect the DB");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite -- delete test data");
	}

}
