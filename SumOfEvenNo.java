package lab6;

import java.util.ArrayList;

public class SumOfEvenNo {

	public static void main(String[] args) {
		 ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);
	        numbers.add(25);
	        numbers.add(30);

	        int sum = 0;

	       
	        for (int number : numbers) {
	            
	            if (number % 2 == 0) {
	                sum += number; 
	            }
	        }

	        System.out.println("Sum of even numbers: " + sum);

	}

}
