package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Inheritence1 {
	
	public void executeMe () {
		System.out.println("I am from Inheritence 1");
	}
	
	@BeforeMethod
	public void beforeExecute () {
		System.out.println("BEFORE");
	}

	@AfterMethod
	public void afterExecute () {
		System.out.println("AFTER");
	}
}
