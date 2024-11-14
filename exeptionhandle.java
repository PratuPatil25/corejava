package lab5;


public class exeptionhandle {
	static void fun()throws ArrayIndexOutOfBoundsException
	{
		
	}

	public static void main(String[] args) {
       
		int a[] = {1,2,3,4,5};
 	   
 	   for(int i=0; i<=0; i++) 
 		   
         try 
       {
        	 System.out.println(a[6]);
       }
 	    catch(ArrayIndexOutOfBoundsException e) {
 	    	
 	    	System.out.println(e+"!!!oops!!");
 	    }
        
	}

}
