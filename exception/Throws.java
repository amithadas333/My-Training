package exception;

public class Throws 
{
	public static void result(int a,int b)throws ThrowException
	{
		int c;
		c=a+b;
		throw new ArithmeticException("The result is " +c);
		
	}

	public static void main(String[] args) throws ThrowException
	{
		try
		{
			result(10,20);
		}
		catch(ArithmeticException e)
		{
		
			System.out.println("The number is negative"+e);

		}
		System.out.println("The number is positive");
	}

}
