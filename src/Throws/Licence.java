package Throws;

public class Licence 
{
	static int age=28;//static variable
	public static void licence()//static method
	{
		if(age<=18)
		{
			throw new ArithmeticException("Not eligible for voting");//throw keyword
	     }
		else
		{
			System.out.println("Eligible for voting");
		}
	}

	public static void main(String[] args)
	{
		Licence.licence();//calling static method

	}

}
