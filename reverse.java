package tasks;

public class reverse {

	public static void main(String[] args) {
		// create the array and reverse the array
		
		int a[]= {45,65,78,96,32,12};
		
		System.out.println("Array elemnts");
		
		for(int  i=0; i<a.length ;i++)
		{
			System.out.println(a[i]);	
		}
		
		
		System.out.println("reverse Array elemnts");
		for(int  i=0; i<a.length/2;i++) 
		{
			int temp =a[i];
			a[i]=a[a.length -1-i];
			a[a.length -1-i]=temp;
		}
		for(int  i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
