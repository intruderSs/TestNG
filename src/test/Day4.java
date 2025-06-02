package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	
	
	@Test
	public void WebLoginHome () {
		System.out.println("Web Login Home");
		
	}
	
	@Parameters({ "URL" })
	@Test
	public void MobileLoginHome (String name) {
		System.out.println("Mobile Login Home");
		System.out.println("Day 4"+name);
	}
	
	@Test
	public void MobileSignIn () {
		System.out.println("Mobile Sign In Home");
	}
	
	@Test
	public void MobileSignOut () {
		System.out.println("Mobile Sign Out Home");
	}
	
	
	@Test(groups = {"Smoke"})
	public void APILoginHome () {
		System.out.println("Smoke: API Login Home");
	}
	
	@BeforeSuite
	public void beforeSuite () {
		System.out.println("Before Suite: I am the first");
	}

}
