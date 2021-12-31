package ex7;

import ex7.GeometricObject;
import ex7.GraduateStudent;
import ex7.Person;
import ex7.Student;

public class ex7 {
	public static void main(String[] args) {
		//11-4
		/*Circle circle = new Circle(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());*/
		
		//11-5
		/*displayObject(new Circle(1, "red", false));
		displayObject(new Rectangle(1, 1, "black", true));*/
		
		//11-6
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());

	}
	//11-5
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() + 
				". Color is " + object.getColor());
	}
	//11-6
	public static void m(Object x) {
		System.out.println(x.toString());
	}
}

class GraduateStudent extends Student {
	
}

class Student extends Person {
	@Override
	public String toString() {
		return "Student";
	}
}

class Person extends Object {
	@Override
	public String toString() {
		return "Person";
	}
}
