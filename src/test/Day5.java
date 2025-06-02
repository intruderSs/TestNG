package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day5 {
	
	@Test
	public void Shahil () {
		System.out.println("Day 5: Data Provider Annotation");
	}
	
	@Parameters({ "username", "password" })
	@Test
	public void Sinha (String shahil, String sinha) {
		System.out.println(">>>>>>>");
		System.out.println(shahil);
		System.out.println(sinha);
		Assert.assertTrue(false);
	}

}
