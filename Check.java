package Lab8;

import java.util.HashMap;

public class Check {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		
		if(map.isEmpty()) {
			System.out.println("The hasmap is empty");
		}else {
			System.out.println("The hasmap is not empty");
		}
		
		System.out.println("hashmap list"+map);
	}

}
