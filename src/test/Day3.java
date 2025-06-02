package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void WebLoginCar () {
		System.out.println("Web Login Car");
	}
	
	@Parameters({ "URL" })
	@Test
	public void MobileLoginCar (String urlName) {
		System.out.println("Mobile Login Car");
		System.out.println("Day 3 "+urlName);
	}
	
	@Test(groups = {"Smoke"}, dependsOnMethods = {"WebLoginCar"} )
	public void APILoginCar () {
		System.out.println("Smoke: API Login Car");
	}

}
