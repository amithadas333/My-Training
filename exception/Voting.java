package exception;

public class Voting 
{
	public static void vote(int age) throws ArithmeticException//throws method
	{
		if(age<40)
			throw new ArithmeticException("Not Eligible for voting");//throw keyword
		else
		{
			System.out.println("Eligible for voting");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
		vote(20);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
	