package Lab3;

public class Employee {

	//Assignment:2
	static int eid;
	static String ename;
	static String companyname;
	
	
       static void display(int eid, String ename,String companyname ) 
       {
    	   System.out.println("Employee id is "+eid+" , "+ "Employee name is "+ename+" , "+"Company name is "+companyname);
       }
       
       
	public static void main(String[] args) {
		// Create emp details eid,ename,companyname using static variable and static method
		display(101,"Pratiksha","Wipro");
		display(102,"Harsh","Sunfarma");
		display(103,"Sakshi","TCS");

	}

}





