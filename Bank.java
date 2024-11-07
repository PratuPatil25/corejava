package tasks;

public class Bank {

	 double amount; 
	
	 Bank(double amount)
	 {
		this.amount =  amount;
	 }
	 
	  void Withdraw (double WithdrawalAmount)
	 {
		String msg = (WithdrawalAmount <= amount )  ? "Withdraw Successful" : "Blanace is insufficient ";
		System.out.println(msg);
		
		if(WithdrawalAmount<=amount) {
			amount = amount-WithdrawalAmount;
		}
	 }	 
	 
	  void deposite (double depositeAmount)
	 {
		  amount = amount + depositeAmount;
		  System.out.println("Deposite successfull");
	 }
	  void display() 
	  {
		  System.out.println("Toatl Balance: "+amount);
	  }
		 
		 
		public static void main(String[] args) {
			
			Bank b = new Bank(10000);
			
            b.Withdraw(1000);
            b.deposite(5000);
            b.display();
		}

	}

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	