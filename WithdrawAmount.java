package exceptionDemo;
//InsufficientFundException is a UserDefined Exception so we should inherit from Exception
class InsufficientFundException extends Exception
{
	private double amount;
	//Parameterised Constructor
	public InsufficientFundException(double amount)
	{
		this.amount=amount;
	}
	//method to get amount
	public double getAmount()
	{
		return amount;
	}
	
}
class CheckingAccount
{
	private double balance;
	private int number;
	//Constructor
	public CheckingAccount(int number)
	{
		this.number=number;
	}
	//method to deposit
	public void Deposit(double amount)
	{
		balance+=amount;
	}
	//method to withdraw
	public void Withdraw(double amount)throws InsufficientFundException
	{
		if(amount<=balance)
		{
			balance-=amount;
		}
		else
		{
			double needs=amount=balance;
			throw new InsufficientFundException(needs);
		}
	}
	
	
	
}
public class WithdrawAmount {

	public static void main(String[] args) {
		CheckingAccount ca=new CheckingAccount(101);
		System.out.println("Depositing Rs.1000");
		ca.Deposit(1000.00);
		System.out.println("Depositing Rs.400");
		ca.Deposit(400.00);
		try
		{
			System.out.println("Withdrawing Rs.1000");
			ca.Withdraw(1000.00);
			System.out.println("Withdrawing Rs.500");
			ca.Withdraw(500.00);
			
		}
		catch(InsufficientFundException e)
		{
			System.out.println("Oops!!!You have no Sufficient Balance to Retrieve: "+e.getAmount());
		}

	}

}
