	package lab6;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	
	public class ReverseStringList {
	
		public static void main(String[] args) {
			List<String> stringList = new ArrayList<>();
	        stringList.add("Java");
	        stringList.add("Python");
	        stringList.add("C++");
	        stringList.add("JavaScript");
	        stringList.add("Ruby");
	
	        
	        System.out.println("Original List: " + stringList);
	
	        
	        Collections.reverse(stringList);
	
	  
	        System.out.println("Reversed List: " + stringList);	
	
		}
	
	}
