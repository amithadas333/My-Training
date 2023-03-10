package BankDetails;

public class Bank 
{
	static int depositeamount=2000;
	static int withdrawamount=1000;
	static int mainbalance=8000;
	public static void depositeAmount()
	{
		System.out.println("My deposite amount is: " +depositeamount);
	}
	public static void withdraw()
	{
		System.out.println("Withdraw amount is:" +withdrawamount);
	}
	
	public static void currentBalance()
	{
		System.out.println("My account balance is: " +(depositeamount-withdrawamount));
	}
	public static void Balance()
	{
	  if(withdrawamount<mainbalance)
	  {
		  
		  System.out.println("You are eligible for withdraw the money");
	  }
	  else
	  {
		  System.out.println("You are not eligible for withdraw the money");
	  }
	}

	public static void main(String[] args) 
	{
		Bank.depositeAmount();
		Bank.withdraw();
		Bank.currentBalance();
		Bank.Balance();

	}

}
