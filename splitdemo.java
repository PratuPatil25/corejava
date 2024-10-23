package Stringdemo1;

public class splitdemo {

	public static void main(String[] args) {
		// create split operation
		String s="learning java programmimg laguage with anudip foundation";
		//split
		String result[]=s.split(" ");
		System.out.println("Result is:");
		for(String str:result)
		{
			System.out.println(str+",");
		}
	}

}
