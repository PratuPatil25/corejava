package Lab3;
import java.util.Scanner;
//Assignment:3

public class Perimeter {
	public static double squarePerimeter(double side) {
        return 4 * side;
	    }

	   
	 public static double rectanglePerimeter(double length, double width) {
	        return 2 * (length + width);
	    }

	   
	 public static double circlePerimeter(double radius) {
	        return 2 * Math.PI* radius;
	    }

	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
		        int choice;
		        boolean exit = false;
	        
		        while (!exit) {
		            System.out.println("\nChoose an option to calculate the perimeter:");
		            System.out.println("1. Square");
		            System.out.println("2. Rectangle");
		            System.out.println("3. Circle");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    
		                	
		                    System.out.print("Enter the  length of the square: ");
		                    double side = scanner.nextDouble();
		                    double squarePerimeter = squarePerimeter(side);
		                    System.out.println("Perimeter of the square: " + squarePerimeter);
		                    break;

		                case 2:
		                    
		                    System.out.print("Enter the length of the rectangle: ");
		                    double length = scanner.nextDouble();
		                    System.out.print("Enter the width of the rectangle: ");
		                    double width = scanner.nextDouble();
		                    double rectanglePerimeter = rectanglePerimeter(length, width);
		                    System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
		                    break;

		                case 3:
		                    
		                    System.out.print("Enter the radius of the circle: ");
		                    double radius = scanner.nextDouble();
		                    double circlePerimeter = circlePerimeter(radius);
		                    System.out.println("Perimeter  of the circle: " + circlePerimeter);
		                    break;

		                case 4:
		                    
		                    System.out.println("Exit");
		                    exit = true;
		                    break;

		                default:
		                    System.out.println("Invalid  Please select again.");
		                    break;
		            }
		        }
		        scanner.close();
		    }
}

