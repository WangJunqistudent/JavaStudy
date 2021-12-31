package ex3;

import java.util.*;
import java.text.*;

public class ex3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//3.4
		/*int lottery = 1 + (int)(Math.random()*12);
		switch(lottery) {
		case 1:System.out.println("January");
		       break;
		case 2:System.out.println("Fabruary");
	           break;
		case 3:System.out.println("March");
	           break;
		case 4:System.out.println("April");
               break;
		case 5:System.out.println("May");
               break;
		case 6:System.out.println("June");
               break;
		case 7:System.out.println("July");
               break;
		case 8:System.out.println("August");
               break;
		case 9:System.out.println("September");
               break;
		case 10:System.out.println("October");
               break;
		case 11:System.out.println("November");
               break;
		case 12:System.out.println("December");
               break;
        default:break;*/
		
		//3.9
		/*Scanner input = new Scanner(System.in);
		String isbn = input.nextLine();
		int total = 0;
		for(int i = 0; i < 9; i++) {
			String str = String.valueOf(isbn.charAt(i));
			total += Integer.parseInt(str) * i;
		}
		if(total % 11 == 10) {
			System.out.println(isbn + 'X');
		}
		else {
			System.out.println(isbn);
		}*/
		
		//3.15
		/*int [] A = new int[10];
		int [] B = new int[10];
		for(int i = 0;i < 10;i++) {
			A[i] = 0;
			B[i] = 0;
		}
		int lottery = (int)(100+Math.random()*900);
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery % 10;
	    A[lotteryDigit1] = lotteryDigit1;
	    A[lotteryDigit2] = lotteryDigit2;
	    A[lotteryDigit3] = lotteryDigit3;
		
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter you lottery pick (three digits): ");
		int guess = input.nextInt();
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess % 10;
		B[guessDigit1] = guessDigit1;
	    B[guessDigit2] = guessDigit2;
	    B[guessDigit3] = guessDigit3;
		
		System.out.println("The lottery number is " + lottery);
		
		if(guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		}
		else if(Arrays.equals(A, B)) {
			System.out.println("Match all digits: you win $3,000");
		}
		else if((guessDigit1!=lotteryDigit1 && guessDigit1!=lotteryDigit2 && guessDigit1!=lotteryDigit3)
				&& (guessDigit2!=lotteryDigit1 && guessDigit2!=lotteryDigit2 && guessDigit2!=lotteryDigit3)
				&& (guessDigit3!=lotteryDigit1 && guessDigit3!=lotteryDigit2 && guessDigit3!=lotteryDigit3)) {
			System.out.println("Sorry, no match");
		}
		else {
			System.out.println("Match one digit: you win $1,000");
		}*/
		
		//3.19
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter three number: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println(a+b+c);
		}
		else {
			System.out.println("Illgal numbers");
		}*/
		
		//3.21
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter month: ");
		int month = input.nextInt();
		System.out.print("Enter day: ");
		int day = input.nextInt();
		if(month == 1 || month == 2) {
			month = month + 12;
			year = year - 1;
		}
		int h = (int)(day + 26*(month + 1) / 10 + year % 100 + 
				year % 100 / 4 + year / 400 + year / 20) % 7;
		String s = null;
		switch(h) {
		case 0:s = "Saturday"; break;
		case 1:s = "Sunday"; break;
		case 2:s = "Monday"; break;
		case 3:s = "Tuesday"; break;
		case 4:s = "Wednesday"; break;
		case 5:s= "Thursday"; break;
		case 6:s="Friday"; break;
		default: break;
		}
		System.out.println("Day of the week is: " + s);*/
		
		//3.22
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter (x,y): ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double distance = 0;
		distance = Math.sqrt(x * x + y * y);
		if(distance <= 10) {
			System.out.println("The point is in the circle");
		}
		else {
			System.out.println("The point isn't in the circle");
		}*/
		
		//3.23
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter (x,y): ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		if(x <= 5 && y <= 2.5) {
			System.out.println("The point is in the rectangle");
		}
		else {
			System.out.println("The point isn't in the rectangle");
		}*/
		
		//3.24
		/*int number = (int)Math.random() * 12;
		int color = (int)Math.random()*4;
		String s1 = null, s2 = null;
		String[] num = new String[] {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] col = new String[] {"Clubs","Diamonds","Hearts","Spades"};
		s1 = num[number]; 
		s2 = col[color];
		System.out.println("The card you picked is " + s1 + " of " + s2);*/
		
		//3.27
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter (x,y): ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		if(y <= -0.5*x + 100 && x <= 200 && y <= 100) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}*/
		
		//3.28
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter r1'center, width, height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.print("Enter r2'center, width, height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		double distanceX = Math.abs(x2 - x1);
		double distanceY = Math.abs(y2 - y1);
		if(distanceX <= width1 / 2.0 && distanceY <= height1 / 2.0) {
			System.out.println("r2 is inside r1");
		}
		else if(distanceX < width1 + width2 && distanceY < height1 + height2) {
			System.out.println("r2 overlaps r1");
		}
		else {
			System.out.println("r2 does not overlap r1");
		}*/
		
		//3.29
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter r1'center, radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		System.out.print("Enter r2'center, radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		if(distance <= Math.abs(radius1 - radius2)) {
			System.out.println("circle2 is inside circle1");
		}
		else if(distance <= radius1 + radius2) {
			System.out.println("circle2 overlaps circle1");
		}
		else {
			System.out.println("circle2 does not overlap circle1");
		}*/
		
		//5.17
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = n-i; j > 0; j--) {
				System.out.print("  ");
			}
			for(int k = i; k > 0; k--) {
			    System.out.print(k + " ");
			}
			for(int p = 1; p <= i; p++) {
				if(p == i) break;
				System.out.print((p + 1) + " ");
			}
			System.out.println();
		}*/
		
		//5.19
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = input.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j = n-i; j > 0; j--) {
				System.out.print("    ");
			}
			for(int k = 0; k < i; k++) {
			    System.out.printf("%4d",(int)Math.pow(2, k));
			}
			for(int p = i; p > 1; p--) {
				System.out.printf("%4d",(int)Math.pow(2, p-2));
			}
			System.out.println();
		}*/
		
		//5.21
		/*Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount = input.nextDouble();
		System.out.print("Number of Years: ");
		int year = input.nextInt();
		double monthlyPayment = 0, totalPayment = 0;
		for(int i = 5000; i <= 8000; i += 125) {
			double mi = i / 1200000.0;
			monthlyPayment = amount * mi / (1 - 1 / Math.pow(1 + mi, year * 12));
			totalPayment = monthlyPayment * year * 12;
			System.out.println("The monthly payment is: " + (int)(monthlyPayment * 100) / 100.0);
			System.out.println("The total payment is: " + (int)(totalPayment * 100) / 100.0);
		}*/
		
		//5.22
		/*Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount = input.nextDouble();
		System.out.print("Number of Years: ");
		int year = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double rate = input.nextDouble();
		double mi = rate / 1200;
		double monthlyPayment = 0, totalPayment = 0;
		double interest = 0, principal = 0, balance = amount;
		monthlyPayment = amount * mi / (1 - 1 / Math.pow(1 + mi, year * 12));
		totalPayment = monthlyPayment * year * 12;
		System.out.println("The monthly payment is: " + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is: " + (int)(totalPayment * 100) / 100.0);
	    for(int i = 1; i <= year * 12; i++) {
	    	interest = mi * balance;
	    	principal = monthlyPayment - interest;
	    	balance = balance - principal;
	    	System.out.println(i + "\t" + interest + "\t" +
	    	                   principal + "\t" + balance);
	    }*/
		
		//5.25
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter i: ");
		int i = input.nextInt();
		double pi = 0;
		for(int j = 1; j <= i; j++) {
			pi = pi + 4 * (Math.pow(-1, j + 1) * 1.0 / (2 * j - 1));
		}
		System.out.println(pi);*/
		
		//5.26
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter i: ");
		int i = input.nextInt();
		double e = 1, item = 1;
		for(int j = 1; j <= i; j++) {
			item /= j;
			e += item;
		}
		System.out.println(e);*/
		
		//5.27
		/*int totalYears = 0;
		for(int year = 101; year <= 2100; year++) {
			if((year % 4 == 0 && year % 100 != 0) || (year % 400) == 0) {
				System.out.print(year + " ");
			    totalYears++;
			    if(totalYears % 10 == 0) System.out.println();
			}
		}
		System.out.println(totalYears);*/
		
		//5.28
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the weekday of the first day: ");
		int week = input.nextInt();
		for(int i = 1; i < 13; i++) {
			int month = 1;
		    if(month == 1 || month == 2) {
			    month = month + 12;
			    year = year - 1;
		    }
		    int h = (int)(1 + 26*(month + 1) / 10 + year % 100 + 
				    year % 100 / 4 + year / 400 + year / 20) % 7;
		    String s = null;
		    switch(h) {
			case 0:s = "Saturday"; break;
			case 1:s = "Sunday"; break;
			case 2:s = "Monday"; break;
			case 3:s = "Tuesday"; break;
			case 4:s = "Wednesday"; break;
			case 5:s= "Thursday"; break;
			case 6:s="Friday"; break;
			default: break;
			}
		    System.out.println("2013 " + i + " 1 is " + s);
		}*/
		
		//5.29
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the weekday of the first day: ");
		int week = input.nextInt();
		int maxDay = 0;	
		int firstDay = 0;	
		int currentDay = 0;
		String str = year + "-1-1";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(str);	//将字符串转化为指定的日期格式
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);	//将日期转化为日历
		maxDay = calendar.getActualMaximum(Calendar.DATE);	//当前日期中当前月对应的最大天数
		calendar.set(Calendar.DATE, 1); // 设置为当前月的第一天
		firstDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		for(int i = 1; i < firstDay; i++) {
			System.out.print("\t");
		}
		for(int j = 1; j <= maxDay; j++) {
			if(j < 10) {
			    System.out.print("  " + j + "\t");
			}
			else {
				System.out.print(" " + j + "\t");
			}
			if((j - (8 - firstDay)) % 7 == 0) {
				System.out.println();
			}
		}
		
		//5.32
		/*int lottery1 = (int)(Math.random() * 10);
		int lottery2 = 1;
		while(true) {
			lottery2 = 1 + (int)(Math.random() * 9);
			if(lottery1 != lottery2) break;
		}
		int lottery = 10 * lottery2 + lottery1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick: ");
		int guess = input.nextInt();
		int ld1 = lottery / 10;
		int ld2 = lottery % 10;
		int gd1 = guess / 10;
		int gd2 = guess % 10;
		System.out.println("The lottery number is " + lottery);
		if(guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		}
		else if(gd2 == ld1 && gd1 == ld2) {
			System.out.println("Match all digits: you win $3,000");
		}
		else if(gd1 == ld1 || gd1 == ld2 || gd2 == ld1 || gd2 == ld2) {
			System.out.println("Match on digit: you win $1,000");
		}
		else {
			System.out.println("Sorry, no match");
		}*/
		
		//5.33
		/*int i, j;
		int total = 0;
		for(i = 2; i <= 10000; i++) {
			for(j = 1; j <= i / 2; j++) {
				if(i % j == 0) total += j;
			}
			if(total == i) {
				System.out.println(i);
			}
			total = 0;
		}*/
		
		//5.36
		/*Scanner input = new Scanner(System.in);
		String isbn = input.nextLine();
		int total = 0;
		for(int i = 0; i < 9; i++) {
			String str = String.valueOf(isbn.charAt(i));
			total += Integer.parseInt(str) * i;
		}
		if(total % 11 == 10) {
			System.out.println(isbn + 'X');
		}
		else {
			System.out.println(isbn);
		}*/
		
		//5.37
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		String binary = "";
		String str = "";
		while(decimal != 0) {
			int n = decimal % 2;
			str += n + "";
			decimal /= 2;
		}
		char[] c = str.toCharArray();
		for(int i = c.length - 1; i >= 0; i--) {
			binary = binary + c[i];
		}
		System.out.println(binary);*/
		
		//5.38
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		String octal = "";
		String str = "";
		while(decimal != 0) {
			int n = decimal % 8;
			str += n + "";
			decimal /= 8;
		}
		char[] c = str.toCharArray();
		for(int i = c.length - 1; i >= 0; i--) {
			octal = octal + c[i];
		}
		System.out.println(octal);*/
		
		//5.45
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enthe 10 numbers: ");
		double[] array = new double[10];
		double t1 = 0, t2 = 0, average = 0, deviation = 0;
		int i;
		for(i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}
		for(i = 0; i < 10; i++) {
			t1 += array[i];
			t2 += array[i] * array[i];
		}
		average = t1 / 10;
		deviation = Math.sqrt((t2 - (t1 * t1) / 10) / 9);
		System.out.println("The mead is " + average);
		System.out.println("The standard deviation is " + deviation);*/
		
	}

}
