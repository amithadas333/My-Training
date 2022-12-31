package exception;

public class Arithmetic 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You can’t divide a number by zero");
		}
	}
}

