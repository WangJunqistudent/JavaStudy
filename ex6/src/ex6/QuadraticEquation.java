package ex6;

public class QuadraticEquation {
	private int a, b, c;
	
	public QuadraticEquation() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public int getC() {
		return this.c;
	}
	
	public double getDiscriminant() {
		return this.b * this.b - 4 * this.a * this.c;
	}
	
	public double getRoot1() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		else {
			return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
		}
		
	}
	
	public double getRoot2() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		else {
			return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
		}
	}

}
