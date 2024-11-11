package Lab3;

class user{

    int id;
    String name;
  
    	public user(int id, String name) {
    		this.id = id;
    		this.name = name;
    	}
	}


	class Emp extends user {
		double Salary;
   
			public Emp(int id, String name, double Salary) {
				super(id, name);
				this.Salary = Salary;
			}
   
			public double calannualsalary() {
				return Salary * 12;
			}
	}

	public class empdetail {

	
		public static void main(String[] args) {
		  	  Emp e1 = new Emp(101, "Pratiksha", 50000);
		  	  double annualSalary = e1.calannualsalary();
		  
		  	  System.out.println("Employee ID: " + e1.id);
		  	  System.out.println("Employee Name: " + e1.name);
		  	  System.out.println("Employee Salary: " + e1.Salary);
		  	  System.out.println("Employee Annual Salary: " + annualSalary);

	}

}
