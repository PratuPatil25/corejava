package Lab3;

public class Pattern2 {
 

		public static void main(String[] args) {
			//Assignment:4
	         int a= 5;
			
			for(int i=0; i<a; i++) {
				
				for(int j=0; j<i ; j++) 
				{
					
					System.out.print(" ");	
				}
				for(int k=0; k<(a-i);k++) {
					
					System.out.print("* ");
				}
				
				System.out.println();
			}


	}

}
