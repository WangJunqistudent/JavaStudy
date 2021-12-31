package ex5;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		//9-1
		/*//create a circle with radius 1
		Circle circle1 = new Circle();
		System.out.println("The area of the circle of radius" + 
		circle1.radius + " is " + circle1.getArea());
		//create a circle with radius 25
		Circle circle2 = new Circle(25);
		System.out.println("The area of the circle of radius" + 
		circle2.radius + " is " + circle2.getArea());
		//create a circle with radius 125
		Circle circle3 = new Circle(125);
		System.out.println("The area of the circle of radius" + 
		circle3.radius + " is " + circle3.getArea());
		//modify circle radius
		circle2.radius = 100;
		System.out.println("The area of the circle of radius" + 
		circle2.radius + " is " + circle2.getArea());*/
		
		/*double radius;
		//construct a radius with radius 1
		Circle() {
			radius = 1;
		}
		//construct a circle with a specified radius
		Circle(double newRadius) {
			radius = newRadius;
		}
		//return the area of this circle
		double getArea() {
			return radius * radius * Math.PI; 
		}
		//return the perimeter of this circle
		double getPerimeter() {
			return 2 * radius * Math.PI;
		}
		//set a new radius for this circle
		void setRadius(double newRadius) {
			radius = newRadius;
		}*/
		
		//9-4
		/*TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumUp();
		
		System.out.println("tv1's channel is " + tv1.channel
				+ " and volume level is " + tv1.volumeLevel);
		System.out.println("tv2's channel is " + tv2.channel
				+ " and volume level is " + tv2.volumeLevel);*/
		
		//9-5
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter point1's x-,y-coordinates:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter point2's x-,y-coordinates:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		System.out.println("p1 is" + p1.toString());
		System.out.println("p2 is" + p2.toString());
		System.out.println("The distance is " + p1.distance(p2));
		System.out.println("The midpoint is " + p1.midpoint(p2).toString());*/
		
		//9-7
		/*System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + 
		Circle.numberOfObjects);
		
		Circle c1 = new Circle();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + 
				") and number of Circle objects (" + 
				c1.numberOfObjects + ")");
		
		Circle c2 = new Circle(5);
		c1.radius = 9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + 
				") and number of Circle objects (" + 
				c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + 
				") and number of Circle objects (" + 
				c2.numberOfObjects + ")");*/
		
		//9-9
		/*Circle myCircle = new Circle(5.0);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of the objects create is "
				+ myCircle.getNumberOfObjects());*/
		
		//9-10
		/*Circle myCircle = new Circle(1);
		
		int n = 5;
		printAreas(myCircle, n);
		
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);*/
		
		//9-11
		Circle[] circleArray;
		circleArray = createCircleArray();
		
		printCircleArray(circleArray);
		
	}
	
	//9-10
	public static void printAreas(Circle c, int times) {
		System.out.println("Radius \t\tArea");
		
		while (times >= 1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
	
	//9-11
	public static Circle[] createCircleArray() {
		Circle[] circleArray = new Circle[5];
		
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle(Math.random() * 100);
		}
		
		return circleArray;
	}
	
	public static void printCircleArray(Circle[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
			circleArray[i].getArea());
		}
		
		System.out.println("                  ");
		System.out.printf("%-30s%-15f\n", "The total area of circle is",
				sum(circleArray));
	}
	
	public static double sum(Circle[] circleArray) {
		double sum = 0;
		
		for (int i = 0; i < circleArray.length; i++) {
			sum += circleArray[i].getArea();
		}
		
		return sum;
	}
}


