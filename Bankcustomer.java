package Lab3;

//Assignment 1
public class Bankcustomer {

	 int acno;
     String actype;
     double amount;
     
     Bankcustomer( int acno, String actype, double amount)
     {
    	this.acno=acno;
    	this.actype=actype;
    	this.amount=amount;
     }
     
     void display()
     {
    	 System.out.println("account no: "+acno+" "+"Account Type: "+actype+" "+ "Total Amount: "+amount);
     }
     
	public static void main(String[] args) {
		Bankcustomer C1=new Bankcustomer(25485455,"Saving Account",50000);
		Bankcustomer C2=new Bankcustomer(54457875,"Salary Account",60000);
		Bankcustomer C3=new Bankcustomer(86461259,"Current Account",30000);
		
        C1.display();
        C2.display();
        C3.display();
    
	}

}
