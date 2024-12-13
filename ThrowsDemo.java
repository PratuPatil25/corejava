package exceptionDemo;

import java.util.Scanner;

public class ThrowsDemo {
	static void fun(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		System.out.println(10/a);
		int arr[]= {1,2,3};
		System.out.println(arr[b]);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try
		{
		fun(in.nextInt(),in.nextInt());
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("oops!!Something went wrong");
		}

	}

}
