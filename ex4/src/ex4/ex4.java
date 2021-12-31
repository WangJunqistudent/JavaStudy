package ex4;

import java.util.*;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7.3
		/*Scanner input = new Scanner(System.in);
		int[] numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		
		while(true) {
			int num = input.nextInt();
			if(num == 0)
				break;
		    numbers[num]++;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				if (numbers[i] == 1) {
					System.out.println(i + " occurs " + numbers[i] + " time");
				}
				else {
					System.out.println(i + " occurs " + numbers[i] + " times");
				}
			}
		}*/
		
		//7.5
		/*Scanner input = new Scanner(System.in);
	    System.out.print("Enter 10 numbers: ");
	    int[] numbers = new int[10];
	    int input_number = 0, count = 0;
	    
	    for (int i = 0 ; i < 10 ; i++) {
	    	int flag = 0;
	        input_number = input.nextInt();
	         
	        for (int j = 0 ; j < i ; j++) {
	            if (numbers[j] == input_number) {
	                flag = 1;
	            }
	        }
	        
	        if (flag == 0) {
	            numbers[count] = input_number;
	            count++;
	        }
	    }

	    System.out.println("The number of distinct numbers is " + count);
	    System.out.print("The distinct numbers are: ");
	    
	    for (int i = 0 ; i < count ; i++) {
	        System.out.print(numbers[i] + " ");
	    }*/
		
		//7.18
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		double[] numbers = new double[10];
		int i, j;
		
		for (i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		for (i = 0; i < numbers.length - 1; i++) {
			int flag = 0;
			for (j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j+1]) {
					double t = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = t;
					flag = 1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		
		for(i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}*/
		
	}
}
