package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeMethod
	public void beforeEveryMethod () {
		System.out.println("Before Method: I will execute before every methods");
		
	}
	
	@AfterMethod
	public void afterEveryMethod () {
		System.out.println("After Mehod: I will execute before every methods");
	}
	
	
	@Parameters({ "URL" })
	@Test(groups = {"Smoke"})
	public void Demo (String urlName) {
		System.out.println("Smoke: Hello World");
		System.out.println("Day 1 "+urlName);
	}
	
	@Test
	public void secondClass () {
		System.out.println("I am from Second Class");
	}
	
	@BeforeTest
	public void thirdClass () {
		System.out.println("I will excute before tests");
	}
	
	@AfterTest
	public void fourthClass () {
		System.out.println("I will excute after tests");
	}
	
	@AfterSuite
	public void afterSuite () {
		System.out.println("After Suite: I am the Last");
	}


}
