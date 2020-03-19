package SeleniumSessions;

import org.openqa.selenium.By;

public class Custom_Xpath_1 {

	public static void main(String[] args) {
		
		

		//1. abs xpath:
			//html/body/div[1]/div[7]/div[3]/ul/li/a
		//2. relative xpath/custom xpath
			//a[@id='test']
			//ul//li//a[@id='test']
		//input[@id='username']
		//input[@id='username' and @type]
		//input[@id='username' and @type='email'] --1
		//input[@id and @type='email'] -- 1 
		//input[@id and @type] -- 3
		//i18n-string[text()='Sign up']
		//a//i18n-string[text()='Sign up']
		
		//a[text()='Forgot Password?']
		
		//input[@type='submit']
		//input[@type='submit' and @value='Login']
		//input[@class='form-control private-form__control login-email']
		By username1 = By.className("login-email"); //-- right
		By username2 = By.xpath("//input[@class='form-control private-form__control login-email']");
		By username3 = By.cssSelector(".form-control.private-form__control.login-email");
		// input.form-control.private-form__control.login-email
		
		// (//input[@type])[1]
		// (//input[@type])[position()=3]
		// (//input[@type])[last()]
		
		//ul[@class='l-nav-list nav-main-menu']/li -- 8
		//ul[@class='l-nav-list nav-main-menu']//li -- 38
		
		//div//button -- 3
		//div/button -- 0
		
		//input[@id='username']/../../../../../../../../../..
		
	}

}
