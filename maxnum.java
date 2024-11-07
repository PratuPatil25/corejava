package tasks;

import java.util.Scanner;

public class maxnum {

	public static void main(String[] args) {
		// Program to input 2 number and find the maximum between number 
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the First numbers: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second numbers: ");
		int b=sc.nextInt();
		
		int max =(a > b) ? a : b;
		
		System.out.println("The maximum number is: "+ max);
				
	}
	

}
