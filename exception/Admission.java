package exception;

public class Admission 
{
	public static void eligible(int score)//custom method in the class
	{
		if(score<40)
			throw new ArithmeticException("Students are not eligible for admission");//throw keyword
		else
		{
			System.out.println("Students are eligible for admission");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
		eligible(60);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
