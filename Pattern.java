package tasks;

public class Pattern {

	public static void main(String[] args) {
		// program to print pattern
		
		int a= 5;
		
		for(int i=1; i<=a; i++) {
			
			for(int j=1; j<=a-i; j++) 
			{
				
				System.out.print(" ");	
			}
			for(int k=1; k<=i; k++) 
			{
				System.out.print("*"+"");
			}
			System.out.println();
		}
	}

}
