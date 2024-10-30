package tasks;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// Write a Program to Calculate Area and Perimeter of a square.
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the lenth of sqare ");
      int side = sc.nextInt();
      
      int area = side* side;
      
      int perimeter = 4 * side;
      
      System.out.println("Area of the square "+area);
      System.out.println("perimeter of the square "+perimeter);
      
	}

}
