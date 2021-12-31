package ex5;

import ex5.Point2D;

public class Point2D {
	private double x = 1.0;
	private double y = 1.0;
	
	public Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public final double getX() {
		return this.x;
	}
	
	public final double getY() {
		return this.y;
	}
	
	public double distance(double x1, double y1) {
		double a = getX() - x1;
		double b = getY() - y1;
		return Math.sqrt(a * a + b * b);
	}
	
	public double distance(Point2D point) {
		return distance(point.getX(), point.getY());
	}
	
	public Point2D midpoint(double x, double y) {
		return new Point2D(
				x + (getX() - x) / 2.0,
				y + (getY() - y) / 2.0);
	}
	
	public Point2D midpoint(Point2D point) {
		return midpoint(point.getX(), point.getY());
	}
	
	public String toString() {
		return "Point2D [x = " + getX() + ", y = " + getY() + "]";
	}
	
}
