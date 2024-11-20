package Lab7;

import java.util.Stack;

public class Stackex {

	public static void main(String[] args) {
		 Stack<Integer> s = new Stack<>();
		 
		 for (int i = 1; i <= 10; i++) {
	            s.push(i);
	        }

	        
	        System.out.println(" adding 10 elements: " + s);
	        
	        
	        for (int i = 0; i < 4; i++) {
	            if (!s.isEmpty()) {
	                s.pop();
	            }
	        }

	        System.out.println(" removing 4 elements: " + s);
	}

}
