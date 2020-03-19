package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementConcept {
	
	static JavaScriptUtil jsUtil;


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		jsUtil = new JavaScriptUtil(driver);

		Thread.sleep(5000);

		// WebElement email = driver.findElement(By.id("username"));
		// email.sendKeys("test@gmail.com");
		//
		// driver.findElement(By.id("username")).sendKeys("test");

		// By locators:
		By email = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		By signUpLink = By.linkText("Sign up");

		// web elements:
		// driver.findElement(email).sendKeys("test@gmail.com");
		// driver.findElement(password).sendKeys("test@123");
		// driver.findElement(loginButton).click();
		// driver.findElement(signUpLink).isDisplayed();

		// getElement(driver, email).sendKeys("test@gmail.com");
		// getElement(driver, password).sendKeys("test@123");

		doSendKeys(driver, email, "test@gmail.com");
		doSendKeys(driver, password, "test@123");
		doClick(driver, loginButton);
		
		if(doIsDisplayed(driver, signUpLink)){
			String text = doGetText(driver, signUpLink);
			System.out.println(text);
		}
		else{
			System.out.println(signUpLink + " is not found...");
		}

	}

	/**
	 * this method is used to create the webelement on the basis of By locators
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			jsUtil.flash(element);
		} catch (Exception e) {
			System.out.println("WebElement could not be created " + locator);
		}
		return element;
	}

	/**
	 * this is used to pass the values
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void doSendKeys(WebDriver driver, By locator, String value) {
		getElement(driver, locator).sendKeys(value);
	}

	/**
	 * this is used for clicking on an element
	 * @param driver
	 * @param locator
	 */
	public static void doClick(WebDriver driver, By locator) {
		getElement(driver, locator).click();
	}

	/**
	 * this is used for getting the text
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String doGetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}
	
	/**
	 * this is used for checking element is displayed
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static boolean doIsDisplayed(WebDriver driver, By locator){
		return getElement(driver, locator).isDisplayed();
	}

}
