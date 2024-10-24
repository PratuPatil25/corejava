package tasks;

import java.util.Arrays;


public class arrdecsending {

	public static void main(String[] args) {
		//sort array in descending order
        int p[]= {5,6,7,2,4,9,3};
        
        System.out.println("Array element"); 
        for(int i=0; i<p.length; i++)
        {
        	System.out.println(p[i]);
        }
        
        System.out.println("descending Array elemnts");
        
       Arrays.sort(p);
       System.out.println(Arrays.toString(p));
	}
		

}
