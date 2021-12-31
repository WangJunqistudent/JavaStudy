package ex6;

public class LinearEquation {
	private double a, b, c, d, e, f;
	
	public LinearEquation() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.d = 0;
		this.e = 0;
		this.f = 0;
	}
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public double getD() {
		return this.d;
	}
	
	public double getE() {
		return this.e;
	}
	
	public double getF() {
		return this.f;
	}
	
	public boolean isSolvable() {
		if (this.a * this.d - this.b * this.c != 0) {
			return true;
		}
		else {
		    return false;
		}
	}
	
	public double getX() {
		return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
	}
	
	public double getY() {
		return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
	}

}
