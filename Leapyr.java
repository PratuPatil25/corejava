package Lab3;

import java.util.Scanner;

public class Leapyr {
		public static void main(String[] args) {
			//  Leap Year Check Assignment 5
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
              
		}

}
