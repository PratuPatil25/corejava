package Stringdemo1;

public class stringbuilderdemo {

	public static void main(String[] args) {
		//  StringBuilder

		 StringBuilder str=new  StringBuilder("Learning java development");

		System.out.println(str);

		str.insert(1, 'e');

		System.out.println(str);

		str.append(" with anudip foundation");

		System.out.println(str);

		str.delete(16, 23);

		System.out.println(str);

		str.replace(8, 12, "to ");

		System.out.println(str);

	}

}
