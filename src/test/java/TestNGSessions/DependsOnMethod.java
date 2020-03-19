package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(priority=1)
	public void loginTest(){
		System.out.println("login test...");
	}
	
	@Test(priority=2, dependsOnMethods="loginTest")
	public void homePageTest(){
		System.out.println("home page test");
		int i = 9/0;
	}
	
	@Test(priority=3, dependsOnMethods= {"loginTest", "homePageTest"})
	public void SearchTest(){
		System.out.println("search test....");
	}
	

}
