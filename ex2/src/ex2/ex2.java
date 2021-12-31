package ex2;
import java.util.*;
public class ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//2-1
//		double radius; // Declare radius
//		double area; // Declare area
//		
//		// Assign a radius
//		radius = 20; // radius is now 20
//		
//		// Compute area
//		area = radius * radius * 3.14159;
//		
//		// Display results
//		System.out.println("The area for the circle of radius" +
//		radius + "is" + area);
//		
//		//2-2
//		//Create a Scanner object
//		Scanner input = new Scanner(System.in);
//		
//		//Prompt the user to enter a radius
//		System.out.print("Enter a number for radius: ");
//		double radius = input.nextDouble();
//		
//		//Compute area
//		double area = radius * radius * 3.14159;
//		
//		//Display results
//		System.out.println("The area for the circle of radius " + 
//		radius + "is" + area);
//		
//		//2-3
//		//Create a Scanner object
//		Scanner input = new Scanner(System.in);
//		
//		//Prompt the user to enter three numbers
//		System.out.print("Enter three numbers: ");
//		double number1 = input.nextDouble();
//		double number2 = input.nextDouble();
//		double number3 = input.nextDouble();
//		
//		//Compute average
//		double average = (number1 + number2 + number3) / 3;
//		
//		//Display results
//		System.out.println("The average of " + number1 + " " + number2
//				+ " " + number3 + "is" + average);
//		
//		//2-4
//		final double PI = 3.14159; // Declare a constant
//		
//		//Create a Scanner object
//		Scanner input = new Scanner(System.in);
//		
//		//Prompt the user to enter a radius
//		System.out.print("Enter a number for radius: ");
//		double radius = input.nextDouble();
//		
//		//Compute area
//		double area = radius * radius * PI;
//				
//		//Display results
//		System.out.println("The area for the circle of radius " + 
//		 radius + "is" + area);
//		
//		//2-5
//		Scanner input = new Scanner(System.in);
//		
//		//Prompt the user for input
//		System.out.print("Enter an integer for seconds: ");
//		int seconds = input.nextInt();
//		
//		int minutes = seconds / 60; // Find minutes in seconds
//		int remainingSeconds = seconds % 60; // Seconds remaining
//		System.out.println(seconds + "seconds is " + minutes +
//				" minutes and " + remainingSeconds + " seconds");
//		
//		//2-6
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter a degree in Fahrenheit: ");
//		double fahrenheit = input.nextDouble();
//		
//		//Convert Fahrenheit to Celsius
//		double celsius = (5.0 / 9) * (fahrenheit - 32);
//		System.out.println("Fahrenheit " + fahrenheit + " is " +
//		celsius + " in Celsius");
//		
//		//2-7
//		//Obtain the total miiliseconds since midnight
//		long totalMillseconds = System.currentTimeMillis();
//		
//		//Obtain the total seconds since midnight
//		long totalSeconds = totalMillseconds / 1000;
//		
//		//Compute the current second in the minute in the hour
//		long currentSecond = totalSeconds % 60;
//		
//		//Obtain the total minutes
//		long totalMinutes = totalSeconds / 60;
//		
//		//Compute the current minute in the hour
//		long currentMinute = totalMinutes % 60;
//		
//		//Obtain the total hours
//		long totalHours = totalMinutes / 60;
//		
//		//Compute the current hour
//		long currentHour = totalHours % 24;
//		
//		//Display results  CHN: GMT + 8h
//		System.out.println("Current time is " + currentHour + ":"
//		 + currentMinute + ":" + currentSecond + "GMT");
//		
//		//2-8
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter purchase amout: ");
//		double purchaseAmount = input.nextDouble();
//		
//		double tax = purchaseAmount * 0.06;
//		System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
//		
//		//2-9
//		//Create a Scanner
//        Scanner input = new Scanner(System.in);
//		
//        //Enter annual interest rate in percentage
//		System.out.print("Enter annual interest rate: ");
//		double annualInterestRate = input.nextDouble();
//		
//		//Obtain monthly interest rate
//		double monthlyInterestRate = annualInterestRate / 1200;
//		
//		//Enter number of years
//		System.out.print("Enter number of years as an integer: ");
//		int numberOfYears = input.nextInt();
//		
//		//Enter loan amount
//		System.out.print("Enter loan amount: ");
//		double loanAmount = input.nextDouble();
//		
//		//Calculate payment
//		double monthlyPayment = loanAmount * monthlyInterestRate /
//		(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
//		double totalPayment = monthlyPayment * numberOfYears * 12;
//		
//		//Display results
//		System.out.print("The monthly payment is $" + 
//		(int)(monthlyPayment * 100) / 100.0);
//		System.out.print("The total payment is $" + 
//				(int)(totalPayment * 100) / 100.0);
		
		//2-10
		//Create a Scanner
        Scanner input = new Scanner(System.in);
		
        //Receive the amount
		System.out.print("Enter an amount in double: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		//Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		
	}
}