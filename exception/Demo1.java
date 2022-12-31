package exception;

public class Demo1 
{

	public static void vote(int a) throws DemoException
	{
		if(a<18)
		{
			throw new DemoException("Age is not matching");
		}
		else
		{
			System.out.println("Age is matching");
		}
	}

	public static void main(String args[])
	{
		try
		{
			vote(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}
