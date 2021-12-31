package ex6;

import java.util.Date;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		//9.3
		/*long x1 = 10000l;
		Date t1 = new Date(x1);
		System.out.println(t1.toString());
		long x2 = 100000l;
		Date t2 = new Date(x2);
		System.out.println(t2.toString());
		long x3 = 1000000l;
		Date t3 = new Date(x3);
		System.out.println(t3.toString());
		long x4 = 10000000l;
		Date t4 = new Date(x4);
		System.out.println(t4.toString());
		long x5 = 100000000l;
		Date t5 = new Date(x5);
		System.out.println(t5.toString());
		long x6 = 1000000000l;
		Date t6 = new Date(x6);
		System.out.println(t6.toString());
		long x7 = 10000000000l;
		Date t7 = new Date(x7);
		System.out.println(t7.toString());
		long x8 = 100000000000l;
		Date t8 = new Date(x8);
		System.out.println(t8.toString());*/
		
		//9.4
		/*Random seed = new Random(1000);
		for (int i = 0; i < 50; i++) {
			System.out.print(seed.nextInt(100) + " ");
		}*/
		
		//9.5
		/*GregorianCalendar date = new GregorianCalendar();
		int year = 0, month = 0, day = 0;
		year = date.get(GregorianCalendar.YEAR);
		month = date.get(GregorianCalendar.MONTH) + 1;
		day = date.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println(year + ":" + month + ":" + day);
		
		long mills = 1234567898765l;
		date.setTimeInMillis(mills);
		year = date.get(GregorianCalendar.YEAR);
		month = date.get(GregorianCalendar.MONTH) + 1;
		day = date.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println(year + ":" + month + ":" + day);*/
		
		//9.6
		/*int n1 = 125, n2 = 2525;
		int gcd = 1;
		int k = 2;
		final long MAXK = 1000000;
	    StopWatch time = new StopWatch();
	    time.start();
	    for (int i = 0; i < MAXK; i++) {
		    while (k <= n1 && k <= n2) {
			    if (n1 % k == 0 && n2 % k == 0) {
				    gcd = k;
			    }
			    k++;
		    }
	    }
		time.stop();
		System.out.println("The greatest common divisor is " + gcd);
		System.out.println(time.getElapsedTime());*/
		
		//9.10
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		double r1 = 0, r2 = 0;
		QuadraticEquation exp = new QuadraticEquation(a, b, c);
		
		if (exp.getDiscriminant() < 0) {
			System.out.println("The equation has no roots");
		}
		else if(exp.getDiscriminant() == 0) {
			r1 = exp.getRoot1();
			System.out.println("The equation has same roots: " + r1);
		}
		else {
			r1 = exp.getRoot1();
			r2 = exp.getRoot2();
			System.out.println("The equation has roots: " + r1 + ", "+ r2);
		}*/
		
		//9.11
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);
		if (!linear.isSolvable()) {
			System.out.println("The equation has no solution");
		}
		else {
			System.out.println("x is " + linear.getX() + " and y is " + linear.getY());
		}*/
		
	}

}
