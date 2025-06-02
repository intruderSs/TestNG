package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	@BeforeClass
	public void beforeClass () {
		System.out.println("Before Class");
	}
	
	@Parameters({ "URL" })
	
	@Test(groups = {"Smoke"})
	public void methodFromDay2Class (String urlName) {
		System.out.println("Smoke: I am from day 2 class");
		System.out.println(" Day 2 URL: "+urlName);
	}
	
	@AfterClass 
	public void afterClass () {
		System.out.println("After Class");
	}

}
