package exceptionDemo;

public class TrycatchDemo {

	public static void main(String[] args) {
		int a=10;
		for(int i=3;i>=0;i--)
			try//below code may raise an exception
		{
			System.out.println(a/i);
		}
		catch(Exception e)
		{
			//System.out.println(e);
			System.out.println("Something went wrong");
		}

	}

}
