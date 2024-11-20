package Lab8;

import java.util.HashMap;

public class Hashmapex {

	public static void main(String[] args) {
		
		HashMap< String ,Integer> H = new HashMap<>();
		
		H.put("id", 101);
		H.put("rollno", 25);
		H.put("marks", 95);
		
		System.out.println("Entries:"+H.entrySet());
	
		H.put("marks", 98 );
		
		System.out.println("Entries:"+H.entrySet());
		
	}

}
