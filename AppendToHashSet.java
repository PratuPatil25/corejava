package Lab7;

import java.util.HashSet;

public class AppendToHashSet {

	public static void main(String[] args) {
		 HashSet<Integer> set = new HashSet<>();
		 
		 set.add(10);
		 set.add(20);
		 set.add(25);
		 
		 System.out.println("Before appending: " + set);
		 
		 set.add(27);
		 
		 System.out.println("After appending: " + set);
		 

	}

}
