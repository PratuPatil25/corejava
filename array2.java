package array;

public class array2 {
	
       public static void main(String[] args) {
    	   int num[]=new int[10];
    		num[0]=25;
    		num[1]=26;
    		num[2]=10;
    		num[3]=40;
    		num[4]=55;
    		num[5]=22;
    		num[6]=66;
    		num[7]=63;
    		num[8]=53;
    		num[9]=99;
    		
    		System.out.println("Array Elements");
    		int largest = num[0];
    		
    		for(int  i=0;i<num.length;i++)
    		{
    			System.out.println(num[i]);
    			
    			 if (num[i] > largest) {
    	                largest = num[i];
    	            }
    		    			
    			
    		}
    		System.out.println("Largest No is " + largest);
    }


}
