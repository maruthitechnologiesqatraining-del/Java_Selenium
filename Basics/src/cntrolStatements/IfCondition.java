package cntrolStatements;

import java.util.Scanner;

public class IfCondition {
	//•	Java Program to Determine Whether a Number is Even or Odd 
	
	public static void main(String[] args) {
		
		int a=10;
		a=21;
		if (a%2==0) {
			System.out.println(a+" is even nuber");
		}
		else {
			System.out.println(a+" is Odd nuber");
		}
		IfCondition cond = new IfCondition();
		cond.findLargestThreeNumber();
		cond.writeWeekdays();
		cond.typeCasting();
	}
	
	
	//•	Java Program to Determine the Largest of Three Numbers 
	
	public void findLargestThreeNumber() {
		
			int a=21; int b=23; int c=34;
			
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Enter a value");	
//			int a = scanner.nextInt();
//			
//			System.out.println("Enter b value:");	
//			int b = scanner.nextInt();
//			
//			System.out.println("Enter c value");	
//			int c = scanner.nextInt();
//			
			if(a>b && a>c) {
				
				System.out.println(a+" largets value");
			}
			if (a<b && c<b) {
				System.out.println(b+" is larget number");
			}
			else {
				System.out.println(c+" is larget number");
			}
	}
	
	public void writeWeekdays() {
		int day = 2;
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
			break;
			
		}
	}

	public void typeCasting() {
		
		int a=10;
		System.out.println("Int to float value :"+(float)a);
		
		double x= 3837899.34;
		System.out.println("Double vaue is converted to int: "+(int)x);
		char b='x';
		
		System.out.println("char is converted to int: "+(int)b);
	}
	
}
