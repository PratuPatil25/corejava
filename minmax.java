package tasks;

public class minmax {

	public static void main(String[] args) {
		//find the minimum and maximum element in array 
      int arr[]= {10,20,35,25,30,5};
      
      
      System.out.println("Array Elements");
		int max = arr[0];
		int min = arr[0];
		
		for(int  i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
			 if (arr[i] > max) {
				 max = arr[i];
	            }
		    		
				 if (arr[i] < min) {
		               min= arr[i];
		            }
			
		}
		System.out.println("maximum No is " + max);
		System.out.println("minimum No is " + min);
		
		
	}
}
