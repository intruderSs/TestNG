package test;

public class Inheritence3 extends Inheritence4 {
	
	int a;
	int b;
	
	public Inheritence3 (int a, int b) {
		super(a);
		this.a = a;
		this.b = b;
	}

	public int increment () {
		a = a+1;
		return a;
	}
	
	public int decrement () {
		b = b-1;
		return b;
	}
	
}
