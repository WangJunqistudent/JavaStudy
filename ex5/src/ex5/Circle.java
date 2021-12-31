package ex5;

public class Circle {
	//9-1
	/*private double radius;
	//construct a radius with radius 1
	public Circle() {
		radius = 1;
	}
	//construct a circle with a specified radius
	public Circle(double newRadius) {
		radius = newRadius;
	}
	//return the area of this circle
	public double getArea() {
		return radius * radius * Math.PI; 
	}
	//return the perimeter of this circle
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	//set a new radius for this circle
	public void setRadius(double newRadius) {
		radius = newRadius;
	}*/
	
	//9-6
	/*double radius;
	static int numberOfObjects = 0;
	
	public Circle() {
		radius = 1;
		numberOfObjects++;
	}
	
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}*/
	
	//9-8
	private double radius = 1;
	private static int numberOfObjects = 0;
	
	public Circle() {
		numberOfObjects++;
	}
	
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double newRadius) {
		this.radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
}
