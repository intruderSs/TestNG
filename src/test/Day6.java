package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day6 {
	
	int i = 0;
	
	@Test(dataProvider = "getData")
	public void WebLoginHome (String username, String password) {
	
		System.out.println("Day 6: Data Provider Annotation");
		System.out.println(username);
		System.out.println(password);
		i++;
		System.out.println(i);
	}
	
	@DataProvider
	public Object[][] getData () {
		
		Object[][] dataObjects = new Object[3][2];
		dataObjects[0][0] = "First User Name";
		dataObjects[0][1] = "First password";
		
		dataObjects[1][0] = "Second User Name";
		dataObjects[1][1] = "Second password";
		
		dataObjects[2][0] = "Third User Name";
		dataObjects[2][1] = "Third password";
		return dataObjects;
	}

}
