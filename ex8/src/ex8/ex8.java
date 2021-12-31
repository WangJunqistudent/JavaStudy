package ex8;

import java.util.Scanner;
import java.util.ArrayList;

public class ex8 {

	public static void main(String[] args) {
		//11-8
		/*Account account = new Account("George", 1122, 1000);
		account.setAnnualInterestRate(1.5);
		account.deposit(30);
		account.withDraw(5);
		System.out.println(account.getName() + " " + account.getMonthlyInterest() 
		+ " " + account.getBalance());*/
		
		//11-16
		/*int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		
		ArrayList<Integer> answers = new ArrayList<Integer>();
		int answer = input.nextInt();
		
		while (number1 + number2 != answer) {
			if (answers.contains(answer)) {
				System.out.print("You already entered " + answer);
			}
			else {
				System.out.print("Wrong answer. Try again.");
				answers.add(answer);
			}
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");*/
		
		//11-17
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int n = 1;
		while(true) {
		    for (int i = 1; i <= m; i++) {
			    if (m * n == i * i) {
			    	System.out.println("The smallest n is " + n);
			    	System.out.println("m * n is " + (m * n));
				    return;
			    }
		    }
		    n++;
		}*/
		
		//11-19
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of objects: ");
		int number = input.nextInt();
		System.out.print("Enter the weights of the objects: ");
		ArrayList<ArrayList<Integer>> contains = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> weights = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			weights.add(input.nextInt());
		}
		
		for (int i = 0; i < weights.size(); i++) {
			ArrayList<Integer> objects = new ArrayList<Integer>();
			if (weights.get(i) <= 10) {
				objects.add(weights.get(i));
				contains.add(objects);
			}
			for (int j = i + 1; j < weights.size(); j++) {
				if (weights.get(i) + weights.get(j) <= 10) {
					objects.add(weights.get(j));
					weights.remove(j);
				}
			}
		}
		
		for (int i = 0; i < contains.size(); i++) {
			System.out.print("Container " + (i + 1) + " contains objects with weight ");
			for (int j = 0; j < contains.get(i).size(); j++) {
			    System.out.print(contains.get(i).get(j) + " ");
			}
			System.out.println();
		}*/
		
	}

}
