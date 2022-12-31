package exception;

class ExceptionDemo 
{
public static void vote(int a) throws InvalidAgeException
{
	if(a>18)
	{
		throw new InvalidAgeException("Age is not matching");
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
		vote(50);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
