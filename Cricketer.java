package Lab8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Cricketer {

	public static void main(String[] args) {
		
		Map<String,Integer> m=new LinkedHashMap<>();
		
		m.put("Virat Kholi", 120);
		m.put("Rohit Sharma", 140);
		m.put("MS Dhini", 100);
		m.put("Sachin T", 200);
		
		System.out.println(" Cricketers: "+m);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Cricketer name");
		 String name = sc.nextLine();
		 
		 if(m.containsKey(name)) {
			 System.out.println(name + " score :" +m.get(name));
		 }else {
			 System.out.println("Record not found");
		 }
	}

}
