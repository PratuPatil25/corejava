package tasks;

public class stringdemo {

	public static void main(String[] args) {
		// Create string and perform operations concatination ,IndexOf,charAt,compare,equal operation
		String s1= "we are programer";
		String s2= " Wellcome to programming word";
		
		//concatination 
		System.out.println(s1.concat(s2));
		
		//IndexOf
		System.out.println(s1.indexOf("p"));
        
		//charAt
		System.out.println(s1.charAt(5));	
		
		//compare
		System.out.println(s1.compareTo(s2));
		
		//equal
		System.out.println(s1==s2);
	}

}