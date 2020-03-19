package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	
	@Test(invocationCount=10)
	public void CreateUser(){
		System.out.println("create user test....");
		//hit ur API
	}
	
	

}
