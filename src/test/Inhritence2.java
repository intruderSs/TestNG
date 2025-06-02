package test;

import org.testng.annotations.Test;

public class Inhritence2 extends Inheritence1 {
	
	@Test
	public void testRun () {
		executeMe();
		Inheritence3 three  = new Inheritence3(3, 9);;
		System.out.println(three.increment());
		System.out.println(three.decrement());
		
		System.out.println(three.multiplication());
	}

}
