package Stringdemo1;

public class splitdemo {

	public static void main(String[] args) {
		// create split operation
		String s="learning java programmimg ";
		//split
		char[] charArray = s.toCharArray();
		System.out.println("Result is:");
		for(char c:charArray)
		{
			System.out.print(c +",");
		}
	}

}
