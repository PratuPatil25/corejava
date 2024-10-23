package array;

public class copy {

	public static void main(String[] args) {
		//  create md array making copy and print both original and copy array
		
		int num[][]= {
				 {89,60,57},
				 {88,90,80},
				 {66,99,88}
		     };
		// System.out.println(marks[2][1]);// for single output
		 
		for(int i=0; i<num.length; i++) 
		 {
			 for(int j=0; j<num[i].length; j++) 
			 {
				 System.out.print(num[i][j]+" ");
				 
			 }
			 System.out.println();
		 }
		
		int clone[][]=num.clone();
		System.out.println(num[0]);
		System.out.println(clone[0]);
		System.out.println(num[1]==clone[1]);
		
	}

}
